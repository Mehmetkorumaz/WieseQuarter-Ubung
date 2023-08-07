package day21_Arrays_2.cozumlr;

import java.util.Arrays;
import java.util.Scanner;

public class C05_ArrayOlustur {
    public static void main(String[] args) {
        ////Soru 5- Kullanicidan array’in boyutunu ve
        // elementlerini alip array’i olusturan ve bize donduren bir method olusturun.

        Scanner scanner=new Scanner(System.in);
        System.out.print("lutfen Array in uzunlugunu giriniz  :  ");
        int uzunluk = scanner.nextInt();
        int[] arr = new int[uzunluk]; // bilmiyoru [0,0,0,0....

        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Array icin Elelment giriniz  :  ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}
