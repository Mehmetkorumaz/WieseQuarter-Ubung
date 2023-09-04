package day41_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class deneme3 {
    public static void main(String[] args) {
        //kullanicidan toplanmak uzere tamsayilar alin
        //kullanici tamsayi girmezse hata mesaji verin
        //kullanici islemi bitirmek icin q yada Q ya basacaktir
        //Kullanici islemi bitirdiginde kactane sayi girdigini ve sayilarin toplamini yazdirin
        int sayi=0;
        int toplam=0;
        int sayac=0;
        boolean sayiIste=true;
        String tercih="";
        Scanner scanner=new Scanner(System.in);

        while (sayiIste){

            System.out.println("lutfen toplanmak uzere tamsayilar giriniz\nBitirmek icin q ya basiniz");

            try { // normal girislerde calisacak kodlar
                sayi= scanner.nextInt();
                toplam+=sayi;
                sayac++;
            } catch (InputMismatchException e) {// Exceptions ta calisacak kodlar
                tercih=scanner.next();// kullanici yanlis giris yaptiginda veya Q ya bastiginda
                if (tercih.equalsIgnoreCase("q")){
                    sayiIste=false; // veya direk break yazila bilir
                }else{
                    System.out.println("toplamak icin tamsayi girmeniz gerekiyor");
                }

            }
        }
        System.out.println("toplam : "+ sayac+"  ,adet sayi girdiniz. Toplamlari :  "+toplam);
    }
}
