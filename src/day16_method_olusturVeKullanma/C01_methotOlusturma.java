package day16_method_olusturVeKullanma;

public class C01_methotOlusturma {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan input olarak verilen bir String,
        //        baslangic ve bitis indexlerine gore
        //        baslangic index'i dahil, bitis index'i haric olacak sekilde
        //        aradaki harfleri yazdiran bir method olusturun.
        //
        //          - kullanici baslangic degeri olarak,
        //          bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        //          - kullanici str'da olan index'lerden daha buyuk bir index girerse
        //          hata mesaji yazdiri

        altstring("Java guzeldir",3,7);// a gu...
        altstring("biraz sabir lutfen",5,4); //basIndex BitIndex ten buyuk olamaz
        altstring("bu da mi gol degil",11,33); //verilen Index sinirlarin disinda

        String str = "Aramiz bozulmasin";
        altstring(str,5,10);  // z boz



    }//main metd.sonu
public static void altstring (String metin, int basIndex, int bitIndex){
        if (basIndex>bitIndex){
            System.out.println("basIndex BitIndex ten buyuk olamaz");
        } else if (basIndex> metin.length() || bitIndex> metin.length()) {
            System.out.println("verilen Index sinirlarin disinda");
        }else {
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(metin.charAt(i));

            }
        }
    System.out.println("");

}
}//class in sonu
