package day18_Whileloop_dowhileloop;

public class C03_StringiTerseCevirme {
    public static void main(String[] args) {
        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
        //        bu halini bize donduren bir method olusturun.
        System.out.println(metniTerseCevir("asparagas haberler"));


    }

    public static String metniTerseCevir(String metin){
        String tersmMetin="";
        int index = metin.length()-1;

        while (index>=0){
            tersmMetin+=metin.charAt(index);
            index--;
        }
        return tersmMetin;

    }
}
