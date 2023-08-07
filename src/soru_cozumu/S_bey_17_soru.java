package soru_cozumu;

import java.util.Scanner;

public class S_bey_17_soru {
    public static void main(String[] args) {
        //Soru 17-)
        //Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
        // Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
        //İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
        // değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen 3 harfden olusan bir isim giriniz");
        String isim = scanner.next();

        char ch1= isim.charAt(0);
        char ch2= isim.charAt(1);
        char ch3= isim.charAt(2);

        if (isim.length()==3){
            if (ch1==ch2 || ch2==ch3 || ch1==ch3){
                System.out.println("Dize yinelenen karakterlere sahip");
            }else{
                System.out.println("Dize benzersiz karakterlere sahip");
        }
        } else {
            System.out.println("hatali giris !! ,isim 3 harften olusmalidir");
        }




    }
}
