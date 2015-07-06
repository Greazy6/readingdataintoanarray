/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingdataintoanarray;

import java.util.Scanner;


public class ReadingDataIntoAnArray {

    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        double [] cellBills = new double[6];
        
        for (int i =0; i < cellBills.length; i++) {
            System.out.print(" Enter bill amount for month" + (i + 1) + "\t");
            
            cellBills[1] = scan.nextDouble();
        }
    }
    
}
