/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dc1;

/**
 *
 * @author manu
 */
public class DC1 {

    public DC1() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "Hello Word";
        StringBuilder sb = new StringBuilder(s);
        
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        
        System.out.println(sb.toString());
    
    }
    
}
