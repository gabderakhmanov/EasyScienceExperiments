package com.experiments.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MainHashMapTest {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {

//        Map theMap = new HashMap(1);
//        theMap.put(null, null);
//        theMap.put("name", "Max");
//        theMap.put("name1", "Max");
//
//
//
//
//        System.out.println(theMap.get("name"));
//        System.out.println(theMap.size());

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A",1); // hash("A")=69, indexFor(hash,table.length)=69&(16-1) = 5
        hashMap.put("B",2); // hash("B")=70, indexFor(hash,table.length)=70&(16-1) = 6
        hashMap.put("P",3); // hash("P")=85, indexFor(hash,table.length)=85&(16-1) = 5
        hashMap.put("A",4); // hash("A")=69, indexFor(hash,table.length)=69&(16-1) = 5
        hashMap.put("r", 4);// hash("r")=117, indexFor(hash,table.length)=117&(16-1) = 5

        System.out.println(hashMap);

    }
}
