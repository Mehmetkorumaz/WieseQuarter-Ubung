package day9_nested_ifelse_statements;

import java.util.Scanner;

public class c08_Switchstatements {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan ay numarasini alip ay ismini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("yazdirmak istediginiz ay kacinci ay");
        int ayno= scan.nextInt();
        if (ayno==1) System.out.println("ocak");
        else if (ayno==3) System.out.println("subat");
        else if (ayno==3) System.out.println("mart");
        else if (ayno==4) System.out.println("nisan");
        else if (ayno==5) System.out.println("mayis");
        else if (ayno==6) System.out.println("haziran");
        else if (ayno==7) System.out.println("temmuz");
        else if (ayno==8) System.out.println("agustos");
        else if (ayno==9) System.out.println("eylul");
        else if (ayno==10) System.out.println("ekim");
        else if (ayno==11) System.out.println("kasim");
        else if (ayno==12) System.out.println("aralik");
        else  System.out.println("ay numarasi yanlis");

        System.out.println("=================================");

        switch (ayno){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("ay numarasi yanlis");
        }


        }
    }

