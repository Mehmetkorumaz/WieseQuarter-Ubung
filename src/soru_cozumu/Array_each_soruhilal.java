package soru_cozumu;

import java.util.ArrayList;
import java.util.List;

public class Array_each_soruhilal {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip, -
        // Kelimenin uzunlugu cift sayi ise ilk yarisini -
        // Kelimenin uzunlugu tek sayi ise
        // ortadaki harf dahil ikinci yarisini yeni bir listeye ekleyip yazdirin.
        String [] str ={"Burhan", "Nergiz","Seref","Senol"};
        // bunun kontrolunu saglamak icin bir method olusturacaz
        stringManipulasyon(str);
    }
    public static void stringManipulasyon (String [] str){
        List<String> yeniList= new ArrayList<>();
        for (String each: str
        ) {
            if (each.length() %2==0){
                yeniList.add(each.substring(0,each.length()/2));
            }else {
                yeniList.add(each.substring((each.length()-1)/2));
            }
        }
        System.out.println(yeniList);
    }
}
