/*
Fibonacci Serisi: Kullanıcıdan bir sayı alarak bu sayıya kadar Fibonacci serisini ekrana 
yazdıran bir program yazın. (Örneğin, 7 için: 0, 1, 1, 2, 3, 5, 8)
*/

using System;

public class Fibonacci
{
    public static void Main(string[] args)
    {
        Console.WriteLine ("Bir sayı giriniz: ");
        int n=int.Parse(Console.ReadLine());
        Fib(n);

    }
    public static void Fib(int n){
        int []fib=new int[n];
        fib[0]=0;
        fib[1]=1;
        for (int i=2; i<n;i++){
    fib[i]=fib[i-1]+fib[i-2];
    }
    for(int i=0; i<fib.Length;i++){
    Console.WriteLine(fib[i]+" ");
}
    }
    
}
