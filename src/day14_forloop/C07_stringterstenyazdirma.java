package day14_forloop;

import java.util.Scanner;

public class C07_stringterstenyazdirma {
    public static void main(String[] args) {
        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen tersten yazdirmak istediginiz metni giriniz");
        String str = scan.nextLine();
        //Java Candir       =======>>  ridnaC avaJ    tersinden yazdirimi...

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));

        }
        System.out.println("");
        String tersMetin= "";
        for (int i = str.length()-1; i >=0; i--) {
            tersMetin+=str.charAt(i);

        }
        System.out.println("ters cevrilen metin : "+ tersMetin);




        }
    }

