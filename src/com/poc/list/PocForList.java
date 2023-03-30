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

        list1.add(0, "Ganesh");

        Iterator itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        /** traverse using for each Method of java 8 **/
        list1.forEach(a->{System.out.println(a);});
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



List<Student> s1=new ArrayList<>();
      s1.add(new Student(1,"Ram",28));
      s1.add(new Student(2,"Krishna",30));


    ArrayList<String> al2=new ArrayList<String>();  
           al2.add("jay");
           al2.add("Hanuman");
           //Adding second list elements to the first list  
           list1.addAll(al2);
    list1.forEach(t->{System.out.println(t);});

        //Removing specific element from arraylist
        list2.remove(1);
        //Removing elements on the basis of specified condition
        list1.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression
        System.out.println("After invoking removeIf() method: "+al);
        //Removing all the elements available in the list
        list2.clear();
    }



    }









