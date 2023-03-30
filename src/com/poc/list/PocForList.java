package com.poc.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PocForList {
    public static void main(String[] args) {
        /** iterator is used to iterate over the collection elements
         * here we are iterating over list**/


        List<String> list1 = new ArrayList<String>();
        list1.add("Ram");
        list1.add("Krishna");
        list1.add("hari");

        Iterator itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        List<Integer> list2 =new ArrayList<Integer>();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);

        Iterator itr2=list2.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next()+"");
        }
      /** using for to itrate over loop **/

      for(Integer i: list2){
          System.out.println("using for loop");
          System.out.println( i+"");

      }

    }

    }






