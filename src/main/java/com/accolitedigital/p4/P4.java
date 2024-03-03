package com.accolitedigital.p4;

import java.util.Map;

public class P4 {

    private Map<String, String> map;

    public void addToMap(String key, String value){
        map.put(value, key);
    }

    public String getFromMap(String key){
        return map.get(key);
    }
}
