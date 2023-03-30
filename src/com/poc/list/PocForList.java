package com.poc.list;

import java.util.ArrayList;
import java.util.Collections;
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
        list1.add("Raja");
        
        /** Sorting ArrayList in ascending Order    **/
          Collections.sort(list1);

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
        
        /** Sorting ArrayList in ascending Order   **/
       // using Collection.sort() method
        Collections.sort(list2, Collections.reverseOrder());

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

      /** iterating over Generic arrayList using for loop **/
      for(Student s: s1){
          System.out.println(s.getRollno());
          System.out.println(s.getAge());
          System.out.println(s.getName());
      }


    ArrayList<String> al2=new ArrayList<String>();  
           al2.add("jay");
           al2.add("Hanuman");
           /** Adding second list elements to the first list   **/
           list1.addAll(al2);
    list1.forEach(t->{System.out.println(t);});

        /** Removing specific element from arraylist **/
        list2.remove(1);
        /** Removing elements on the basis of specified condition **/
        list1.removeIf(str -> str.contains("Raja"));   //Here, we are using Lambda expression
        System.out.println("After invoking removeIf() method: "+list1);
        /** Removing all the elements available in the list **/
        list2.clear();
    }



    }









