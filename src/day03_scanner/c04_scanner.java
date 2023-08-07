package day03_scanner;

import java.util.Scanner;

public class c04_scanner {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        //        asagidaki formmatta yazdirin.
        //      Isminiz : John
        //      Soyisminiz : Doe
        //      Yasiniz : 44
        //      Kaydiniz basariyla tamamlanmistir.
     Scanner scanner = new Scanner(System.in);
        System.out.printf("lutfen isminizi yaziniz");
        String girilenIsim=scanner.nextLine();
        System.out.printf("lutfen soyisminizi yaziniz");
        String girilenSoyisim=scanner.nextLine();
        System.out.printf("lutfen yasinizi yaziniz");
        int girilenYas = scanner.nextInt();
        System.out.printf("isminiz : "+girilenIsim);
        System.out.printf("soyIsminiz : "+girilenSoyisim);
        System.out.printf("yasiniz : "+girilenYas);
        System.out.printf("kaydiniz basariyla tamamlanmistir.");
        // sout icerisindeki bir String'in yazdirilmasina
        // alt satirdan devam edilmesini isterseniz
        // String'in alt satira gecmesini istediginiz kisminda \n yazin
        System.out.printf("\nisminiz : "+girilenIsim);
        System.out.printf("\nsoyIsminiz : "+girilenSoyisim);
        System.out.printf("\nyasiniz : "+girilenYas);
        System.out.printf("\nkaydiniz basariyla tamamlanmistir.");

    }
}
