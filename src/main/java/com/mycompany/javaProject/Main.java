/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaProject;

import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Jakub
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.printf("Imie: \n");
        String text = input.nextLine();
        int powt, wyp;                    
        Gracz g2 = new Gracz ("Komputer");
        System.out.printf("Wyp: \n");
        String text3 = input.nextLine();
        wyp = Integer.parseInt(text3);
        System.out.printf("1.Przedszkolak\n2.Uczen\n3.Student\n");
        String rodzajGracza = input.nextLine();
        int graczInt = Integer.parseInt(rodzajGracza);       
        switch(graczInt)
        {
            case 1:
                Gra gra1 = new Gra(text, g2, wyp);
                gra1.interfejs(gra1);
                break;
            case 2:
                Gra2 gra2 = new Gra2(text, g2, wyp);
                gra2.interfejs(gra2);
                break;
            case 3:
                Gra3 gra3 = new Gra3(text, g2, wyp);
                gra3.interfejs(gra3);
                break;
            default:
                System.out.printf("Nie ma takiego gracza \n");
                System.exit(0);
        }
    }
    
}
