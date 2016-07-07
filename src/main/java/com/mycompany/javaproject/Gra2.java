/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaproject;

import java.util.Scanner;

/**
 *
 * @author Jakub
 */
public class Gra2 extends Gra
{
    //public int wyp;
    public Gra2()
    {
        
    }
    
    public Gra2(String a, Gracz b, int w)
    {
        imie = a;
        komp = b;
        wyp = w;
    }
    
    public void kpn(int pwt)
    {
        for (int i=0; i<pwt; i++)
        {
            System.out.printf("1.Kamien\n2.Papier\n3.Nozyce: \n");
            Scanner input = new Scanner(System.in);
            String text3 = input.nextLine();
            int p1 = Integer.parseInt(text3);
            int p2=(int)(Math.random()*3+1);
            String p1c;
            String p2c;
            switch (p1) {
                case 1:
                    p1c="Kamien";
                    break;
                case 2:
                    p1c="Papier";
                    break;
                default:
                    p1c ="Nozyce";
                    break;
            }
            switch (p2) {
                case 1:
                    p2c="Kamien";
                    break;
                case 2:
                    p2c="Papier";
                    break;
                default:
                    p2c ="Nozyce";
                    break;
            }
            
            System.out.printf("%s\t vs\t%s\t", p1c, p2c);
            this.graj(p1, p2);
        }
    }
    
    public void graj(int s1, int s2)
    { //1 = kamien, 2 = papier, 3 = nozyce
        if (((s1==1) && (s2==3)) || ((s1==2) && (s2==1)) || ((s1==3) && (s2==2))) 
        {
            this.win(wyp);
            System.out.printf("Win: %s\n", this.imie);
        }
        else if (((s2==1) && (s1==3)) || ((s2==2) && (s1==1)) || ((s2==3) && (s1==2))) 
        {
            komp.win(wyp);
            System.out.printf("Win: %s\n", komp.imie);
        }
        else
        {
            System.out.printf("Remis.\n");
        }
    }
        
    public void win_game()
    {
        System.out.println("\nUczen");
        System.out.printf("%s: %d \n", this.imie, this.wyplata);
        System.out.printf("%s: %d \n", komp.imie, komp.wyplata);
        System.out.printf("Winner: ");
        if (this.wyplata>komp.wyplata) System.out.printf("Win: %s \n", this.imie);
        else if (this.wyplata<komp.wyplata) System.out.printf("Win: %s \n", komp.imie);
        else System.out.printf("Nikt... remis. \n");
        System.exit(0);
    }
    
    public void interfejs(Gra2 g1)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("1.Orzel/Reszka\n2.KamienPapierNozyce\n3.TicTaccToe");
            String rodzajGry = input.nextLine();
            int graInt = Integer.parseInt(rodzajGry);
            switch(graInt)
            {
                case 1:
                    System.out.printf("Ilosc powt: \n");
                    String text3 = input.nextLine();
                    int powt = Integer.parseInt(text3);
                    new Thread(new Timer(240)).start();
                    g1.ro(powt);
                    g1.win_game();
                    break;
                case 2:
                    System.out.printf("Ilosc powt: \n");
                    String text4 = input.nextLine();
                    int powt2 = Integer.parseInt(text4);
                    new Thread(new Timer(240)).start();
                    g1.kpn(powt2);
                    g1.win_game();
                    break;
                case 3:
                    g1.ttt();
                    break;
                default:
                    System.out.printf("Nie ma takiej gry \n");
                    System.exit(0);
            }
        }
}

