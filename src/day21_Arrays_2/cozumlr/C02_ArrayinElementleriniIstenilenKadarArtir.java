package day21_Arrays_2.cozumlr;

import java.util.Arrays;
import java.util.Scanner;

public class C02_ArrayinElementleriniIstenilenKadarArtir {
    public static void main(String[] args) {

        int [] arr={3,5,2,7};
        Scanner scanner=new Scanner(System.in);
        System.out.print("lutfen Arrayin elemanlarini artirmak istediginiz miktari giriniz : ");
        int artis = scanner.nextInt();

        // Arrayin tum elementlerini artis miktari kadar artirin

        for (int i = 0; i <arr.length ; i++) {
            arr[i] += artis;
        }
        System.out.println(Arrays.toString(arr));



    }
}
