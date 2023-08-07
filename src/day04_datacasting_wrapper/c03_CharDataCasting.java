package day04_datacasting_wrapper;

public class c03_CharDataCasting {
    public static void main(String[] args) {
        char ch1 = 'C';
        int sayi1= ch1;
        System.out.printf("ch1 : "+ch1);
        System.out.printf("\nsayi1 : "+sayi1); // 67
//

        String str1 = "jawa";
        String str2 = " ";
        String str3 = "candir";
        System.out.printf(str1+str2+str3); //jawa candir

        char ch2 = 'a';
        char ch3 = 'b';
        System.out.println(ch2+ch3); //97+98=195
        // verilen int bir sayinin ascii tablosundaki char karsiligini yazdirin
        int karakter = 97 ;
        char asciDegeri = (char) karakter;
        System.out.printf("verilen sayinin asci tablosundaki karsiligi : "+ asciDegeri); // a= 97




    }
}
