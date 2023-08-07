package day26_forEachloop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ortakElementleriBulma {
    public static void main(String[] args) {
        //Soru 5- Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.
       Integer[] arr1={3,5,8,1,3,9,2,4,7,1};
        Integer[] arr2={2,7,3,5,8,1,9,0,3,5,7,};
        List<Integer> ortalElemanlarListesi=new ArrayList<>();

        for (Integer each1:arr1
             ) {
            for (Integer each2 :arr2
                 ) {
                if (each1==each2 && !ortalElemanlarListesi.contains(each1));
                ortalElemanlarListesi.add(each1);
            }
        }
        System.out.println(ortalElemanlarListesi);
    }
}
