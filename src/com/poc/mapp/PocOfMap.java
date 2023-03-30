package com.poc.mapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PocOfMap {

    public static void main(String[] args) {

        /**  problem concept  map iteration
         *   input  key value pairs
         *   output key value pairs
         */

        Map<String,String> map=new HashMap<String,String>();
        map.put("100","Ram");
        map.put("101","Krishna");
        map.put("102","Hari");

        /** Traversing Map using foreach  **/
       map.forEach((k,v)->{System.out.println(k+""+v);});

       /** for loop using keyset **/
        for (String key : map.keySet()) {
          System.out.println(map.get(key));
        }
       /** using keyset with iterator **/
        Iterator itr7 = map.keySet().iterator();
        while(itr7.hasNext()) {
            String key = (String) itr7.next();
            System.out.println(map.get(key));
        }
     /** entry set and iterator **/
     System.out.println("using entryset and iterator");
     Iterator<Map.Entry<String,String>> itr1 = map.entrySet().iterator();
        while(itr1.hasNext()) {

            Map.Entry<String,String> entry = itr1.next();
           System.out.println( entry.getKey());
            System.out.println( entry.getValue());
        }

    }

}

