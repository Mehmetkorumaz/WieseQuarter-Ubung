package day05_matemetikselislemler_incriment;

public class c04_preincrement_postincrement {
    public static void main(String[] args) {
        int a= 20;
        int b= 10;
        System.out.println(b=2*a); // 40
        System.out.println(a=b-5); // 35

        a = 10;
        // once a'nin degerini b'ye atayin, sonra a'yi artirin
        b=a++;
        System.out.println("a nin degeri : "+a+"\nb nin degeri : "+b); //a nin degeri : 11 b nin degeri : 10
        a = 10;
        b=++a;
        System.out.println("a nin degeri : "+a+"\nb nin degeri : "+b); //a nin degeri : 11 b nin degeri : 11
        /*
            Bu kullanim sadece a++ a-- ++a --a icin gecerlidir
            burada ++ veya --'yi once mi yoksa sonra mi kullanacagimiza bizden istenen duruma gore karar veririz
            artirma once ise ++a
            artirma sonra ise a++
         */
        a= 20;
        System.out.println(a++); // 20
        System.out.println(a);  // 21
        a=20;
        System.out.println(--a);  // 19
        System.out.println(a);  // 19
    }
}
