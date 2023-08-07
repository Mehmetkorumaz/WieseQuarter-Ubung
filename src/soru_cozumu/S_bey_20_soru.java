package soru_cozumu;

import java.util.Scanner;

public class S_bey_20_soru {
    public static void main(String[] args) {
     //Soru 20-)
        //Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır. Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
        //Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ; aynı karakterlere sahip degilse
        // "String benzersiz karakterlere sahip"
        //yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.
        //
        //                Örnek:
        //                giriş: ama
        //		çıkış: Dizede yinelenen karakterler var
        //                İpucu: İf Else ve Char kullanarak çözebiliriz.
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen yolun uzunlugunu km olarak giriniz");
        String isim= scanner.nextLine();
        int uzunluk =isim.length();

        char ch1= isim.charAt(0);
        char ch2= isim.charAt(1);
        char ch3= isim.charAt(2);

        if (uzunluk==3){
            if (ch1==ch2 || ch1==ch3 || ch2==ch3){
                System.out.println("Dizede yinelenen karakterler var");
            }else {
                System.out.println("String benzersiz karakterlere sahip");
            }
        }else {
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        }

    }
}
