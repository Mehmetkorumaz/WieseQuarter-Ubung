package day04_datacasting_wrapper;

import java.util.Scanner;

public class c04_charcasting {
    public static void main(String[] args) {

        // Kullanicidan bir char isteyin
        // girilen char'dan sonraki 3 karakteri yazdirin
        // Orn : input : a   output : b,c,d

        Scanner scanner = new Scanner(System.in);
        System.out.printf("lutfen asci tablosundan bir karakter seciniz");
        char secilenKarakter = scanner.next().charAt(0);

        // scanner.nextChar() method'u olmadigindan
        // once .next() ile String olarak alip, sonra o String'in ilk karakterini alalim

        System.out.printf("girilen Karakter : "+ secilenKarakter);
        System.out.printf("\nsecilen karakterden sonraki 3 karakter : "+ (char) (secilenKarakter+1)+(char)(secilenKarakter+2)+(char)(secilenKarakter+3));

    }
}
