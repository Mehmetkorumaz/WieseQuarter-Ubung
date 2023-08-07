package day12_String_Manipulations;

public class C04_nullPointer {
    public static void main(String[] args) {
        String str1;   // deklere ettikmten, sonra deger atana bilir
        str1="Java";
        System.out.println(str1);
        System.out.println(str1+" Candir");
        /*
            null bir deger degil pointer(isaretleyici)
            16.satir icin
            str2'nin degeri null veya str2'ye null degeri atanmis ifadeleri YANLISTIR
            dogru olan ifade
            str2'ye deger atamadik, bunun farkindayiz ve null olarak isaretledik
         */
        String str2 = null;
        System.out.println(str2); // null
        System.out.println(str2 + " candir"); // null candir
        // System.out.println(str2.concat(" candir")); // NullPointerException

        str2= "tava";
        System.out.println(str2);// tava
        System.out.println(str2.concat(" Candir"));

        String str3 = null;
        String str4 = "";
        System.out.println(str4.isEmpty()); // true
        System.out.println(str4.isBlank()); // true

        //System.out.println(str3.isEmpty()); // NullPointerException
       // System.out.println(str3.isBlank()); // NullPointerException





    }
}
