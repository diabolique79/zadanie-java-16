package com.example.homework.app;

import java.util.Random;

public class Randomowanie {

    public static void main(String[] args) {

        int[] tab = new int[10];

        Random random =new Random();
        int i;
        for (i = 0; i < tab.length; i++) {

            tab[i] = random.nextInt(100);
//            System.out.println(tab[i]);
        }

            for (i = tab.length-1;i >= 0;i--){

               System.out.println(tab[i]);
        }


        }

    }

