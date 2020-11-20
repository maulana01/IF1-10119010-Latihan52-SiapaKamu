/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan52.siapakamu;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini menampilkan identitas dan kegiatan
 *                     dosen dan mahasiswa dengan konsep OOP
 */
public class IF110119010Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen;
        Mahasiswa mahasiswa;
        
        dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println();
        mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10119010");
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.setNama("Maulana Imam Malik");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("PBO2");
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
