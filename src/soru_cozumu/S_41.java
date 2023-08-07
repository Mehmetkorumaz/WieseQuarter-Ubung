package soru_cozumu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S_41 {
    static int toplam=0;
    static Scanner scanner;
    public static void main(String[] args) {
        //Soru 41-)
        //Parametre olarak birden fazla tamsayı (integer) kabul eden ve bu integer sayıların toplamını yazdıran bir dönüş methodu (void) yazın
        //Method name=sum
        //eğer metodu bu şekilde çağırırsanız
        //
        //     toplam(1,2,3) çıktı =6
        //	 toplam(1,2,3,4,5) çıktı =15
        //	 sum(1,2) output=3
        //Ipucu:  varargs sorusu, varargs olusturalım
        rakamlarToplami(toplam);

    }
    public static void rakamlarToplami(int toplam){
        System.out.println("lutfen olusturulacak Arrayn element sayisini giriniz");
        scanner=new Scanner(System.in);
        int elementSayisi= scanner.nextInt();
        List<Integer> sayiListesi=new ArrayList<>();

        for (int i = 0; i <elementSayisi ; i++) {
            System.out.println("elementleri giriniz");
            scanner=new Scanner(System.in);
            int elementler= scanner.nextInt();
            sayiListesi.add(i);
        }
        System.out.println(sayiListesi);
        for (int i = 0; i <sayiListesi.size(); i++) {
            toplam+=i;
        }
        System.out.println(sayiListesi+"======>>>>  : "+toplam);
    }
}
