/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class bankberaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int saldo = 100000;
        
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo Saat Ini : RP."+ saldo);
       
       bank uang = new bank();
       
       System.out.println("Simpan uang : RP.500000");
        int a = uang.simpanuang(500000,saldo);
        System.out.println("Saldo saat ini : RP."+a);
  
        System.out.println("ambil uang : RP.150000");
        
        int b = uang.ambiluang(a,150000);
        System.out.println("Saldo saat ini : RP."+b);
        
        
    }
    
}
