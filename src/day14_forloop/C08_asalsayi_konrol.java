package day14_forloop;

import java.util.Scanner;

public class C08_asalsayi_konrol {
    public static void main(String[] args) {
        //11- Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen pozitif tam sayi giriniz");
        int sayi = scan.nextInt();
        boolean flag = true;

        for (int i = 2; i < sayi ; i++) {
            if (sayi %i ==0){
                System.out.println("asalsayi degil");
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println("girilen sayi asalsayi");
        }

        
    }
}
