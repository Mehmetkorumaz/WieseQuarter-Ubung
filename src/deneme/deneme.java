package deneme;

import java.util.Scanner;

public class deneme {
  //Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
  //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
  //Or : 6! = 6  5  4  3  2 * 1 = 720
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.println("lutfen 20'den kucuk bir tam sayi giriniz");
        int sayi= scanner.nextInt();
        String islem="";
        int carpim=1;
        for (int i = sayi; i >=1 ; i--) {
            System.out.print(i+"*");
            carpim*=i;


        }

        System.out.println(sayi+"! "+ islem + "= " +carpim);
    }


}

