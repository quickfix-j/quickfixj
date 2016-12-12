/*
 ******************************************************************************
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

package org.quickfixj;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class SimpleCache<K, V> extends ConcurrentHashMap<K, V> {
    static final int CONCURRENCY_LEVEL = Runtime.getRuntime().availableProcessors() * 2;

    final Function<K, V> loadingFunction;

    public SimpleCache(Function<K, V> loadingFunction) {
        super(CONCURRENCY_LEVEL, 0.7f, CONCURRENCY_LEVEL);
        this.loadingFunction = loadingFunction;
    }

    public V computeIfAbsent(K key) {
        /*
         * We could computeIfAbsent directly but for CPUs < 32 pre-scanning is faster.
         */
        final V value = get(key);
        return value != null ? value : computeIfAbsent(key, loadingFunction);
    }
}
