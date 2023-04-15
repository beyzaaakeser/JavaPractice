package internet_sorulari_arrays_soru_cozumleri;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisi giriniz.");
        int satir = input.nextInt();
        System.out.println("Lutfen sutun sayisini giriniz.");
        int sutun = input.nextInt();



        for (int i = 1 ; i <= satir ; i++ ){

            for (int k = 1 ; k<= sutun ; k++){

                if (i == satir || i == 1){
                    System.out.print("* ");
                } else if (k == sutun || k==1) {
                    System.out.print("* ");
                }else System.out.print("o ");

            }

            System.out.println();
        }
































    }
}
