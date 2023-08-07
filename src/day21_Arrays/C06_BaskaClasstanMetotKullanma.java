package day21_Arrays;

import day21_Arrays_2.cozumlr.C05_ArrayOlustur;

import java.util.Arrays;

public class C06_BaskaClasstanMetotKullanma {
    public static void main(String[] args) {
        int[] arr= {2,4,6,8};
        System.out.println(Arrays.toString(arr));

        System.out.println("eski array : " + Arrays.toString(arr)); // eski array : [2, 4, 6, 8]
        arr =C02_arrayinElementleriniIstenenKadarArtirma.elementleriArtir(arr,4);
        System.out.println("yeni array : " + Arrays.toString(arr)); // yeni array : [6, 8, 10, 12]
        System.out.println(C03_PozitifElementleriTopla.pozitifElemenleriTopla(arr)); // 36
        C04_ElementSay.elemenSay(arr,6); // method void oldugu icin bizim sout yapmamiza gerek yok
        // kullanicidan deger alarak int[] olusturmak istiyorum
        int[] kullaniciArrayi = C05_arrayOlustur.arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));
    }
}
