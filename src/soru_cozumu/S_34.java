package soru_cozumu;

public class S_34 {
    public static void main(String[] args) {
        //Bir String'i parametre olarak kabul eden ve
        // verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.
        //Örnek
        //String str : ade1r4d3
        //Int toplam : 8
        //İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
        //                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz

        String metin="ja76va 14can24dir";
        metin=metin.replaceAll("\\D" ,"");
        System.out.println(metin);

        int metinRakam=Integer.parseInt(metin);

        int toplam=0;
        int rakamlar=0;

        for (int i = 0; i <metin.length(); i++) {
             rakamlar=metinRakam%10;
             toplam+=rakamlar;
             metinRakam/=10;

        }
        System.out.println(toplam);


    }
}
