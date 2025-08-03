import java.util.Scanner;
import java.util.Arrays;
public class leaderboard {
    public static void main(String [] args){
        System.out.println(
                "Enter the amount of numbers you wanna input"
        );
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr1=new int[size];
        int element=0;
        for(int i=0; i<size; i++){
            System.out.println(
                    "Give me the values of the element: "+ i
            );
            int ele=sc.nextInt();
             arr1[i]=ele;
            }
        System.out.println(
                "The values you entered was "+ Arrays.toString(arr1)
        );
        int [] arr2=new int[arr1.length];
        for(int k=0; k<arr1.length; k++) {//The actual array loop
            int max = arr1[0];
            for (int j = 0; j < arr1.length; j++) {//I am trying to get largest number using this loop.
                if (arr1[j] > max) {
                    max = arr1[j];
                    element=j;
                    }
                }
            arr2[k]=max;
            arr1[element]=-1;
            }
        System.out.println(
                "The  leaderboard is (from to highest value to lowest) "+ Arrays.toString(arr2)
        );
          }
        }


