/*
Dizideki Tekrar Eden Elemanlar: Kullanıcıdan bir dizi alarak bu dizide 
tekrar eden elemanları bulan ve her birinin kaç kez tekrar ettiğini ekrana yazdıran bir program yazın.
*/

import java.util.Scanner;

public class TekrarEdenEleman {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Dizi eleman sayısını giriniz: ");
        int x = scn.nextInt();
        int[] dizi = new int[x];
        System.out.println("Sayıları giriniz: ");
        for (int i = 0; i < dizi.length; i++) {    
            dizi[i] = scn.nextInt();
        }
        tekrar(dizi);
    }

    public static void tekrar(int[] dizi) {
        boolean[] checked = new boolean[dizi.length]; 
        
        for (int i = 0; i < dizi.length; i++) {
            if (checked[i]) continue; 
            
            int count = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    count++;
                    checked[j] = true; 
                }
            }
            System.out.println(dizi[i] + " elemanından " + count + " tane vardır.");
        }
    }
}
