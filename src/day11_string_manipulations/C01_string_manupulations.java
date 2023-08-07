package day11_string_manipulations;

public class C01_string_manupulations {
    public static void main(String[] args) {
        String str = "Jawa Candír";

        //ilk harfi yazdirin
        System.out.println(str.charAt(0));// J

        //7. harfi yazdirin
        System.out.println(str.charAt(6));// a

        //son  harfi yazdirin(metin uzunlugu 11)
        System.out.println(str.charAt(10));//r

        // eger sondan basa dogru gelecek sekilde bir char isteniyorsa
        // charAt(uzunluk - sondanKacinciKarakter)
        // sondan 3. harfi yazdirin
        System.out.println(str.charAt(11-3));// d
        System.out.println(str.charAt(str.length()-3));
        // metnin uzunlugundan daha buyuk bir siradaki karakter istenirse
        // 20.karakteri yazdirin
        // System.out.println(str.charAt(20)); // StringIndexOutOfBoundsException

        //4.harfi buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase().charAt(3));//A
        /*
            charAt()'u bize char data turunde bir sonuc verir (döndürür)
            toUpperCase() gibi method'lar String variable'lar ile calistigindan
            charAt() calistiktan sonra String Manipulation YAPILAMAZ
            eger manipulation ihtiyaci varsa, charAt() kullanilmadan once yapilmalidir

         */


    }
}
