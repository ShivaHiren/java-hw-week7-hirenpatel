package hwweek7;
// Write a Java program to test if an array contains a specific value
public class Program20 {
    public static void main(String[] args) {

                int[] myArray = {55, 45, 69, 44};
                int num = 55;

                for (int i = 0; i < myArray.length; i++) {
                    if (num == myArray[i]) {
                        System.out.println("Array contains the given element");
                    }
                }
            }
    }
