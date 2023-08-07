package soru_cozumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S_32 {
    public static void main(String[] args) {
        //Soru 32-)
        //Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
        //İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen olusturacaginiz array in elemen sayisini giriniz");
        int elementSayi= scanner.nextInt();

        int[]sayi=new int[elementSayi];
        for (int i = 0; i <sayi.length; i++) {
            System.out.println("lutfen elementleri giriniz");
            sayi[i]+= scanner.nextInt();
        }
        System.out.println(Arrays.toString(sayi));
        List<Integer> tersten=new ArrayList<>();
        for (int i = sayi.length-1; i >=0 ; i--) {
            tersten.add(sayi[i]);
        }
        System.out.println(tersten);
    }
}
