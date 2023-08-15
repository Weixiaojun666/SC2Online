package com.weiservers.sc2online.utils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ToMap {
    public static Map<String, Object> BackList(long count, List<?> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", count);
        map.put("data", list);
        return map;
    }

    public static Map<String, Object> BackData(Object data) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("data", data);
        return map;
    }

    public static Map<String, Object> BackNone() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        return map;
    }
}
