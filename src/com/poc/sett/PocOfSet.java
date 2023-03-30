package com.poc.sett;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PocOfSet {
    public static void main(String[] args) {
        Set set1=new HashSet();
        set1.add(1);
        set1.add("Ram");
  /** basic iteratation using for each method **/
        set1.forEach(t->{System.out.println(t);});
   /** iteration using iterator **/
   Iterator itr=set1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

/** contains method of hashset
 * input cityname
 * problem to check weather paris is present or not
 * output paris   **/

        Set<String> popularCities = new HashSet<>();

        // Check if a HashSet is empty
        System.out.println("Is popularCities set empty? : " + popularCities.isEmpty());

        popularCities.add("London");
        popularCities.add("New York");
        popularCities.add("Paris");
        popularCities.add("Dubai");

        // Find the size of a HashSet
        System.out.println("Number of cities in the HashSet " + popularCities.size());

        // Check if the HashSet contains an element
        String cityName = "Paris";
        if(popularCities.contains(cityName)) {
            System.out.println(cityName + " is in the popular cities set.");
        } else {
            System.out.println(cityName + " is not in the popular cities set.");
        }


/**  user defined object in set
 * input two obbject of type customer
 * output what will happen if we added similar object in set it should have removed duplicate
 * problem :set will use equals and hashcode to check where object are equals or not
 */

Set <Customer> cust = new HashSet<Customer>();
        cust.add(new Customer(101,"Rajeev"));
        cust.add(new Customer(102,"Sachin"));
        cust.add(new Customer(103,"Chris"));

        /*
          HashSet will use the `equals()` & `hashCode()` implementations
          of the Customer class to check for duplicates and ignore them
        */
        cust.add(new Customer(101, "Rajeev"));

        for(Customer c:cust){

            System.out.println(c.getName());

    }

}}


