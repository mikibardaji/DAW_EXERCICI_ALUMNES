/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.esportivess;

import java.util.Scanner;

/**
 *
 * @author sta4501
 */
public class Esportivess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ano;

        System.out.println("Cuantos años tienes ? ");
        ano = sc.nextInt();

        if (ano <1924 || ano > 2013) {
            System.out.println("No perteneces a ninguna categoria");

        } else if (ano < 1991) {
            System.out.println("Categoria Veterans ");

        } else if (ano >= 1991 && ano <= 2006) {
            System.out.println("Categoria Absoluta  ");
        } else if (ano >= 2007 && ano <=2008) {
            System.out.println("Categoria S18");
        } else if (ano >= 2009 && ano <= 2010) {
            System.out.println("Categoria S16");
        } else if (ano >= 2011 && ano <=2012) {
            System.out.println("Categoria S14");
        }

    }
}
