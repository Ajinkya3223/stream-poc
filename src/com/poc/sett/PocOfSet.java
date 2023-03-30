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




    }

}
