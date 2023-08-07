package day26_forEachloop_constructor;

public class C01_enBuyukElementBulma {
    public static void main(String[] args) {
        // en buyuk elemnti bulma
        int[] arr = {3,6,9,1,3,7,12,34,23,87,32,43};
        int enBuyukElement=arr[0];
        for (int each:arr
             ) {
            if (each>enBuyukElement){
                enBuyukElement=each;
            }
        }
        System.out.println("arraydeki en buyuk element : "+enBuyukElement);
    }
}
