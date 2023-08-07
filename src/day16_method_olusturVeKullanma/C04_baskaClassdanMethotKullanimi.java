package day16_method_olusturVeKullanma;

public class C04_baskaClassdanMethotKullanimi {

    public static void main(String[] args) {
        C01_methotOlusturma.altstring("Methot",1,3);//   et

        C03_methot_olusturma.isimDuzenleme("ali","bugra"); // calisti ama yazdirmadi...
        System.out.println(C03_methot_olusturma.isimDuzenleme("ali","bugra"));// Ali Bugra


        //kayit edildi ama yazdirmiyor
        String isimDuzenli= C03_methot_olusturma.isimDuzenleme("mehmet","kemal"); // kayit
        // yazdirma
        System.out.println(C03_methot_olusturma.isimDuzenleme("mehmet","kemal")); // yazdirma islemi

        // duzenli isim uzunlugu yazdirin.
        System.out.println(isimDuzenli.length());  //   12
    }

}
