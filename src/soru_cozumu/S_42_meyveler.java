package soru_cozumu;


public class S_42_meyveler {
   String geldigiSehir="belirtilmemis";

    String meyve="muz";
    int fiyat;
    int kg;

    public S_42_meyveler() {
    }

    @Override
    public String toString() {
        return "S_42_meyveler===>>" +
                "geldigiSehir='" + geldigiSehir + '\'' +
                ", meyve='" + meyve + '\'' +
                ", fiyat=" + fiyat +
                ", kg=" + kg +
                '}';
    }

    public S_42_meyveler(String meyve, int kg , int fiyat) {
        this.kg = 2;

        this.fiyat= 2;
        this.meyve=meyve;
    }

    public static void main(String[] args) {
        //Soru 42
        //Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        //Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
        //Ipucu: Constructor konusunu pratik yapalım.
        // Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.

         S_42_meyveler meyve1=new S_42_meyveler("ananas",3,1);
        System.out.println(meyve1);
        S_42_meyveler meyve2 =new S_42_meyveler("ananas",2,2);
        System.out.println(meyve2);

    }

}
