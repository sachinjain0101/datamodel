package com.bullhorn.app;

import java.util.ArrayList;
import java.util.List;

public enum OperaStatus {

    PROCESSED, VALIDATED, INTEGRATION_KEY_ERROR, INVALID_JSON_ERROR, MAPPED, MAPPING_ERROR, VALIDATED_WITH_MAPPING_ERROR;
    private static List lst = new ArrayList();

    static {
        for (OperaStatus status : OperaStatus.values()) {
            lst.add(status);
        }
    }

    public static List getLst() {
        return lst;
    }

    //    VALIDATED(1),INTEGRATION_KEY_ERROR(2),INVALID_JSON_ERROR(3),MAPPED(4),MAPPING_ERROR(5);

//    private int value;
//    private static Map map = new HashMap();
//
//
//    private OperaStatus(int value) {
//        this.value = value;
//    }
//
//    static {
//        for (OperaStatus status : OperaStatus.values()) {
//            map.put(status.value, status);
//        }
//    }
//
//    public static Map getMap() {
//        return map;
//    }
//
//    public static OperaStatus valueOf(int pageType) {
//        return (OperaStatus) map.get(pageType);
//    }
//
//    public int getValue() {
//        return value;
//    }
}
