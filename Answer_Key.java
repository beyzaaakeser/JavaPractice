package day10_arrays;

public class C05_Odev {
    public static void main(String[] args) {



        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};


        testsonucu(answers,keys);// method ismi mainin icinde.



    } // main

    private static void testsonucu(char[][] answers, char[] keys) {

        for (int i = 0; i < answers.length ; i++) { // her bir ogrenciyi dolastik
            int sayac=0;// her bir ogrencinin dogru cevap sayisi

            for (int j = 0; j < answers[i].length ; j++) { // her ogrencinin cevaplarina bakar j=cevaplar
                if (answers[i][j]==keys[j]){
                    sayac++;

                }

            }
            System.out.println(i + 1 +" nolu ogrencinin dogru cevap sayisi "+ sayac);
        }



    }
}
