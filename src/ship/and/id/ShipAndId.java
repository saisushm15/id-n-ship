/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship.and.id;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class ShipAndId {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
            String str=input.next();
            if(str.charAt(0)=='b' || str.charAt(0)=='B')
            {
                System.out.println("BattleShip");
            }
            else if(str.charAt(0)=='c' || str.charAt(0)=='C')
            {
                System.out.println("Cruiser");
            }
            else if(str.charAt(0)=='d' || str.charAt(0)=='D')
            {
                System.out.println("Destroyer");
            }
            else if(str.charAt(0)=='f' || str.charAt(0)=='F')
            {
                System.out.println("Frigate");
            }
            
        }
        t--;
            
    }
    
}
