package String_manipulations;

public class C03_soru {
    public static void main(String[] args) {
        //Soru 6 : Kullanicinin belirli bir formatta verdigi
        // String fiyatlari toplayip yazdirin. input1 : “15.30 €” , input2 : “11.40 €” output : 26.70 €
        double sas=12.17;

        String input1= "15,30 €";
        String input2= "11,40 €";

        input1=input1.replaceAll(".","9");
        input1=input1.replaceAll("\\D","");
        input1=input1.replaceAll("9",".");
        double sayi1=Double.parseDouble(input1);

        input2=input2.replaceAll(".","9");

        input2=input2.replaceAll("\\D","");
        input2=input2.replaceAll("9",".");
        double sayi2=Double.parseDouble(input2);

        System.out.println(sayi1+sayi2);







    }
}
