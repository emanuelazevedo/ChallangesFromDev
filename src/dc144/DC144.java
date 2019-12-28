/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dc144;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author manu
 */
public class DC144 {

    public DC144() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DC144 dc = new DC144();

        ArrayList<Integer> money = new ArrayList<Integer>();
        money.add(50);
        money.add(25);
        money.add(25);
        money.add(50);
        money.add(100);

        System.out.println(dc.runMoney(money));

    }

    public String runMoney(ArrayList<Integer> money) {
        int count25 = 0;
        int count50 = 0;
        System.out.println(money);
        //count the 25 and 50 payments
        /*for (int counting : money) {
            if (counting == 25) {
                count25++;
            }
            if (counting == 50) {
                count50++;
            }
        }*/

        
        for (int i : money) {
            if (i == 25){
                count25++;
            }
            if (i == 50) {
                if (count25 >= 0) {
                    count25--;
                    count50++;
                    System.out.println("25:" + count25);
                    if (count25 < 0) {
                        return ("NO");
                    } 
                }

            }
            if (i == 100) {
                if (count25 >= 0) {
                    count25--;
                    System.out.println("25:" + count25);
                    if (count25 < 0) {
                        return ("NO");
                    }

                }
                if (count50 >= 0) {
                    count50--;
                    System.out.println("50:" + count50);
                    if (count50 < 0) {
                        return ("NO");
                    }
                }
                            }
        }
        return ("YES");
    }

}
