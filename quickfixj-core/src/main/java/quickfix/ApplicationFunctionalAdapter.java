package quickfix;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * This is an adapter implementation of Application interface that transforms the usage into more functional style.
 * It breaks down each interface method into a number of single-method interfaces, which can be supplied with lambda
 * expressions. Each single-method interface has its own add and remove listener method.
 *
 * <ol>
 * <li>Support multiple listeners of the same operation, e.g. onLogon. The method of the listeners will be invoked
 * in the same order of when add method was invoked, i.e. FIFO</li>
 * <li>Support type-safe listeners to be registered. However, FIFO order is maintained separated for type-safe and
 * generic Message listeners</li>
 * <li>Support fail fast exception propagation for fromAdmin, toApp, and fromApp. The exception will be thrown for
 * the first encountered exception.</li>
 * <li>Provides a thread-safe way to delegate to, add and remove listeners, by the means of concurrent and immutable
 * collections, under the assumption that adding and removing listeners are rare.</li>
 * </ol>
 */
public class ApplicationFunctionalAdapter implements Application {
    private final List<Consumer<SessionID>> onCreateListeners = new CopyOnWriteArrayList<>();
    private final List<Consumer<SessionID>> onLogonListeners = new CopyOnWriteArrayList<>();
    private final List<Consumer<SessionID>> onLogoutListeners = new CopyOnWriteArrayList<>();

    private final List<BiConsumer<Message, SessionID>> toAdminListeners = new CopyOnWriteArrayList<>();
    private final ConcurrentMap<Class, List<BiConsumer>> toAdminTypeSafeListeners = new ConcurrentHashMap<>();

    private final List<FromAdminListener<Message>> fromAdminListeners = new CopyOnWriteArrayList<>();
    private final ConcurrentMap<Class, List<FromAdminListener>> fromAdminTypeSafeListeners = new ConcurrentHashMap<>();

    private final List<ToAppListener<Message>> toAppListeners = new CopyOnWriteArrayList<>();
    private final ConcurrentMap<Class, List<ToAppListener>> toAppTypeSafeListeners = new ConcurrentHashMap<>();

    private final List<FromAppListener<Message>> fromAppListeners = new CopyOnWriteArrayList<>();
    private final ConcurrentMap<Class, List<FromAppListener>> fromAppTypeSafeListeners = new ConcurrentHashMap<>();

    /**
     * Add a Consumer of SessionID to listen to onCreate operation.
     *
     * @param onCreateListener the Consumer of Session for onCreate operation.
     */
    public void addOnCreateListener(Consumer<SessionID> onCreateListener) {
        onCreateListeners.add(onCreateListener);
    }

    /**
     * Remove a Consumer of SessionID from onCreate operation.
     *
     * @param onCreateListener the Consumer of Session for onCreate operation.
     */
    public void removeOnCreateListener(Consumer<SessionID> onCreateListener) {
        onCreateListeners.remove(onCreateListener);
    }

    /**
     * Add a Consumer of SessionID to listen to onLogon operation.
     *
     * @param onLogonListener the Consumer of Session for onLogon operation.
     */
    public void addOnLogonListener(Consumer<SessionID> onLogonListener) {
        onLogonListeners.add(onLogonListener);
    }

    /**
     * Remove a Consumer of SessionID from onLogon operation.
     *
     * @param onLogonListener the Consumer of Session for onLogon operation.
     */
    public void removeOnLogonListener(Consumer<SessionID> onLogonListener) {
        onLogonListeners.remove(onLogonListener);
    }

    /**
     * Add a Consumer of SessionID to listen to onLogout operation.
     *
     * @param onLogoutListener the Consumer of Session for onLogout operation.
     */
    public void addOnLogoutListener(Consumer<SessionID> onLogoutListener) {
        onLogoutListeners.add(onLogoutListener);
    }

    /**
     * Remove a Consumer of SessionID from onLogout operation.
     *
     * @param onLogoutListener the Consumer of Session for onLogout operation.
     */
    public void removeOnLogoutListener(Consumer<SessionID> onLogoutListener) {
        onLogoutListeners.remove(onLogoutListener);
    }

    /**
     * Add a BiConsumer of SessionID to listen to toAdmin operation.
     *
     * @param toAdminListener the BiConsumer of Session for toAdmin operation.
     */
    public void addToAdminListener(BiConsumer<Message, SessionID> toAdminListener) {
        toAdminListeners.add(toAdminListener);
    }

    /**
     * Add a type-safe BiConsumer of SessionID to listen to toAdmin operation.
     *
     * @param clazz           the specific Message class the listener expects
     * @param toAdminListener the BiConsumer of Session for toAdmin operation.
     */
    public <T extends Message> void addToAdminListener(Class<T> clazz, BiConsumer<T, SessionID> toAdminListener) {
        getList(toAdminTypeSafeListeners, clazz)
                .add(toAdminListener);
    }

    /**
     * Remove a BiConsumer of SessionID from toAdmin operation.
     *
     * @param toAdminListener the BiConsumer of Session for toAdmin operation.
     */
    public <T extends Message> void removeToAdminListener(BiConsumer<T, SessionID> toAdminListener) {
        toAdminListeners.remove(toAdminListener);
        toAdminTypeSafeListeners
                .values()
                .forEach(list -> list.remove(toAdminListener));
    }

    /**
     * Add a listener of fromAdmin operation.
     *
     * @param fromAdminListener the listener of fromAdmin operation.
     */
    public void addFromAdminListener(FromAdminListener<Message> fromAdminListener) {
        fromAdminListeners.add(fromAdminListener);
    }

    /**
     * Add a listener of fromAdmin operation.
     *
     * @param clazz             the specific Message class the listener expects
     * @param fromAdminListener the listener of fromAdmin operation.
     */
    public <T extends Message> void addFromAdminListener(Class<T> clazz, FromAdminListener<T> fromAdminListener) {
        getList(fromAdminTypeSafeListeners, clazz)
                .add(fromAdminListener);
    }

    /**
     * Remove a listener of fromAdmin operation.
     *
     * @param fromAdminListener the listener of fromAdmin operation.
     */
    public <T extends Message> void removeFromAdminListener(FromAdminListener<T> fromAdminListener) {
        fromAdminListeners.remove(fromAdminListener);
        fromAdminTypeSafeListeners
                .values()
                .forEach(list -> list.remove(fromAdminListener));
    }

    /**
     * Add a listener of toApp operation.
     *
     * @param toAppListener the listener of fromAdmin operation.
     */
    public void addToAppListener(ToAppListener<Message> toAppListener) {
        toAppListeners.add(toAppListener);
    }

    /**
     * Add a listener of toApp operation.
     *
     * @param clazz         the specific Message class the listener expects
     * @param toAppListener the listener of fromAdmin operation.
     */
    public <T extends Message> void addToAppListener(Class<T> clazz, ToAppListener<T> toAppListener) {
        getList(toAppTypeSafeListeners, clazz)
                .add(toAppListener);
    }

    /**
     * Remove a listener of toApp operation.
     *
     * @param toAppListener the listener of toApp operation.
     */
    public <T extends Message> void removeToAppListener(ToAppListener<T> toAppListener) {
        toAppListeners.remove(toAppListener);
        toAppTypeSafeListeners
                .values()
                .forEach(list -> list.remove(toAppListener));
    }

    /**
     * Add a listener of fromApp operation.
     *
     * @param fromAppListener the listener of fromApp operation.
     */
    public void addFromAppListener(FromAppListener<Message> fromAppListener) {
        fromAppListeners.add(fromAppListener);
    }

    /**
     * Add a listener of fromApp operation.
     *
     * @param clazz           the specific Message class the listener expects
     * @param fromAppListener the listener of fromApp operation.
     */
    public <T extends Message> void addFromAppListener(Class<T> clazz, FromAppListener<T> fromAppListener) {
        getList(fromAppTypeSafeListeners, clazz)
                .add(fromAppListener);
    }

    /**
     * Remove a listener of fromApp operation.
     *
     * @param fromAppListener the listener of fromApp operation.
     */
    public <T extends Message> void removeFromAppListener(FromAppListener<T> fromAppListener) {
        fromAppListeners.remove(fromAppListener);
        fromAppTypeSafeListeners
                .values()
                .forEach(list -> list.remove(fromAppListener));
    }

    @Override
    public void onCreate(SessionID sessionId) {
        onCreateListeners.forEach(c -> c.accept(sessionId));
    }

    @Override
    public void onLogon(SessionID sessionId) {
        onLogonListeners.forEach(c -> c.accept(sessionId));
    }

    @Override
    public void onLogout(SessionID sessionId) {
        onLogoutListeners.forEach(c -> c.accept(sessionId));
    }

    @Override
    public void toAdmin(Message message, SessionID sessionId) {
        toAdminListeners.forEach(c -> c.accept(message, sessionId));
        getList(toAdminTypeSafeListeners, message.getClass())
                .forEach(c -> c.accept(message, sessionId));
    }

    @Override
    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        for (FromAdminListener<Message> listener : fromAdminListeners) {
            listener.accept(message, sessionId);
        }

        for (FromAdminListener listener : getList(fromAdminTypeSafeListeners, message.getClass())) {
            listener.accept(message, sessionId);
        }

    }

    @Override
    public void toApp(Message message, SessionID sessionId) throws DoNotSend {
        for (ToAppListener<Message> listener : toAppListeners) {
            listener.accept(message, sessionId);
        }

        for (ToAppListener listener : getList(toAppTypeSafeListeners, message.getClass())) {
            listener.accept(message, sessionId);
        }
    }

    @Override
    public void fromApp(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        for (FromAppListener<Message> listener : fromAppListeners) {
            listener.accept(message, sessionId);
        }

        for (FromAppListener listener : getList(fromAppTypeSafeListeners, message.getClass())) {
            listener.accept(message, sessionId);
        }
    }

    private <T> List<T> getList(ConcurrentMap<Class, List<T>> multimap, Class clazz) {
        return multimap.computeIfAbsent(clazz, k -> new CopyOnWriteArrayList<>());
    }

}
