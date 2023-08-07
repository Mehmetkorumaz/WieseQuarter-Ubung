package day21_Arrays;

import java.util.Arrays;

public class C02_arrayinElementleriniIstenenKadarArtirma {
    public static void main(String[] args) {
        int [] arr={3,5,2,7};
        int artis=4;
        // Arrayin tum elementlerini artis miktari kadar artirin

        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=artis;

        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[] elementleriArtir(int[] arr, int artis){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + artis;

           // arr[i] + = artis;
        }
        return arr;
    }
}
