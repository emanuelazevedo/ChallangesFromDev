/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dc3;

/**
 *
 * @author manu
 */
public class dc3 {
    public static void main(String[] args) {
        String s = "hEllo word";
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        int countVogals = 0;
        for (char ch: s.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                countVogals++;
            }
        }   
        System.out.println(countVogals);
    }
}
