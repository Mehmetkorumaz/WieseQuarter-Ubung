package day9_nested_ifelse_statements;

import java.util.Scanner;

public class c02_indirimhesaplama {
    public static void main(String[] args) {
        /*Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
        Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen urun adedini giriniz");
        int adet = scan.nextInt();
        System.out.println("lutfen urun liste fiyatini giriniz");
        double listeFiyati = scan.nextDouble();
        System.out.println("musteri kartiniz var mi? E:Evet  H: hayir");
        char kart=scan.next().toUpperCase().charAt(0);
        // musteri kartini degisken secelim
        if (kart=='E'){
            if (adet>10 ){// karti olanlar
                System.out.println("%20 indirimli fiyat : "+adet*listeFiyati*80/100);

            }else {
                System.out.println("%15 indirimli fiyat : "+adet*listeFiyati*85/100);
            }
        } else if (kart=='H') {// karti olmayanlar
            if (adet>10 ){
                System.out.println("%15 indirimli fiyat : "+adet*listeFiyati*85/100);

            }else {
                System.out.println("%10 indirimli fiyat : "+adet*listeFiyati*90/100);
            }

        }else {//hatali kart bilgisi
            System.out.println("kart bilgisi hatali");
        }

    }
}
