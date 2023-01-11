/**
 * 1. Write a Java method that Reverse an array using another array.
 */
public class q1 {

    public static void Reverse(int [] arr , int size){

        int  arr2[]=new int[size] ;
        int i=0;
            for (int j = arr.length; j>=0 ;  j--) {
                arr2[i]=arr[j];
                i++;
            }

    }


}
