package day11_string_manipulations;

public class C03_substring {
    public static void main(String[] args) {
        String str = "Java Candir";
        /*
            substring() bize verilen bir String'in istenen parcasini alma imkani tanir
            2 turlu kullanimi vardir
            1- baslangic index'ini verirseniz, o indexten sona kadar olan kismi verir
            2- baslangic ve bitis indexlerini verirseniz
               baslangic index'inden (dahil) baslar
               bitis index'ine kadar(haric) aradaki karakterleri yazdirir
         */
        //4. den basla
        System.out.println(str.substring(3));// a Candir
        //8. den basla
        System.out.println(str.substring(7));// ndir

        // 10 karakter var 11 ise hiclik yazdirir
        System.out.println(str.substring(11));
        // 4. ile 7. karakter arasini

        System.out.println(str.substring(5,10));//Candi
        // bu yazim bize istenen index'deki tek bir elementi verir
        // charAt()'e benzer ama arti bir ozelligi var
        // substring bize String verdigi icin manipulation yapmaya devam edebiliriz
        // 6.indexdeki harfi buyuk harf olarak yazdirin
        System.out.println(str.substring(6,7).toUpperCase());
        System.out.println(str.substring(3,3)); // hiclik yazdirir
        // System.out.println(str.substring(8,5)); // StringIndexOutOfBoundsException

        // son 3 harfini yazdirin
        System.out.println("son uc harfi : "+str.substring(str.length()-3));

        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candir";
        System.out.println(str1+ str2 + str3); // Java Candir
        System.out.println(str1.concat(str2).concat(str3)); // Java Candir

    }


    }

