package Array;

// Duplicate Array

public class DuplicateArray {

    public static void main(String[] args) {

        int[] Array = {9, 5, 7, 1, 5, 6, 9, 7};


        for (int i = 0; i < Array.length; i++) {

            for (int j = i + 1; j < Array.length; j++) {

                if (Array[i] == Array[j]) {

                    System.out.println(Array[i]);
                }

            }
        }
            
        }

    }






//for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }


// int [] arr = {1,3,2,9};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(+ i +" = " + arr[i]);
//       }