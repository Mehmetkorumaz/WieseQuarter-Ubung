package day21_Arrays_2.cozumlr;

import java.util.Arrays;

public class C01_ArrayinTumElementleriniArtir {
    public static void main(String[] args) {
        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren
        // bir method olusturun. Eski array’i yeni haliyle kaydedin
        int[] arr={3,4,6,8,1};

        for (int i = 0; i < arr.length; i++) {
            arr[i]+=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
