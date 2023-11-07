package org.example;

import java.util.Scanner;

public class dc {
   public static void main(String[] args) {
         Scanner giris = new Scanner(System.in);
         int sayi1,sayi2;
         int dogrusayisi = 0;
         int yanlissayisi = 0;
         int score = 0;
         char tekraroyna = 'e';
         int dogrucevap=0;

         do {

            sayi1=(int)(Math.random()* 100);
            sayi2=(int)(Math.random()* 100);
            dogrucevap=sayi1+sayi2;

            System.out.println("İki sayının toplamı nedir?");
            System.out.println(sayi1 + " + " + sayi2 + " = ");
            int cevap = giris.nextInt();

            if (cevap == dogrucevap) {
               System.out.println("Tebrikler dogru cevap");
               score += 5;
               dogrusayisi++;
            } else {
               System.out.println("Üzgünüm yanlıs cevap");
               score -= 2;
               yanlissayisi++;
            }

            System.out.println("Tekrar oynamak istiyor musunuz? (e/E)");
            tekraroyna = giris.next().charAt(0);

         } while (tekraroyna == 'e' || tekraroyna == 'E');

         System.out.println("Dogru cevap sayısı: " + dogrusayisi);
         System.out.println("Yanlıs cevap sayısı: " + yanlissayisi);
         System.out.println("Toplam puanınız: " + score);
      }
   }

