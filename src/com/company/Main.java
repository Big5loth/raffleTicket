package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        mainmenu();
    }
    public static String nameCollector(){
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Thanks for purchasing | What is your name?> ");
        String userName = null;
        try {
            userName = b.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userName;
    }
    public static int randomiser() {
        Random r = new Random();
        int low = 1;
        int high = 100;
        int result = r.nextInt(high - low) + low;
        return result;
    }

    public static void mainmenu() {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> raffleNumbers = new ArrayList<>();
        try {
            while (true) {
                BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Do you want a raffle ticket | Yes = 1, No = 0> ");
                int option = Integer.parseInt(b.readLine());
                switch (option) {
                    case 1:
                        int result = randomiser();
                        String userName = nameCollector();
                        names.add(userName);
                        System.out.println("Your raffle number is " + result);
                        raffleNumbers.add(result);
                        System.out.println(raffleNumbers);
                        break;
                    case 0:
                        System.out.println("Ok bye");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error in main menu method" + e);
        }
    }
}
