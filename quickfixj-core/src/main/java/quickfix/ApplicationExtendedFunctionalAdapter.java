package quickfix;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * This is an adapter implementation of ApplicationExtended interface that transforms the usage into more
 * functional style. It breaks down each interface method into a number of single-method interfaces, which can be
 * supplied with lambda expressions. Each single-method interface has its own add and remove listener method.
 *
 * <ol>
 *     <li>Support multiple listeners of the same operation, e.g. onLogon. The method of the listeners will be invoked
 *     in the same order of when add method was invoked, i.e. FIFO</li>
 *     <li>Support fail fast evaluation of canLogOn listeners. False will be returned for the first false value returned
 *     from the predicate of canLogOn. Otherwise return true.</li>
 *     <li>Provides a thread-safe way to delegate to, add and remove listeners under the assumption that adding and
 *     removing listeners are rare.</li>
 * </ol>
 */
public class ApplicationExtendedFunctionalAdapter extends ApplicationFunctionalAdapter implements ApplicationExtended {
    private final List<Predicate<SessionID>> canLogonPredicates = new CopyOnWriteArrayList<>();
    private final List<Consumer<SessionID>> onBeforeSessionResetListeners = new CopyOnWriteArrayList<>();

    /**
     * Add a Predicate of Session to the canLogon evaluation.
     *
     * @param canlogon the Predicate of Session to the canLogon evaluation.
     */
    public void addCanLogOnPredicate(Predicate<SessionID> canlogon) {
        canLogonPredicates.add(canlogon);
    }

    /**
     * Remove a Predicate of Session from the canLogon evaluation.
     *
     * @param canlogon the Predicate of Session to the canLogon evaluation.
     */
    public void removeCanLogOnPredicate(Predicate<SessionID> canlogon) {
        canLogonPredicates.remove(canlogon);
    }

    /**
     * Add a Consumer of SessionID to listen to onBeforeSessionReset operation.
     *
     * @param onBeforeSessionReset the Consumer of SessionID to listen to onBeforeSessionReset operation.
     */
    public void addOnBeforeSessionResetListener(Consumer<SessionID> onBeforeSessionReset) {
        onBeforeSessionResetListeners.add(onBeforeSessionReset);
    }

    /**
     * Remove a Consumer of SessionID from onBeforeSessionReset operation.
     *
     * @param onBeforeSessionReset the Consumer of SessionID to listen to onBeforeSessionReset operation.
     */
    public void removeBeforeSessionResetListener(Consumer<SessionID> onBeforeSessionReset) {
        onBeforeSessionResetListeners.remove(onBeforeSessionReset);
    }

    @Override
    public boolean canLogon(SessionID sessionID) {
        return canLogonPredicates.stream()
                .allMatch(p -> p.test(sessionID));
    }

    @Override
    public void onBeforeSessionReset(SessionID sessionID) {
        onBeforeSessionResetListeners.forEach(c -> c.accept(sessionID));
    }

}
