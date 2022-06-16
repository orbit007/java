import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int tar=scn.nextInt();
        int idx=0;
        int sos=0;
        String set="";

        printTargetSumSubsets(arr,idx,sos,tar,set);


    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, int sos, int tar, String set) {

        if(sos>tar)
        {
            return;
        }
        if(idx==arr.length)
        {
            if(sos==tar)
            {
                System.out.println(set);
            }
            return;
        }

        printTargetSumSubsets(arr,idx+1,sos+arr[idx],tar,set+arr[idx]+" ");
        printTargetSumSubsets(arr,idx+1,sos,tar,set);
        
    }

}