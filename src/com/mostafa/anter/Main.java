package com.mostafa.anter;

import olive.Olive;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Olive olive1 = new Olive("Kalamata", 0x000000);
        Olive olive2 = new Olive("Picholine", 0x000000);
        Olive olive3 = new Olive("Ligurio", 0x000000);


       // Olive[] olives = {olive1, olive2, olive3};

        /*
        * in java7 you don't need to write data type two times in generic declaration
        * */
        ArrayList<Olive> olives1 = new ArrayList<>();
        olives1.add(olive1);
        olives1.add(olive2);
        olives1.add(olive3);


        System.out.println(olives1);


    }
}
