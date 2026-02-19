package com.example.demo;

import java.util.Locale;
import java.util.Scanner;

public class EstudoCliente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please digit tour name");
        String client = sc.nextLine();
        System.out.println("Please digit yout acount number");
        int acountNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Is there initial deposit? 1 para sim 0 para nao");
        int primaryDeposit = sc.nextInt();
        sc.nextLine();
        Cliente cliente;
        if(primaryDeposit == 1){
            System.out.println("Enter initial deposit value: ");
            double depositValue = sc.nextDouble();
            sc.nextLine();
            cliente = new Cliente(acountNumber, client, depositValue);
            System.out.println(cliente.toString());
        }else if(primaryDeposit == 0){
            cliente = new Cliente(acountNumber, client);
            System.out.println(cliente.toString());
        }else{
            System.out.println("Invalid value");
            return;
        }
        System.out.println("Enter a value for deposit");
        double deposit = sc.nextDouble();
        cliente.deposit(deposit);
        System.out.println(cliente.toString());
        System.out.println("Enter a value for withdrawal");
        double withdrawal = sc.nextDouble();
        cliente.withdraw(withdrawal);
        System.out.println(cliente.toString());
        sc.close();
    }
}
