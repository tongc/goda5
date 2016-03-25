package com.goda5.hagendaz.common.chubby;

import com.google.common.collect.MapMaker;
import com.google.common.collect.Queues;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Queue;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by tong on 25/03/2016.
 */
public class Database {
    public static final int LOGS_CAPACITY = 5000;
    public static final int DB_CAPACITY = 5000;
    private ConcurrentMap<String, Object> snapshot = new MapMaker().concurrencyLevel(Runtime.getRuntime().availableProcessors()).initialCapacity(DB_CAPACITY).makeMap();
    private Queue<Operation> logs = Queues.newArrayBlockingQueue(LOGS_CAPACITY);

    public void save(String key, Object data) {
        synchronized (this) {
            snapshot.put(key, data);
            logs.add(new Operation(Operation.Action.UPDATE, Pair.of(key, data)));
        }
    }

    public void delete(String key, Object data) {
        synchronized (this) {
            snapshot.remove(key);
            logs.add(new Operation(Operation.Action.DELETE, Pair.of(key, data)));
        }
    }
}
