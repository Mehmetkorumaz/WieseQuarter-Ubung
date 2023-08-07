package day25_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class day25_tekrar {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.
        int[] arr ={-4,5,2,0,3};

    }
   public static int pozitifElemeTopla (int[] arr){
       int toplam=0;
       for (int i = 0; i < arr.length ; i++) {
           if (arr[i]>0){
               toplam+=arr[i];
           }

       }
       return toplam;
}

}