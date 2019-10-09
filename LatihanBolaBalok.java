/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.kopsis.newpackage;
import java.util.Scanner;
import static sun.java2d.cmm.ColorTransform.In;
/**
 *
 * @author Damar
 */
public class LatihanBolaBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;

        System.out.println("=== PILIH MAU PAKE TOOLS APA ? ===");
        System.out.println("\n[1] Ukur Luas Bola \n[2] Ukur Luas Balok");
        System.out.println("======================================");
        System.out.print("Masukan Pilihan : ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                double phi = 3.14;
                double r;
                Scanner baru = new Scanner(System.in);
                System.out.println("LUAS BOLA");
                System.out.println("Masukan Jari jari : ");
                r = baru.nextInt();
                System.out.println("HASIL");
                System.out.println("Luas Permukaan Bola : " + 4 * phi * r * r);
                 break;
            case 2:
                int p,
                 l,
                 t;
                Scanner jagung = new Scanner(System.in);
                System.out.println("LUAS BALOK");
                System.out.println("Masukkan Panjang : ");
                p = jagung.nextInt();
                System.out.println("Masukkan Lebar : ");
                l = jagung.nextInt();
                System.out.println("Masukkan Tinggi : ");
                t = jagung.nextInt();
                System.out.println("HASIL");
                System.out.println("Luas permukaan balok :" + ((2 * p * l) + (2 * p * t) + (2 * l * t)));
                 break;
        }
    }
}
