
/*
İki Sayı Arasındaki Sayıları Bulma: Kullanıcıdan iki sayı alarak, bu iki sayı arasındaki tüm sayıları ekrana yazdıran bir program yazın.
*/
using System;

public class AraSayıBulma {
    public static void Main(string[] args){
        Console.WriteLine ("1. sayıyı giriniz: ");
        int x=int.Parse(Console.ReadLine());
        Console.WriteLine ("2. sayıyı giriniz: ");
        int y=int.Parse(Console.ReadLine());
        Aralık(x,y);
    }
    public static void Aralık(int x, int y){
        if(x==y){
            Console.WriteLine(x+" ve "+y+" arasında sayı yoktur.");
        }
        else if(x>y){
           Console.WriteLine(x+" ve "+y+" arasındaki sayılar: ");
            for(int i=y+1; i<x; i++){
                Console.WriteLine(i);
            }
        }
        else{
           Console.WriteLine(x+" ve "+y+" arasındaki sayılar: ");
            for(int i=x+1; i<y; i++){
                Console.WriteLine(i);
            }
        }
    }
    
}
