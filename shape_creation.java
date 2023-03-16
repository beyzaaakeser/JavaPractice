package internet_sorulari_arrays_soru_cozumleri;

import java.util.Scanner;

public class Soru2AVeYildizSorusu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int str = input.nextInt();
        System.out.println("Lutfern sutun sayisini giriniz.");
        int stn = input.nextInt();




        for(int i = 1 ; i <=str; i++){

            for (int k = 1 ; k<=stn ; k++){
                if (i==1 || i==str){
                    System.out.print("A ");
                } else if (k==1 || k==stn) {
                    System.out.print("A ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println();

        }















































    }
}
