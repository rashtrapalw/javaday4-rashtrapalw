package com.example;

import java.util.Scanner;

/**
 * InnerRepeatName
 */
public class RepeatName {

    


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter name :");
        String name = scanner.nextLine();
        System.out.println("how many times do you want to repeat");
        int i = scanner.nextInt();

        int count =0;
        while(count <= 0){
            System.out.println("rashtrapal ");
        }

        for( count =0;count <=i;count++)
        {
            System.out.println("rashtrapal ");
        }

        do{
            System.out.println("rashtrapal ");
            count++;

        }while(count <=i);
        
    }
}