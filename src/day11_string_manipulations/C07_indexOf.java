package day11_string_manipulations;

public class C07_indexOf {
    public static void main(String[] args) {
        String str = "Ali topu at, at ali at";
        //Ali nin indexi nedir?
        System.out.println(str.indexOf("Ali"));//0

        System.out.println(str.indexOf("at"));//9

        System.out.println(str.indexOf("op"));//5
        System.out.println(str.indexOf("a",10));//13
        System.out.println(str.indexOf("mehmet")); // -1



    }
}
