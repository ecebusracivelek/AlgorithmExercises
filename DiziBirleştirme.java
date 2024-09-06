/*
Sıralı Diziyi Birleştirme: Kullanıcıdan iki sıralı dizi alarak bu dizileri birleştiren ve yeni bir sıralı dizi
    oluşturan bir program yazın.
*/
import java.util.Scanner;

public class DiziBirlestirme {
    public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("1. dizi eleman sayısını giriniz: ");
int x=scn.nextInt();
int[]array1=new int[x];
System.out.println("Sayıları giriniz: ");
for(int i=0; i<array1.length; i++){
    array1[i]=scn.nextInt();
}
System.out.println("2. dizi eleman sayısını giriniz: ");
int y=scn.nextInt();
int[]array2=new int[y];
System.out.println("Sayıları giriniz: ");
for(int i=0; i<array2.length; i++){
    array2[i]=scn.nextInt();
}
int[] array = diziBirlestirme(array1, array2);
        
        System.out.println("Birleştirilen sıralı dizi: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
    public static int[] diziBirlestirme(int[] array1,int[] array2){
        int[] birlesik = new int[array1.length + array2.length];
        int k=0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] <= array2[j]) {
                    birlesik[k++] = array1[i];
                    break;
                } else {
                    birlesik[k++] = array2[j];
                }
            }
        }
        
        while (k < birlesik.length) {
            if (k - array1.length < array2.length) {
                birlesik[k] = array2[k - array1.length];
            } else {
                birlesik[k] = array1[k - array2.length];
            }
            k++;
        }
        
        return birlesik;
    }
    
    
}
