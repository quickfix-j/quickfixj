/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/
package quickfix.test.util;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import org.slf4j.Logger;

public class StackTraceUtil {

    private static final String DEADLOCKED_THREADS_STRING = "DEADLOCKED threads:" + System.lineSeparator();

    private StackTraceUtil() {
    }

    /**
     * Prints stack traces for all threads via System.out.
     */
    public static void dumpStackTraces() {
        ThreadInfo[] threadInfos = getThreadInfos();
        printThreadInfo(threadInfos, null);
        ThreadInfo[] deadlockedThreads = findDeadlockedThreads(null);
        printThreadInfo(deadlockedThreads, null);
    }

    /**
     * Prints stack traces for all threads via passed Logger.
     *
     * @param log Logger instance to use
     */
    public static void dumpStackTraces(Logger log) {
        ThreadInfo[] threadInfos = getThreadInfos();
        printThreadInfo(threadInfos, log);
        ThreadInfo[] deadlockedThreads = findDeadlockedThreads(log);
        printThreadInfo(deadlockedThreads, log);
    }

    private static void printThreadInfo(ThreadInfo[] threadInfos, Logger log) {
        for (ThreadInfo threadInfo : threadInfos) {
            if (log != null) {
                log.error(threadInfo.toString());
            } else {
                System.out.println(threadInfo.toString());
            }
        }
    }

    private static ThreadInfo[] getThreadInfos() {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long[] threadIds = bean.getAllThreadIds();
        ThreadInfo[] threadInfos = bean.getThreadInfo(threadIds, 15);
        return threadInfos;
    }

    private static ThreadInfo[] findDeadlockedThreads(Logger log) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long[] deadlockedThreadsIDs = bean.findDeadlockedThreads();
        if (deadlockedThreadsIDs != null) {
            if (log != null) {
                log.error(DEADLOCKED_THREADS_STRING);
            } else {
                System.out.println(DEADLOCKED_THREADS_STRING);
            }
            return bean.getThreadInfo(deadlockedThreadsIDs);
        }
        return new ThreadInfo[]{};
    }

}
