package day06_concatenation_matemtoperatorler;

public class c01_concatenation {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";
        int a = 3;
        int b = 5;
        // sadece yukardaki variable'lari kullanarak
        // asagida verilen metin'leri yazdirin
        // Java35
        System.out.println(s1+a+b);

        //Jawa15
        System.out.println(s1+a*b);

        //8Candir
        System.out.println((a+b)+s2);

        //53Jawa
        System.out.println(s4+b+a+s1);
        System.out.println( b+ (a+s1)  );// "53Java"

        // 35 Jawa
        System.out.println(s4+a+b+s3+s1);// s4 olmazsa 8 Jawa yazdirir-+++
    }
}
