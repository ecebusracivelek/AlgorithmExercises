   /*
Binary Search: Kullanıcıdan alınan bir dizi üzerinde binary search algoritmasını uygulayan ve
 kullanıcıdan alınan hedef sayının dizideki indeksini bulan bir program yazın. Dizi sıralı 
 değilse önce sıralayın.
*/
import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("Dizi eleman sayısını giriniz: ");
int n=scn.nextInt();
int[]liste=new int[n];
System.out.println("Sayıları giriniz: ");
for(int i=0; i<liste.length(); i++){
    liste[i]=scn.nextInt();
}
System.out.println("İndeksini istediğiniz sayıyı giriniz: ");
int anahtar=scn.nextInt();
int sonuç=binaryS(liste,anahtar);
System.out.println(anahtar+"'ın indeksi: "+sonuç);
    }
    public static int binaryS(int[]list, int key){
        int low=0;
        int high=list.length-1;
        while(high>=low){
            int mid=(high+low)/2;
            if(key<list[mid]){
            high=mid-1;
            }
            else if(key==list[mid]){
                return mid;
            }
            else{
                low=mid+1;
            }
            
        }
                    return-1-low;

    }
    
}
    //list[5]=10,11,12,13,14  key=13
    // index=  0 1  2   3  4 
