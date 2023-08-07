package soru_cozumu;


import java.util.Scanner;

public class S_37 {
    static String tekrarsizlar="";
    static String sayilar="";
    public static void main(String[] args) {
        //Soru 37-)
        //SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
        //(Eliminate duplicates)
        //ENG:
        //Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
        //Write a test program that reads in ten integers, invokes the method, and displays the result.
        //(Tekrarlananları çıkar)
        //TÜR:
        //Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
        //On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
        //---->>>
        //public static int[] eliminateDuplicates(int[] list)
        //ÖRNEK:
        //On sayi giriniz:
        //1 2 3 2 1 6 3 4 5 2
        //ÇIKTI:
        //Birbirinden farkli girilen sayilar: 1 2 3 6 4 5


     eliminateDuplicates(tekrarsizlar);


    }
    public static String eliminateDuplicates(String list){


        for (int i = 0; i < 10; i++) {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Lutfen bir rakam giriniz :  ");
            sayilar=scanner.nextLine();
            sayilar+=i;

        }
        System.out.print(sayilar);
        for (int i = 0; i <sayilar.length() ; i++) {
            for (int j = 0; j <tekrarsizlar.length() ; j++) {
                if(sayilar.charAt(i)==tekrarsizlar.charAt(j)&& sayilar.indexOf(tekrarsizlar.charAt(j))<0){
                    tekrarsizlar+=i;

                }
            }
            System.out.println(tekrarsizlar);

        }
        return tekrarsizlar;

    }
}
