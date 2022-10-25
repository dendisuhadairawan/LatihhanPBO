/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Handphoneaberaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Handphone hp = new Handphone ();
       hp.hidupkan = "Handphone Hidup";
       hp.lakukan_panggilan = "Kring, kring, kring … panggilan dilakukan";
       hp.kirim_SMS = "Dung, dung … sms berhasil terkirim";
       hp.matikan = "Handphone mati …";
       
       System.out.println(" "+hp.hidupkan);
        System.out.println(" "+hp.lakukan_panggilan);
        System.out.println(" "+hp.kirim_SMS);
        System.out.println(" "+hp.matikan);
    }
    
}
