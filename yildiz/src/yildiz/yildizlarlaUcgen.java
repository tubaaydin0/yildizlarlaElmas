package yildiz;
import java.util.Scanner;
public class yildizlarlaUcgen {
	 public static void main(String[] args) {
		/* int yildiz,bosluk,satir;
		 Scanner inp=new Scanner(System.in);
		 System.out.print("Sat�r say�s�n� giriniz.");
		 satir=inp.nextInt();
		 bosluk=satir-1;
		 yildiz=1;
		 for(int i=0;i<satir;i++) { //ka� sat�r ise o kadar �al���r.
			 for(int j=0; j<bosluk;j++) { // Sat�r�n i�i bo�lukla dolduruluyor.
				 System.out.print(" ");
				 }
			 for(int k=0; k<yildiz;k++) {// Sat�r y�ld�zla dolduruluyor.
				 System.out.print("*"); 
			 }
			 System.out.println();
			 bosluk--; // her sat�rda bo�luk azal�rken
			 yildiz+=2;// y�ld�z art�yor.
			 
		 }
		 yildiz-=4;// �stteki ��genin alt k�sm�n� tekrar etmemesi i�in 2 daha ��kard�k.
		 bosluk=1;// ters ��genin ba�lang��ta 1 bo�lu�u oldu�u i�in 1 diyoruz.
		 
		 for(int i=0;i<satir-1;i++) { //bir sat�r eksilttik.
			 for(int j=0; j<bosluk;j++) { // Sat�r�n i�i bo�lukla dolduruluyor.
				 System.out.print(" ");
				 }
			 for(int k=0; k<yildiz;k++) {// Sat�r y�ld�zla dolduruluyor.
				 System.out.print("*"); 
			 }
			 System.out.println();
			 bosluk++; // her sat�rda bo�luk artarken
			 yildiz-=2;// azal�yor.
			 
		 }*/
		 int satir;
		 Scanner inp = new Scanner(System.in);
		 System.out.print("Sat�r say�s� giriniz: ");
		 satir=inp.nextInt();
		 for(int i=0; i<satir;i++) {
			 for(int j=0; j<satir-i;j++) {
				 System.out.print(" "); 
				 
			 }
			 for(int k=0;k<(2*i)+1;k++) {
				 System.out.print("*"); 
			 }
			 System.out.println(); 
			 			 			 		
		 }
		 
		 for(int i=satir-1; i>=0;i--) {
			 for(int j=satir-i; j>=0 ;j--) {
				 System.out.print(" "); 
				 
			 }
			 for(int k=(2*i-1);k>=1;k--) {
				 System.out.print("*"); 
			 }
			 System.out.println();
	 }
	 }}


