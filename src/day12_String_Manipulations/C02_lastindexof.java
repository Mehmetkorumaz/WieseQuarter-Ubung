package day12_String_Manipulations;

public class C02_lastindexof {
    public static void main(String[] args) {
        String str = "Jawa yi ogrenecegiz baska yolu yok";
        // a harfinin ilk kullanim indexini yazdirin
        System.out.println(str.indexOf("a"));// 1
        System.out.println(str.lastIndexOf("a"));//24
        // J harfinin ilk indexini yazdirin
        System.out.println(str.indexOf("J"));// 0
        System.out.println(str.lastIndexOf("J"));// 0
        // metne bakmadan e harfinin ikikere veya daha fazla kullanilip kullanilmadigini yazdirin
        int ilkIndex = str.indexOf("e");
        int sonIndex = str.lastIndexOf("e");
        if (ilkIndex==-1){
            System.out.println("hic kullanilmamis");
        } else if (ilkIndex==sonIndex) {
            System.out.println("birkere kullanilmis");

        }else {
            System.out.println("2 veya daha fazla kullanilmis");
        }
        // "Javayi ogrenecegiz, baska yolu yok";
        // o harfinin son index'ini yazdirin
        System.out.println(str.lastIndexOf("o"));//32

        // o harfinin son kullanimindan bir onceki kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("o",31));
        System.out.println(str.lastIndexOf("o",str.lastIndexOf("o")-1));

        // k harfinin son kullaniminin indexini yazdiralim
        System.out.println(str.lastIndexOf("k"));

    }

    }

