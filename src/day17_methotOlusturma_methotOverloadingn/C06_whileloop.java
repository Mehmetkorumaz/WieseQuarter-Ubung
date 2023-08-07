package day17_methotOlusturma_methotOverloadingn;

public class C06_whileloop {
    public static void main(String[] args) {

        // birden 100 e kadar olan sayilari forloop ile hesaplayin

        int toplam=0;

        for (int i = 1; i <=100 ; i++) {
            toplam+=i;
        }
        System.out.println("1 den 100 e sayilar toplami : "+toplam); //5050

        // sorunun while loop ile hesaplanmasi asagida
         toplam=0;
         int i =1;
         while (i<=100){
             toplam +=i;
             i++;
         }
        System.out.println("while loop ile sayilar toplami : "+toplam);

    }

}
