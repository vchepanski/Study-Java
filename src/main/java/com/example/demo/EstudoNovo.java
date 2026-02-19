package com.example.demo;

import java.util.Locale;
import java.util.Scanner;

public class EstudoNovo {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       int vezes = sc.nextInt();
       double[] array = new double[vezes];
       
       for (int i = 0; i < n; i++){
            array[i] = sc.nextDouble();
       }


       sc.close();
    }
}
