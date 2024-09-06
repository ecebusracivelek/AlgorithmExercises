/*
Basamak Toplamı: Kullanıcıdan bir sayı alarak bu sayının basamaklarının toplamını hesaplayan bir program yazın.
(Örneğin, 1234 → 1 + 2 + 3 + 4 = 10)
*/
public class basamakToplamı {

   
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Basamak toplamını girmek istediğiniz sayıyı yazınız: ");
        int a = scn.nextInt();
        int[] array = basamak(a);
        toplam(array);
        
    }
    
    public static int[] basamak(int a){
    
        int[] sonuç = new int[basamakSayısı(a)];
        
        int temp = a;
        int i = sonuç.length-1; 
        while(temp > 0){
            
            sonuç[i] = temp % 10;
            temp/= 10;
            i--;
        }
        
        return sonuç;
    }
 
    public static int basamakSayısı(int a){
    
        int temp = a;
        int basamaksayısı = 0;
        
        while(temp > 0){
            temp /= 10;
            basamaksayısı++;  
        }
        
        return basamaksayısı;
    }
    
    public static void toplam(int[] array){
    int t=0;
        for(int i = 0; i < array.length; i++){
             t+=array[i];

        }
        System.out.println(t);
       }
    
    
}
