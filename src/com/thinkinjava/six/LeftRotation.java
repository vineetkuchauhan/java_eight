package com.thinkinjava.six;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0; i < n ; i++){
            a[i] = scanner.nextInt();
        }

        for(int j=0; j<k; j++){
            for(int i=0; i<n-1; i++){
                int t = a[i];
                a[i]=a[i+1];
                a[i+1]= t;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
