package quickfix;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * <p>
 * Two Executors are required. The {@link #getLongLivedExecutor()} is used for message processing and the
 * {@link #getShortLivedExecutor()} is used for timer tasks. They can both be the same underlying Executor if desired.
 * Separating them allows for additional control such as with a ResourceAdapter WorkManager where the WorkManager
 * differentiates between short and long lived Work.
 * </p>
 * <p>
 * By way of example, a single {@link Executors#newCachedThreadPool()} satisfies the requirements but really adds
 * nothing over the default behavior.
 * </p>
 */
public interface ExecutorFactory {

	/**
	 * The message processing activities are long-lived so this Executor must have sufficient distinct Threads available
	 * to handle all your Sessions. The exact number will depend on how many concurrent Sessions you will have and
	 * whether you are using the Threaded or non-Threaded SocketAcceptors/Initiators.
	 */
	Executor getLongLivedExecutor();

	/**
	 * The timer tasks are short-lived and only require one Thread (calls are serialized).
	 */
	Executor getShortLivedExecutor();

}
