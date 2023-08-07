package soru_cozumu;

public class S_39 {
    public static void main(String[] args) {
        //Soru-38)
        //Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden) diziden minimum ve
        // maksimum sayıları yazdıran bir yöntem yazın
        //Örnek:
        //Input : {3,2,5,4,1,6}
        //Output :
        //min: 1
        //max: 6
        //Ipucu: sort yöntemni kullanabilirsiniz.
        int[] arr={3,2,5,4,1,6};
        int enBuyukSayi=arr[0];
        int enKucukSayi=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }
            if (arr[i]<enKucukSayi){
                enKucukSayi=arr[i];
            }
        }
        System.out.println("en buyuk sayi : "+enBuyukSayi);
        System.out.println("en kucuk sayi : "+enKucukSayi);
    }
}
