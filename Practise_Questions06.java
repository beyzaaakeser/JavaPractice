package loop_sorulari;

import java.util.Arrays;

public class For_While_3 {
    public static void main(String[] args) {

        // Bir String dizisinde yinelenen karakterleri döndüren bir kod yazın.(mülakat Sorusu)


        String str = "Javaisalsoeasy";
        String t ="";


     for ( int i = 1; i<str.length() ; i++){

         String harf = str.substring(i-1,i);

         if (str.indexOf(harf)!= str.lastIndexOf(harf)){
             if (!t.contains(harf)){
                 t = t+harf;
             }
         }
      }
        System.out.println(t);
        String yeni[]=t.split("");
        System.out.println(Arrays.toString(yeni));
        

    }
}
