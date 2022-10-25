/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Mahasiswaberaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mahasiswa maha = new Mahasiswa ();
       maha.membaca = "mahasiswa membaca";
        maha.nyontek = "mahasiswa nyontek";
         maha.modifikasi = "mahasiswa modifikasi";
       
       System.out.println(" "+maha.membaca);
        System.out.println(" "+maha.nyontek);
        System.out.println(" "+maha.modifikasi);
        
    }
    
}
