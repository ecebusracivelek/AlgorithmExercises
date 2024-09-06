/*
Palindrom Kontrolü: Kullanıcıdan bir kelime alarak bu kelimenin palindrom olup olmadığını kontrol eden bir program yazın.
(Palindrom: Tersten okunuşu da aynı olan kelime, örneğin "kayak")
*/
using System;

public class Palindrome
{
    public static void Main(string[] args)
    {
        Console.WriteLine ("Palindrome olup olmadığına bakmak istediğiniz kelimeyi girin: ");
        string s=Console.ReadLine();
        if(isPalindrome(s)){
            Console.WriteLine("Evet, palindrome.");
        }
        else {
            Console.WriteLine("Hayır, palindrome değil.");
            
        }
        
    }
    public static bool isPalindrome(string s){
        if(s.Length <=1){
            return true;
        } else if(s[0] != s[s.Length - 1]) {
            return false;
        }
        else{
            return isPalindrome(s.Substring(1, s.Length-2));
        }
    }
}



S
