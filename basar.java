package com.example.SayiTahmin;
import java.util.Scanner;
public class SayiTahmin {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int BaslangicBakiye = 10000;
        System.out.println("1-Bakiye Sorgulama");
        System.out.println("2-Para Çekme");
        System.out.println("3-Para Yatırma");
        while(true){
            System.out.println("Lütfen işlem seçin");
            int islem = scan1.nextInt();
            switch (islem){
                case 1:
                    System.out.println("Bakiyeniz " + BaslangicBakiye + "'dir");
                    break;
                case 2:
                    System.out.println("Miktar giriniz");
                    int cikisMiktar = scan1.nextInt();
                    if(cikisMiktar > BaslangicBakiye){
                        System.out.println("Yeteri kadar bakiyeniz bulunmamaktadır");
                    }
                    else{
                        BaslangicBakiye -=cikisMiktar;
                        System.out.println("Şu anki bakiyeniz " + BaslangicBakiye + "'dir");
                    }
                    break;
                case 3:
                    System.out.println("Miktar giriniz");
                    int girisMiktar = scan1.nextInt();
                    BaslangicBakiye +=girisMiktar;
                    System.out.println("Şu anki bakiyeniz " + BaslangicBakiye + "'dir");
                    break;

            }
        }
    }
}
