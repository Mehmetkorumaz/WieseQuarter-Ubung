package day13_stringmanipulations_forloop;

import java.util.Scanner;

public class c08_soru_cozumu {
    public static void main(String[] args) {
        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 26.70 €

        String input1 ="15,30 ß";
        String input2 = "11,40 ?";
        System.out.println(input1.replaceAll("\\W",""));
        System.out.println(input2.replaceAll("\\W",""));

        System.out.println("output : "+(input1+input2));

    }
}
