package hwweek7;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Program17 {

        public static void main(String[] args) {
            //define an array
            int[] intArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7};

            System.out.printf("Original Array : %s", Arrays.toString(intArray));

            Arrays.sort(intArray);

            System.out.printf("\n\nSorted Array : %s", Arrays.toString(intArray));
        }
    }

