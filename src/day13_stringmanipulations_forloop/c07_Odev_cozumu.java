package day13_stringmanipulations_forloop;

import java.util.Scanner;

public class c07_Odev_cozumu {
    public static void main(String[] args) {
        //Soru 1 : Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Cumle Giriniz");
        String metin =scan.nextLine().toLowerCase();
        if (metin.contains("is")&&metin.contains("ev")){
            System.out.println("Hem ev lazim hem is");
        } else if (metin.contains("is")) {
            System.out.println("calismak guzeldir");
        } else if (metin.contains("ev")) {
            System.out.println("home home sweet home");

        }else {
            System.out.println("cok calisman lazim");
        }


    }
}
