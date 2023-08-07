package day26_forEachloop_constructor;

public class C02_harfKullanimAdedi {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
        String cumle = "Java her gecen gun daha zevkli hale geliyor";
        String harf ="a";
        String[] cumleArr=cumle.split("");
        int sayac=0;
        for (String each:cumleArr
             ) {
            if (each.equals(harf)){

            }
        }
        if (sayac==0){
            System.out.println("aradiginiz harf cumlede kullanilmamistir");
        }else {
            System.out.println("aradiginiz "+harf+" cumlede "+sayac+ " kez kullanilmistir");
        }
    }
}
