package Atm;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*

        While döngüsü yardımıyla bir tane ATM programı yapmaya çalışın.
        
        İşlemler 
        1.İşlem : Bakiye Öğrenme
        2.İşlem : Para Çekme
        3.İşlem : Para Yatırma
        Çıkış : q
        
        */
		Scanner scan=new Scanner(System.in);
		
		
		int bakiye=1000;
		
		String İslemler= "1.İslem:Bakiye Ogrenme/n"
				+"2.İslem:Para Cekme/n"
				+"3.İslem:Para Yatirma/n"
				+"4.İslem:Cikis";
		
		System.out.println("**************************");
		System.out.println("İslemler:");
		System.out.println("*******************");
		
		
		while(true) {
			System.out.println("İslem Seciniz:");
			String islem=scan.nextLine();
			
			
			if(islem.equals("q")) {
				System.out.println("Sistemden Cikis Yapildi");
				break;
			}
			
			else if(islem.equals("1")) {
				
				System.out.println("Bakiyeniz: "+bakiye);
				
				
			}
			
			else if(islem.equals("2")) {
				System.out.println("Cekmek İstediginiz Parayi Giriniz...");
				int para=scan.nextInt();
				scan.nextLine();
				System.out.println("Bakiyeniz: " +(bakiye-para));
				
			}
			else if(islem.equals("3")) {
				System.out.println("Yatirmak İstediginiz Tutari Giriniz...");
				int tutar=scan.nextInt();
				System.out.println("Bakiyeniz: " +(bakiye+tutar));
				
			}
			
			else {
				System.out.println("Gecersiz İslem...");
			}
			
			
			
			
			
			
		}
		
		
		
		

	}

}
