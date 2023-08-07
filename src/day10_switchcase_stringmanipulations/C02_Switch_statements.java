package day10_switchcase_stringmanipulations;

import java.util.Scanner;

public class C02_Switch_statements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun numarasi giriniz");
        int gunNo= scan.nextInt();
        switch (gunNo){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("hafta ici");
                break;
            case 6 :
            case 7 :
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("gun numarasi 1-7 arasinda olmalidir");


        }

    }
}
