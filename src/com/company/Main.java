package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {



        SalesRepresentatives[] salesArray = new SalesRepresentatives [4];

        salesArray[0] = new SalesRepresentatives("Michael Scott", 20, 1000, 20000);
        salesArray[1] = new SalesRepresentatives("Jim Halpert", 12, 1000, 12000);
        salesArray[2] = new SalesRepresentatives("Dwight Schrute", 15, 900, 13500 );
        salesArray[3] = new SalesRepresentatives("Kevin Malone", 9, 1000, 9000);

        System.out.println("Before sort = " + Arrays.toString(salesArray));

        RevenueComparator salesRevenueComparator = new RevenueComparator();

        Arrays.sort(salesArray, salesRevenueComparator);
        System.out.println("\nAfter sort = " + Arrays.toString(salesArray));

        int[] rev = {20000, 12000, 13500, 9000};
        bubbleSort(rev);
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for(int i = n; i >= 0; i--){
            for(int j = 0; j < i - 1; j++){
                if(a[j] < a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

        }
        System.out.println("\nThe revenues in descending order:");
        printArray(a);

    }

    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");}

    }




}
