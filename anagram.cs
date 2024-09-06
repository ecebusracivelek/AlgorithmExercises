/*
Anagram Kontrolü: Kullanıcıdan alınan iki kelimenin anagram olup olmadığını kontrol eden bir program yazın. 
(Anagram: İki kelimenin aynı harflerden oluşması, örneğin "listen" ve "silent".)
*/

using System;

public class isAnagram{
    public static void Main(string[] args) {
        Console.Write("Birinci kelimeyi giriniz: ");
        string k1 = Console.ReadLine();
        Console.Write("İkinci kelimeyi giriniz: ");
        string k2 = Console.ReadLine();
    
        if(Anagram(k1,k2)){
            Console.WriteLine(k1+" ve "+k2+" anagram kelimelerdir");
        }
        else{
            Console.WriteLine(k1+" ve "+k2+" anagram kelimeleler değildir");
            
        }
    }
    
    public static bool Anagram(string k1, string k2){
        if(k1.Length==k2.Length){
        char[] k1array = k1.ToCharArray();
        char[] k2array = k2.ToCharArray();
        Array.Sort(k1array);
        Array.Sort(k2array);
        for(int i=0; i<k1array.Length; i++){
           if(k1array[i]!=k2array[i]){
               return false;
           }
        }
        return true;

                    }
        else{
            return false;
        }
    }
    
    
}
