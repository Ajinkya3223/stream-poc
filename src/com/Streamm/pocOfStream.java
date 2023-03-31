package com.Streamm;

import sun.awt.X11.XInputMethod;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
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

    /** input - list of transcations
     * output -  display of id and amount using stream **/
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



        /** using filter in stream
         * input - list of products
         * output - filter the products whose price is 30000  **/

        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 30000)// filtering price which is greater than 30000
                .map(p->p.price)        // fetching filtered price
                .collect(Collectors.toList()); // collecting  and storing it in list
        System.out.println(productPriceList2);


        /** using filter for creatig list using collectors.tolist method
         * input-list
         * outpur list with only prices
         * **/

        List<Float> pricesList =  productsList.stream()
                .filter(p ->p.price> 30000)   // filtering price
                .map(pm ->pm.price)          // fetching price
                .collect(Collectors.toList());
        System.out.println(pricesList);



        /** This is more compact approach for filtering data  **/
        productsList.stream()
                .filter(product -> product.price == 30000)
                .forEach(product -> System.out.println(product.name));

        /** Reduce Method  example
         * This method takes a sequence of input elements and combines them into a single
         * summary result by repeated operation.
         * For example, finding the sum of numbers, or accumulating elements into a list.
         * input -list fo product
         * output-**/


       System.out.println("***Reduce***");
        // This is more compact approach for filtering data
        Float totalPrice = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,(sum, price)->sum+price);   // accumulating price
        System.out.println(totalPrice);
        // More precise code
        float totalPrice2 = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);

        /** sum by collector methods
         * collecting and adding price
         * here we are using collectores summing Double method**/
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product->product.price));
        System.out.println(totalPrice3);


        /** min and max  method of stream
         *   input- list of product
         *   output-min max priced product**/

        // max() method to get max Product price
        Product productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();
        System.out.println(productA.price);
        // min() method to get min Product price
        Product productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();
        System.out.println(productB.price);

        /** count using stream
         * problem- count product whose value is less than 30000
         * **/

        long count = productsList.stream()
                .filter(product->product.price<30000)
                .count();
        System.out.println(count);

        /** convert list into set using stream
         * input list of product
         * output set of prices less than 30000**/

        // Converting product List into Set
        Set<Float> productPriceList =
                productsList.stream()
                        .filter(product->product.price < 30000)   // filter product on the base of price
                        .map(product->product.price)
                        .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)
        System.out.println(productPriceList);

        /**  covert list into map using stream
         * input listof prodcut
         * here we have used collecters tomap method
         * op map with id and name**/

        Map<Integer,String> productPriceMap =
                productsList.stream()
                        .collect(Collectors.toMap(p->p.id, p->p.name));

        System.out.println(productPriceMap);

        /** Method reference in stream **/

        List<Float> productPriceList4 =
                productsList.stream()
                        .filter(p -> p.price > 30000) // filtering data
                        .map(Product::getPrice)         // fetching price by referring getPrice method
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList4);

        /** java 8 foreach method
         * input - gameslist **/
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        System.out.println("------------Iterating by passing lambda expression--------------");
        gamesList.forEach(games -> System.out.println(games));


    }
}
