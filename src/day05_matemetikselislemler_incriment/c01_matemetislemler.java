package day05_matemetikselislemler_incriment;

public class c01_matemetislemler {
    public static void main(String[] args) {
  int a = 27;
  int b= 4;
        System.out.println(a/b); // 6,75 ==> 6

        System.out.println(32/5); // 6,4 ==> 6
        // Eger bolunen sayi veya bolen sayidan double olan varsa sonucu double olarak verir.
        double c = 27;
        System.out.println(c/b); // 6,75 =>> 6,75
        // a yi b ye bolun sonucu ondalikli olarak yadirin
        double sonuc1= a/b ;
        System.out.println("sonuc1 : "+sonuc1);// 6,75 ==> 6,0

        double sonuc2= (double) (a/b);
        System.out.println("sonuc2 : "+ sonuc2);// 6,75 ==> 6,0

        double sonuc3 = (double) a/b;
        System.out.println("sonuc3 : "+sonuc3); //6,75 ==> 6,75

        System.out.println(2567/10); //256,7 = 256
        System.out.println(2567%10); //7

        System.out.println(256/10); //25,6 = 25
        System.out.println(256%10); //6

        System.out.println(25/10); //2,5 = 2
        System.out.println(25%10); //5

        System.out.println(2/10); //0,2 = 0
        System.out.println(2%10); //2



        }
    }











