package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_arrayOlustur {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan array’in boyutunu ve
        // elementlerini alip array’i olusturan ve bize donduren bir method olusturun.
        System.out.println(Arrays.toString(arrayOlustur()));
    }
    public static int[] arrayOlustur(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("lutfen Array in uzunlugunu giriniz");
        int uzunluk = scanner.nextInt();
        int[] arr = new int[uzunluk]; // bilmiyoru [0,0,0,0....

        for (int i = 0; i < arr.length ; i++) {
            scanner=new Scanner(System.in);// for loop ile her seferinde deger alabilmesi icin
                                          // var olan scanner objesine yeniden deger atayalim

            System.out.print("Array icin Element giriniz");
            arr[i] = scanner.nextInt();

        }
        return arr;
    }
}
