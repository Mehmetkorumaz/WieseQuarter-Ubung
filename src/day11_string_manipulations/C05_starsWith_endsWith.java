package day11_string_manipulations;

public class C05_starsWith_endsWith {
    public static void main(String[] args) {
        String str = "Jawa Candir";
        //str Jawa ile mi basliyor
        System.out.println(str.startsWith("Jawa")); //true
       //str Ja ile mi basliyor
        System.out.println(str.startsWith("Ja"));// true


       //str J ile mi basliyor
       System.out.println(str.startsWith("J")); // true

       //str Jawa cok guzel ile mi basliyor
       System.out.println(str.startsWith("Jawa cok guzel"));//tru
       System.out.println(str.startsWith(""));//true
       // 5. indexten sonra
       System.out.println(str.startsWith("cok",5));
       System.out.println(str.startsWith("ok",6));

        // str guzel ile mi biter
        System.out.println(str.endsWith("guzel"));

        // str el ile mi biter
        System.out.println(str.endsWith("el"));

        // str hic ile mi biter
       System.out.println(str.endsWith(""));//true
       System.out.println(str.endsWith(" "));//false


    }
}
