package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");

        Date tglHariIni = new Date();

        mhs.npm = "19631006";
        mhs.nama = "Rina Apriani";
        mhs.tanggalLahir = formatTanggal.parse("15-04-2001");

        System.out.println("NPM "+mhs.npm);
        System.out.println("NAMA "+mhs.nama);
        System.out.println("TANGGAL LAHIR "+formatTanggal.format(mhs.tanggalLahir));


        System.out.println("============================================================");


        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.npm = "19631063";
        mhs2.nama = "Naila Amalia";
        mhs2.tanggalLahir = formatTanggal.parse("05-03-2009");

        System.out.println("NPM "+mhs2.npm);
        System.out.println("NAMA "+mhs2.nama);
        System.out.println("TANGGAL LAHIR "+formatTanggal.format(mhs2.tanggalLahir));

        mhs.tampilkanIndentitasDiri();
        mhs2.tampilkanIndentitasDiri();
    }
}



//CamelCase = sayaPergiKePasar
//SnakeCase = sya_pergi_ke_pasar

// \n untuk enter