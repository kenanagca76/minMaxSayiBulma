package odevler;

import java.util.Scanner;

public class minMaxSayiBulma {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = input.nextInt();

        int min = 0; // Minimum değeri başlangıçta 0 olarak atıyoruz
        int max = 0; // Maksimum değeri başlangıçta 0 olarak atıyoruz

        boolean firstNumber = true; // İlk sayıyı işaretlemek için bir boolean değeri kullanıyoruz

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı girin: ");
            int sayi = input.nextInt();

            if (firstNumber) {
                min = sayi;
                max = sayi;
                firstNumber = false;
            } else {
                if (sayi < min) {
                    min = sayi;
                }

                if (sayi > max) {
                    max = sayi;
                }
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

        
    }
}



