package day03_scanner;

import java.util.Scanner;

public class c05_scanner {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //         dikdortgenin alanini yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.printf("lutfen dikdortgenin kenarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        System.out.printf("dikdortgenin alani : "+kenar1*kenar2);
    }
}
