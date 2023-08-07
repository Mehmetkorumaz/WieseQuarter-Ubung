package day04_datacasting_wrapper;

import java.util.Scanner;

public class c06_deneme {
    public static void main(String[] args) {
        // Kullanicidan bir char isteyin
        // girilen char'dan sonraki 3 karakteri yazdirin
        // Orn : input : a   output : b,c,d
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen asci listesinden bir karakter secin");
        char girilenKrt =scanner.next().charAt(0); // 0 birinci harfi 1 -- 2. harfi alir....
        // scanner.nextChar() method'u olmadigindan
        // once .next() ile String olarak alip, sonra o String'in ilk karakterini alalim

        System.out.println("girilen karakter : "+ girilenKrt);
         // a1a2ya3
        System.out.println("girilen karakterden sonraki 3 karakter : "+(girilenKrt+1)+
                (girilenKrt+2)+
                (girilenKrt+3)); //98,99,100
        System.out.println("girilen karakterden sonraki 3 karakter : "+(char)(girilenKrt+1)+
                (char)(girilenKrt+2)+
                (char)(girilenKrt+3)); // bcd
        ////////////////////////////////////////////////////////
        // diger class
        String str= "jawa Candir";
        System.out.println(str.charAt(3)); //a


    }
}
