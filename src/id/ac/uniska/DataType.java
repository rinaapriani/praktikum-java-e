package id.ac.uniska;

import javax.swing.*;

public class DataType {

    public static void main(String[] args){
        String namaDepan    = "Rina";
        String namaTengah   = "Camelia";
        String namaBelakang = "Apriani";
        int usia            = 20;
        int targetTahunKuliah = 4;
        double ipk            = 3.8;
        char nilaiAbjad       = 'A';
        boolean cantik        = true;

        System.out.println("Nama Depan :"+ namaDepan);
        System.out.println("Nama Tengah :"+ namaTengah);
        System.out.println("Nama Belakang :"+ namaBelakang);
        System.out.println("Usia :"+ usia);
        System.out.println("Target Kuliah :"+ targetTahunKuliah+ " Tahun");
        System.out.println("IPK :"+ ipk);
        System.out.println("Nilai Abjad :"+ nilaiAbjad);
        System.out.println("Cantik :"+ cantik);

        JOptionPane.showMessageDialog(null, "Hallo "+namaDepan+" "+namaTengah+" "+namaBelakang, "Ini Judul", JOptionPane.INFORMATION_MESSAGE);
    }
}
