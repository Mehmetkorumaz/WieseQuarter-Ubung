package day10_switchcase_stringmanipulations;

import java.util.Locale;

public class C04_toUppercase_toLowercase {
    public static void main(String[] args) {
        String str = "Java Candır";
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        str = str.toUpperCase(); //JAVA CANDIR

        System.out.println(str.toLowerCase());//java candır

        // eger yerel bir dile gore buyuk kucuk harf degisimi yapmak istersek
        System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));



    }
}
