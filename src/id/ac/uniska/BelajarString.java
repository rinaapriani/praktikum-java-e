package id.ac.uniska;

import java.util.Locale;

public class BelajarString {

    public static void main(String[] args) {
        char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
          String uniskaString = new String(uniskaChar);
          System.out.println(uniskaString);

          //########################################################

        String namaDepan    = "Rina";
        String namaTengah   = "Camelia";
        String namaBelakang = "Apriani";

        String namaLengkap = namaDepan + " "+namaTengah+ " "+ namaBelakang;

        System.out.println(namaLengkap.length()); // mengetahui panjang karakter
        System.out.println(namaBelakang.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5)); // menghilangkan karakter dari depan sebanyak n
        System.out.println(namaLengkap.substring(5, 12));
        System.out.println(namaLengkap.replace("Camelia", "Sintya")); // mereplace targer dengan string yang di berikan
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split(" ");
        for (String nama : namaArray)
        {
            System.out.println(nama);
        }
    }
}
