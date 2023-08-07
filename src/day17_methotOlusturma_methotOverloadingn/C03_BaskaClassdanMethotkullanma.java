package day17_methotOlusturma_methotOverloadingn;

import day16_method_olusturVeKullanma.C01_methotOlusturma;
import day16_method_olusturVeKullanma.C03_methot_olusturma;

public class C03_BaskaClassdanMethotkullanma {
    public static void main(String[] args) {
        C01_methotOlusturma.altstring("methot budur...",7,8);
        System.out.println(C03_methot_olusturma.isimDuzenleme("kadir","kemal"));
        System.out.println(C03_methot_olusturma.isimDuzenleme("ali", "yilmaz"));

        System.out.println(C01_asalsayibulma.asalSayimi(43));
        System.out.println(C02_tamBolenler_sayisi.tamBolenlersayisi(12));

    }
}
