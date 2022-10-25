/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class matematikaberaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        matematika mtk = new matematika();
        int a = mtk.tambah(20,20);
        System.out.println(a);
  
        a = mtk.kurang(10,5);
        System.out.println(a);
        
        a = mtk.kali(10,20);
        System.out.println(a);
        
         a = mtk.bagi(21,2);
        System.out.println(a);
        
    }
    
}
