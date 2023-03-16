package day09_nestedforloop;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        int muzSayisi =165;
        boolean maymunalive = true;
        int survivalDays =1;

        do{
          muzSayisi -= 4;  // her gun 4 muz eksiltir maymun bir gunde 4 muz yedigi icin 4 dedik.
          survivalDays++;

          if (muzSayisi<4){
              maymunalive = false;
              System.out.println("Bugun "+(survivalDays)+ ". gun muz kalmadi ve maymun oldu");
          }else System.out.println("Bugun "+ survivalDays + ". gun muz bitmedi ve maymun hayatta");

        }while(maymunalive);
        System.out.println("Maymunun toplam yasadigi gun sayisi = "+ (survivalDays-1));











































    }
}
