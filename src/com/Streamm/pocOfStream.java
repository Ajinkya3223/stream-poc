package com.Streamm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class pocOfStream {
    public static void main(String[] args) {

        /** Stream api stream **/
    Transaction a = new Transaction(1000L, Type.DEBIT, 1);
    Transaction b = new Transaction(10000L, Type.CREDIT, 2);
    Transaction c = new Transaction(50000L, Type.DEBIT, 3);
    Transaction d = new Transaction(70000L, Type.DEBIT, 4);

    List<Transaction> transactionList = new ArrayList<>();
    //HashSet<Transaction> transactionList = new HashSet<Transaction>();
        transactionList.add(a);
        transactionList.add(b);
        transactionList.add(c);
        transactionList.add(d);

    //Use System.out and forEach
    Stream<Transaction> streamFromCollection = transactionList.stream();
        streamFromCollection.forEach(t -> System.out.println(t.getId() + " " + t.getAmount()));



    Transaction[] arr = new Transaction[]{a, b, c};
    Stream<Transaction> streamFromFullArray = Arrays.stream(arr);
        streamFromFullArray.forEach(t -> System.out.println(t.getId() + " " + t.getAmount()));
    Stream<Transaction> streamFromArrayPart = Arrays.stream(arr, 1, 3);
        streamFromArrayPart.forEach(t -> System.out.println(t.getId() + " " + t.getAmount()));

    Stream<Transaction> streamFromArray = Stream.of(a, b, c);
        streamFromArray.forEach(t -> System.out.println(t.getId() + " " + t.getAmount()));

    //To be bettered
    Stream<Double> streamGenerated =
            Stream.generate(Math::random).limit(10);
        streamGenerated.forEach(t -> System.out.println(t));

    Stream<Integer> streamIterated = Stream.iterate(40,n->n+2).limit(10);
        streamIterated.forEach(t -> System.out.println(t));

    Stream<String> streamOfString =
            Pattern.compile(", ").splitAsStream("MON, TUE, WED");
        streamOfString.forEach(t -> System.out.println(t));

}
}
