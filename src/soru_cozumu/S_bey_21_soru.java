package soru_cozumu;

import java.util.Scanner;

public class S_bey_21_soru {
    public static void main(String[] args) {
      //Soru 21-)  ---> Mülakat Sorusu / Interview Sorusu / Leak Year
        //Bir aydaki gün sayısını bulmak için bir Java programı yazın
        //Örnek:
        //Bir ay numarası girin: 2
        //Bir yıl girin: 2016
        //Şubat 2016'da 29 gün vardır
        //ipucu:
        //Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir.
        // Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
        //Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
        //ipucu2:
        //ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
        //1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
        //Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
        //2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
        //Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.

        Scanner scanner= new Scanner(System.in);
        System.out.print("lutfen bir yil numarasi giriniz : ");
        int yil = scanner.nextInt();

        System.out.print("lutfen bir ay numarasi giriniz : ");
        int ay = scanner.nextInt();

        int uzunluk= (yil+"").length();



                switch (ay){
            case 1:
                System.out.println(yil+"  yili ocak ayinda 31 gun vardir ");
                break;
            case 2:
                artikYil(yil);
                break;
            case 3:
                System.out.println(yil+"  yili ocak ayinda 31 gun vardir ");
                break;
            case 4:
                System.out.println(yil+"  yili ocak ayinda 30 gun vardir ");
                break;
            case 5:
                System.out.println(yil+"  yili ocak ayinda 31 gun vardir ");
                break;
            case 6:
                System.out.println(yil+"  yili ocak ayinda 30 gun vardir ");
            case 7:
                System.out.println(yil+"  yili ocak ayinda 31 gun vardir ");

            case 8:
                System.out.println(yil+"  yili ocak ayinda 31 gun vardir ");
                break;
            case 9:
                System.out.println(yil+"  yili ocak ayinda 30 gun vardir ");
                break;

            case 10:
                System.out.println(yil+"  yili ocak ayinda 31 gun vardir ");
                break;
            case 11:
                System.out.println(yil+"  yili ocak ayinda 30 gun vardir ");
                break;
            case 12:
                System.out.println(yil+"  yili ocak ayinda 31 gun vardir ");
                break;
            default:
                System.out.println("ay girisi hatali, ");
        }



    }
    public static void artikYil(int yil){

        if((yil%100!=0 && yil %4 ==0)|| (yil%100==0 && yil %400 ==0)){ // artik yil
            System.out.println(yil+ "  yili Subat ayinda 29 gun vardir");

        }else{
            System.out.println("   yili Subat ayinda 28 gun vardir");
        }


    }

}
