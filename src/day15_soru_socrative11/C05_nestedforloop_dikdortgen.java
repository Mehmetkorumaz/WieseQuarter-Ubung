package day15_soru_socrative11;

public class C05_nestedforloop_dikdortgen {
    public static void main(String[] args) {
        int satir = 5;
        int sutun = 7 ;
        // dikdortgen bicimde, satir ve sutun numaralarini yazdiralim

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print(i+","+j+"    ");

            }
            System.out.println("");

        }
        System.out.println("========================================================");
        for (int i = 1; i <=satir; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+","+j+"    ");

            }
            System.out.println("");
        }



    }
}
