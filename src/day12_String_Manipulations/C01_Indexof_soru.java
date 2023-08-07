package day12_String_Manipulations;

public class C01_Indexof_soru {
    public static void main(String[] args) {

        String str= "Ali topu at, topu at ali";
        // ilk top metin parcasinin index'ini yazdirin
        System.out.println(str.indexOf("top"));// 4

        // ilk top metin parcasinin index'ini yazdirin
        System.out.println(str.indexOf("top",5));
        System.out.println(str.indexOf("top",str.indexOf("top")+1));

        // at kelimesinin 2 kere kullanilip kullanilmadigini metne bakmadan bulun
        int ilkIndex= str.indexOf("at");
        if (ilkIndex== -1){ // hic yok
            System.out.println("at kalimesi hic kullanilmamis");

        }else {// en az 1 kere kullanilmis
            int ikinciIndex= str.indexOf("at",ilkIndex+1);
            // -1 veya 2.defa kullanilmissa dogal sayi olur
            if (ikinciIndex==-1){
                System.out.println("2 kere kullanilmamis");

            }else {
                System.out.println("2 veya daha fazla kullanilmis");
            }



        }






    }
}
