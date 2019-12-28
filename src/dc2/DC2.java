/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dc2;

/**
 *
 * @author manu
 */
public class DC2 {

    public static void main(String[] args) {
        int x = 6;
        String star = "*";
        String space = " ";
        int aux = 0;
        for (int i = 1; i <= x; i++) {
            System.out.print(space.repeat(x - i));
            System.out.println(star.repeat(i + aux));
            aux = i;
        }

        for (int i = x-1; i >= 0; i--) {
            if(i == x-1){
                
            } else {
            System.out.print(space.repeat(x-1 - i));
            System.out.println(star.repeat(i + aux));
            aux = i;
            }
        }

    }
}
