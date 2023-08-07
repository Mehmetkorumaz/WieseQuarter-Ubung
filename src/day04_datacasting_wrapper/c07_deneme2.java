package day04_datacasting_wrapper;

public class c07_deneme2 {
    public static void main(String[] args) {
        String str= "jawa Candir";
        System.out.println(str.charAt(3)); //a

        int sayi2= 5;
      Integer sayi3 = sayi2;
      int sayi4= sayi3;
// asagidaki yazdirimda integer in max min, degerlerini gosterir
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648
//Short sayi5= sayi3; wrapper classlar arasinda casten olmaz
        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Short.MIN_VALUE); //-32768
    }
}
