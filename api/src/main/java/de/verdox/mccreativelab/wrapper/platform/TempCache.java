package de.verdox.mccreativelab.wrapper.platform;

import java.util.Map;
import java.util.WeakHashMap;

public class TempCache {
    private static final Map<Object, TempData> weak = new WeakHashMap<>();

    public static TempData get(Object o){
        if(!weak.containsKey(o)){
            weak.put(o, new TempData());
        }
        return weak.get(o);
    }
}
