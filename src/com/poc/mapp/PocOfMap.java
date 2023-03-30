package com.poc.mapp;

import java.util.*;

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


        /** an ArrayList of String object  to map
         * input list of string
         * output key value pairs where key is string and value is its length
         * **/
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Java");
        listOfString.add("JavaScript");
        listOfString.add("Python");
        listOfString.add("C++");
        listOfString.add("Ruby");

        System.out.println("list of string: " + listOfString);

        /** converting ArrayList to HashMap **/
        Map<String, Integer> map5 = new HashMap<>();
        for (String str : listOfString) {
            map5.put(str, str.length());
        }


        Map<String, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        /** Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null` **/
        numberMapping.putIfAbsent("Four", 4);

        System.out.println(numberMapping);


/** input country and their codes
 * problem printing hashmaps keyset and values
 * output india IN**/
        Map<String, String> countryISOCodeMapping = new HashMap<>();

        countryISOCodeMapping.put("India", "IN");
        countryISOCodeMapping.put("United States of America", "US");
        countryISOCodeMapping.put("Russia", "RU");
        countryISOCodeMapping.put("Japan", "JP");
        countryISOCodeMapping.put("China", "CN");

        // HashMap's entry set
        Set<Map.Entry<String, String>> countryISOCodeEntries = countryISOCodeMapping.entrySet();
        System.out.println("countryISOCode entries : " + countryISOCodeEntries);

        // HashMap's key set
        Set<String> countries = countryISOCodeMapping.keySet();
        System.out.println("countries : " + countries);

        // HashMap's values
        Collection<String> isoCodes = countryISOCodeMapping.values();
        System.out.println("isoCodes : " + isoCodes);


        /** removing keys from hashmap
         * input chris lisa
         * output lisa*/

        Map<String, String> mapping = new HashMap<>();
        mapping.put("Jack", "Marie");
        mapping.put("Chris", "Lisa");
        mapping.put("Steve", "Jennifer");



        // Remove a key from the HashMap
        // Ex - Unfortunately, Chris got divorced. Let's remove him from the mapping
        String h = "Chris";
        String w = mapping.remove(h);
       System.out.println(w);
        for(String k: mapping.keySet()){

            System.out.println(k+"  "+mapping.get(k));
        }
    }

    }



