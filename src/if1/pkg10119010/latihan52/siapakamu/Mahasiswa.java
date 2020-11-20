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
public class Mahasiswa extends Manusia{   
    private String nim, kelas;
    
    public String getNim() {
        return this.nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getKelas() {
        return this.kelas;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa() {
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " tahun sedang belajar di kelas " + this.getKelas());
    }
    
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}
