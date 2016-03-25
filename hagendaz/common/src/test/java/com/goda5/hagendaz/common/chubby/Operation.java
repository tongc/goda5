package com.goda5.hagendaz.common.chubby;

import org.apache.commons.lang3.tuple.Pair;

/**
 * Created by tong on 25/03/2016.
 */
public class Operation {
    public enum Action {
        UPDATE, DELETE
    }
    private Action action;
    private Pair<String, Object> keyAndData;

    public Operation(Action action, Pair<String, Object> keyAndData) {
        this.action = action;
        this.keyAndData = keyAndData;
    }

    public Action getAction() {
        return action;
    }

    public Pair<String, Object> getKeyAndData() {
        return keyAndData;
    }
}
