/*
Kare ve Küp Hesaplama: Kullanıcıdan bir sayı alarak bu sayının karesini ve küpünü hesaplayan bir program yazın.
*/


using System;

public class KareKup {
    public static void Main(string[] args){
        Console.WriteLine ("Karesini ve küpünü istediğiniz sayıyı giriniz: ");
        int x=int.Parse(Console.ReadLine());
        Console.WriteLine("Kare: " + Kare(x));
        Console.WriteLine("Küp: " + Kup(x));
    }
    public static int Kare(int x){
        return x*x;
    }
    public static int Kup(int x){
        return x*x*x;
    }
}
