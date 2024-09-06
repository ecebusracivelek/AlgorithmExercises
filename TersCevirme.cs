/*
Ters Çevirme: Kullanıcıdan bir kelime alarak bu kelimenin tersini ekrana yazdıran bir program yazın. 
(Örneğin, "Merhaba" → "abahreM")
*/
using System;

public class TersCevirme
{
    public static void Main(string[] args){
        Console.WriteLine("Tersine çevirmek istediğiniz kelimeyi giriniz: ");
        string k = Console.ReadLine();
        Cevir(k);
    }    
    
    public static void Cevir(string k){
        char[] array = k.ToCharArray();
        for(int i = array.Length-1; i>=0; i--){
            Console.Write(array[i]);
        }
        Console.WriteLine();
    }
}
