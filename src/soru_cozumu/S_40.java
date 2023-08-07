package soru_cozumu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_40 {
    public static void main(String[] args) {
        //Soru 40-)
        //Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
        //		 * Input1={1,2,3,4}
        //		 * Input2={5,6}
        //		 * Çıktı={1,2,3,4,5,6}

        int[] arr1={1,2,3,4,};
        int[] arr2={5,6};
        List<Integer> arryeni=new ArrayList<>();
       int[] yeniArr=new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length ; i++) {
            yeniArr[i]=arr1[i];
        }
        Arrays.sort(yeniArr);
        for (int i = 0; i < arr2.length ; i++) {
            yeniArr[i]=arr2[i];
        }
        Arrays.sort(yeniArr);
        System.out.println(Arrays.toString(yeniArr));


    }



}
