package day04_datacasting_wrapper;

public class c05_wrapperclasses {
    public static void main(String[] args) {
        String str="Jawa Candir";
        System.out.println(str.charAt(3)); //a
        int sayi = 20;
        /*
            Java primitive data turleri icin hazir method olusturamaz
            ANCAK
            primitive data turleri icin de hazir method'lar kullanabilecek
           Wrapper class'lar olusturmustur
           int ==> Integer
           char ==> Character
           short ==> Short
           double ==> Double ....
           Wrapper class'lar primitive data turleri ile hic problemsiz atama yapilabilir

         */
        int sayi2= 5;
        Integer sayi3 = sayi2;
        int sayi4 = sayi3;

    }
}
