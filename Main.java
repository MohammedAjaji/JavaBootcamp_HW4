import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //Question 1

//        int array[] = {50, -20, 0, 30, 40, 60, 10};
//
//        boolean same = array[0] == array[array.length-1];
//        System.out.println(same);

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 2
//        int arr[] = {1, 4, 17, 7, 25, 3, 100};
//
//        int[] great = new int[arr.length];
//        great = arr;
//        Arrays.sort(great);
//        System.out.println("Enter a number:");
//        int num = s.nextInt();
//
//        System.out.print(num + " largest elements of the said array are: ");
//        for (int i = great.length -1; i >= great.length - num; i-- ){
//            System.out.print(great[i] + ", ");
//        }

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 3
//
//        int arr[] = {1, 4, 17, 7, 25, 3, 100};
//        ArrayList greater = new ArrayList();
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++){
//            sum = arr[i] + sum;
//        }
//        double avg = sum/ arr.length;
//
//        for (int num : arr) {
//
//            if (num >= avg) {
//                greater.add(num);
//            }
//        }
//        System.out.println("The average of the said array is: " + avg);
//        System.out.println("The numbers in the said array that are greater than the average are: " + greater);

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 4
//
//        System.out.println("Enter the size of your Array: ");
//        int size = s.nextInt();
//
//        int [] arr = new int[size];
//        System.out.println("enter the elements of the Array:");
//        for (int i = 0; i < size; i++){
//            arr[i] = s.nextInt();
//        }
//        System.out.println("your Array: ");
//        System.out.println(Arrays.toString(arr));
//
//        int[] great = new int[arr.length];
//        great = arr;
//        Arrays.sort(great);
//
//        System.out.print("Larger value between first and last element: " + great[great.length -1]);

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 5
//
//        System.out.println("Enter the size of your Array: ");
//        int size = s.nextInt();
//
//        int [] arr = new int[size];
//        System.out.println("enter the elements of the Array:");
//        for (int i = 0; i < size; i++){
//            arr[i] = s.nextInt();
//        }
//        System.out.println("your Array: ");
//        System.out.println(Arrays.toString(arr));
//
//        int[] swap = new int[arr.length];
//        swap = arr;
//
//        int temp = swap[0];
//        swap[0] = swap[swap.length - 1];
//        swap[swap.length - 1] = temp;
//
//        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(swap));

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 6
//        String arr[] = { "cat", "dog", "red", "is", "am" };
//        ArrayList longest = new ArrayList();
//
//        int maxlength = 0;
//        for (String word : arr) {
//            if (word.length() > maxlength) {
//                longest.clear();
//                longest.add(word);
//                maxlength = word.length();
//            } else if (word.length() == maxlength) {
//                longest.add(word);
//            }
//        }
//        System.out.println("The longest words are: " + longest);

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 7
//        int[] arr = null;
//        while(true){
//            System.out.println("\n"+"Menu:");
//            System.out.println("1. Accept elements of an array");
//            System.out.println("2. Display elements of an array");
//            System.out.println("3. Search for an element within the array");
//            System.out.println("4. Sort the array");
//            System.out.println("5. Exit");
//            System.out.print("Please enter here: ");
//            int num = s.nextInt();
//
//            switch (num){
//                case 1:
//                    System.out.println("Enter the size of your Array: ");
//                    int size = s.nextInt();
//
//                     arr = new int[size];
//                    System.out.println("enter the elements of the Array:");
//                    for (int i = 0; i < size; i++){
//                         arr[i] = s.nextInt();
//                    }
//                    break;
//
//                case 2:
//                    if (arr == null){
//                        System.out.println("Your Array empty!");
//                    }else {
//                        System.out.println("your Array: ");
//                        System.out.println(Arrays.toString(arr));
//                    }
//                    break;
//
//                case 3:
//                    if (arr == null) {
//                        System.out.println("Your Array empty!");
//                    }else {
//                        System.out.println("Please enter the element you want to search: ");
//                        int elm = s.nextInt();
//
//                        boolean noElm = true;
//                        ArrayList index = new ArrayList();
//                        for (int i = 0; i < arr.length; i++){
//                            if (arr[i] == elm){
//                                index.add(i);
//                                noElm = false;
//                            }
//                        }
//                        if(noElm){
//                            System.out.println("Sorry element " + elm + " cant be found");
//                        }else {
//                            System.out.println("The element " + elm + " can be found at index " + index);
//                        }
//                    }
//                    break;
//
//                case 4:
//                    Arrays.sort(arr);
//                    System.out.println("Your Array after sorting the elements: ");
//                    System.out.println(Arrays.toString(arr));
//                    break;
//
//                case 5:
//                    System.out.println("Exiting...");
//                    System.exit(0);
//                    break;
//
//                default:
//                    System.out.println("Invalid! Please try again");
//                    break;
//            }
//        }

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 8
        System.out.println("Enter the size of your Array: ");
        int size = s.nextInt();

        int [] arr = new int[size];
        System.out.println("enter the elements of the Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int[] sortArr = new int[size];
        sortArr = arr;
        Arrays.sort(sortArr);

        ArrayList list = new ArrayList();
        list.add(sortArr[0]);
        int occurring = sortArr[0];


            for (int i = 0; i < size ; i++) {
                if(occurring != sortArr[i]){
                    list.add(sortArr[i]);
                    occurring = sortArr[i];
                }
            }


            for (int i = 0; i < list.size(); i++){
                int count = 0;
                for(int j = 0; j < size; j++){
                    if (arr[j] == (int)list.get(i)){
                    count++;
                    }
                }
                System.out.println(list.get(i) + " occurs " + count + " times");
            }

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 8 another way:

        System.out.println("Enter the size of your Array: ");
        int size = s.nextInt();

        int [] arr = new int[size];
        System.out.println("enter the elements of the Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("enter the number you want to see the number of occurrences:");
        int occur = s.nextInt();
        int count = 0;
        for (int num : arr) {
            if (num == occur){
                count++;
            }
        }
        System.out.println(occur + " occurs " + count + " times");

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 9
//        int[] arr = {2,3,40,1,5,9,4,10,7};
//        int[] newArr = new int[arr.length];
//
//        int odd = 0, even = arr.length - 1;
//        for (int num : arr) {
//            if (num % 2 != 0) {
//                newArr[odd] = num;
//                odd++;
//            }else{
//                newArr[even] = num;
//                even--;
//            }
//        }
//        System.out.println("old array: " + Arrays.toString(arr));
//        System.out.println("new array: " + Arrays.toString(newArr));

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 10
        int[] arr1 = {2,3,40,1,5,9,4,10,7};
        int[] arr2= {2,3,40,1,5,9,4,10,7};

        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));

        if (Arrays.equals(arr1,arr2)){
            System.out.println(true);
            System.out.println("Array1 is equal to Array2 ");
        }else {
            System.out.println(false);
            System.out.println("Array1 is NOT equal to Array2 ");
        }









    }
}