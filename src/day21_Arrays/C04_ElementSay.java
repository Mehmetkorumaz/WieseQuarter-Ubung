package day21_Arrays;

public class C04_ElementSay {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr={3,5,2,3,5,6,7,1,8};
        int arananSayi=5;

        elemenSay(arr,arananSayi);
    }
    public static void elemenSay(int[] arr ,int arananSayi){
        int sayac =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananSayi){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("aranan sayi Array de yok");
        }else {
            System.out.println("aranan "+arananSayi+" Array de "+sayac+" kullanilmistir");
        }
    }
}
