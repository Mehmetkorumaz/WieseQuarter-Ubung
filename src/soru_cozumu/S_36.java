package soru_cozumu;

import java.util.Arrays;
import java.util.Scanner;

public class S_36 {
    public static void main(String[] args) {
        //Soru 36-)
        //Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
        // ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
        //Örnek:
        //inputarr[]=   {1,2,3,4,5,6,7}
        //output:         4
        //İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz. Kendinizi geliştirme adına sorunun cevabını degişik yollardan
        // yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen ortadaki degri bulunacak Array uzunlugu giriniz");
        int uzunluk = scanner.nextInt();
        int[] arr = new int[uzunluk];

            for (int i = 0; i <uzunluk ; i++) {
                scanner=new Scanner(System.in);
                System.out.println("lutfen olusturmak istedidiginiz Arrayin rakamlarini giriniz");
                arr[i]= scanner.nextInt();
            }
        System.out.println(Arrays.toString(arr));
        if (uzunluk%2 !=0){
            System.out.println("girilen Array in ortadaki elementi : "+arr[uzunluk/2]);
        } else {
            System.out.println("girilen Array in ortadaki elementeri : "+arr[uzunluk/2-1]+arr[uzunluk/2]);

        }
    }
}
