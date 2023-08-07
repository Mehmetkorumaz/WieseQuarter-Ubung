package day05_matemetikselislemler_incriment;

public class c03_increment_decrement {
    public static void main(String[] args) {
        int sayi = 10;
        sayi =2*sayi+5;
        System.out.println(sayi);
        // 2. yontem
        sayi =10;
        sayi*=2;
        sayi+=5;
        System.out.println(sayi);
        int a= 10;
        int b = a;
        a++;
        System.out.println("a : "+ a+"\nb : "+b);
        a= 10;
        a++;
        b=a;
        System.out.println("a : "+ a+"\nb : "+b);

    }
}
