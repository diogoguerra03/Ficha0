package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //System.out.println("Olá");
        //4.1
        int x = 5;
        double soma = 0;
        boolean flag = false;

        //4.2
        /*
        //a
        if(x%2 == 0)
        {
            flag = true;
        }else
        {
            flag = false;
        }
        */

        //b
        /*
        switch (x%2){
            case 0:
                flag = true;
                break;
            default:
                flag = false;
        }
         */

        //c
        //flag = x%2==0 ? true : false;

        //d
        flag = x%2==0;

        //e
        for (int i = 1; i <= x; i++) {
            soma += i;
        }

        //f
        soma = 0;

        //g
        int i = 1;
        while (i <= x) {
            soma += i;
            i++;
        }

        //h
        soma = 0;
        i = 1;
        //i
        if(i<=x){
            do {
                soma += i;
                i++;
            } while (i <= x);
        }

        //j
        soma=0;
        for (i = 1; i <= x; i++) {
            if (i == 3) {
                continue;
            }
            soma += i;
        }
    }
}
