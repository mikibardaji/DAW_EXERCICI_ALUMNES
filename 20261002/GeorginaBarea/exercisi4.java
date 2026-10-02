/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercisis102;

import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class exercisi4 { 
    public static void main(String[] args){

    int serveis;
        Scanner scan=new Scanner (System.in);
        System.out.println("Cuants serveis ofreixeras?: ");
        serveis=scan.nextInt();
        if (serveis>=3) {
            System.out.println("Bienvingut tens 100 credits de regal.");            
        }else if (serveis>=1&&serveis<=2) {
            System.out.println("Bienvingut tens 50 credits de regal.");
        }else{  
            System.out.println("Bienvingut tens 10 credits de regal.");
}       
}
}
