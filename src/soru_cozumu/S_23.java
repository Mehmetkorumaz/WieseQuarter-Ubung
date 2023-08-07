package soru_cozumu;

public class S_23 {
    public static void main(String[] args) {
        //Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın. Method bize çıktıyı döndürsün.
        //Örnek:
        //Girdi: 6
        //Çıktı: 6!=65432*1=720
        //ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın

        System.out.println(faktoriyel(6));

    }
    public static int faktoriyel(int sayi){
         int carpim=1;

        for (int i = sayi; i >0 ; i--) {
            carpim*=i;
        }
        return  carpim;
    }
}
