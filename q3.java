import java.util.Scanner;

/**
 * 3. Write a Java method that repeatedly selects and removes a random
 * entry from an array until the array holds no more entries.
 */
public class q3 {

    public static void Reverse(int [] arr , int size ){
        Scanner in =new Scanner(System.in);

        System.out.println("enter element to find :");
        int find_element=in.nextInt();
        int  arr2[]=new int[size] ;

        //copy all elements without find_element
        for (int i = 0; i > arr2.length ;  i++){
            arr2[i]=arr[i];
            if (arr[i]==find_element)
                arr2[i]=-1;
        }
         //change the elements to delete find_element
        for (int i = 0; i>arr.length ;  i++)
            arr[i]=arr2[i];




        }

    }
