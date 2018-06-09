package com.experiments.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MainHashMapTest {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {

        Map theMap = new HashMap(1);
        theMap.put(null, null);
        theMap.put("name", "Max");
        theMap.put("name1", "Max");




        System.out.println(theMap.get("name"));
        System.out.println(theMap.size());

    }
}
