package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
 public static int SumaCifara(int br){
   int n=0;
   int suma=0;
   while(br!=0){
     n=br%10;
     suma+=n;
     br=br/10;
   }
   return suma;
 }
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
	  System.out.println("Unesite broj n: ");
    int n=in.nextInt();
    for(int i=1; i<=n; i++){
      if(i% SumaCifara(i)==0){
        System.out.println(i+" ");
      }
    }
    }
}
