/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsonar;

/**
 *
 * @author dmk
 */


public class TestSonar  {

    /**
     * @param args the command line arguments
     */
   // @Test
    public static void main(String[] args) {
        int Abc ;
 
        int x ;
        x="";
 
       
 
        Abc =6;
        System.out.println(Abc);
        
        if (x == 1) { Original
            System.err.println("");
        } else if (x == 2) {
            System.err.println("");
        } else if (x == 1) // Noncompliant

 
        
    }
    
    public boolean Start(){
        int nombreentier =50;
       String s="";
        while (true) {
            if(s.equals(""))
                nombreentier++;
            nombreentier--;
            break;
        }
        return nombreentier%2==0;
        
    }
    
}
