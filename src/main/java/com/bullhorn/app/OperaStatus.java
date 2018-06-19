package com.bullhorn.app;

import java.util.HashMap;
import java.util.Map;

public enum OperaStatus {

    VALIDATED(1),INTEGRATION_KEY_ERROR(2),INVALID_JSON_ERROR(3),MAPPED(4);

    private int value;
    private static Map map = new HashMap();


    private OperaStatus(int value) {
        this.value = value;
    }

    static {
        for (OperaStatus status : OperaStatus.values()) {
            map.put(status.value, status);
        }
    }

    public static Map getMap() {
        return map;
    }

    public static OperaStatus valueOf(int pageType) {
        return (OperaStatus) map.get(pageType);
    }

    public int getValue() {
        return value;
    }
}
