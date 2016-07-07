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
public class Gra3 extends Gra2 {
    public Gra3(String a, Gracz b, int w)
    {
        imie = a;
        komp = b;
        wyp = w;
    }
    
    public void polowanie(int pwt)
        {
            for (int i=0; i<pwt; i++)
            {
                int p1=(int)(Math.random()*2+1);
                int p2=(int)(Math.random()*2+1);
                String p1c;
                String p2c;
                switch (p1) {
                    case 1:
                        p1c="Jelen";
                        break;
                    default:
                        p1c ="Zajac";
                        break;
                }
                switch (p2) {
                    case 1:
                        p2c="Jelen";
                        break;
                    default:
                        p2c ="Zajac";
                        break;
                }

                System.out.printf("%s\t vs\t%s\t", p1c, p2c);
                this.graj(p1, p2);
            }
        }
    public void graj(int s1, int s2)
        {
            if ((s1==1) && (s2==1)) 
            {
                this.win(2);
                komp.win(2);
                System.out.printf("Obaj gracze 2pkt\n");
            }
            else if ((s1==2) && (s2==2))
            {
                this.win(1);
                komp.win(1);
                System.out.printf("Obaj gracze 1pkt\n");
            }
            else if ((s1==1) && (s2==2))
            {
                komp.win(1);
                System.out.printf("1pkt: %s\n", komp.imie);
            }
            else if ((s1==2) && (s2==1))
            {
                komp.win(1);
                System.out.printf("1pkt: %s\n", komp.imie);
            }
        }
    public void win_game()
        {
            System.out.println("\nStudent");
            System.out.printf("%s: %d \n", this.imie, this.wyplata);
            System.out.printf("%s: %d \n", komp.imie, komp.wyplata);
            System.out.printf("Winner: ");
            if (this.wyplata>komp.wyplata) System.out.printf("Win: %s \n", this.imie);
            else if (this.wyplata<komp.wyplata) System.out.printf("Win: %s \n", komp.imie);
            else System.out.printf("Nikt... remis. \n");
            System.exit(0);
        }
    public void interfejs(Gra3 g1)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("1.Orzel/Reszka\n2.KamienPapierNozyce\n3.Polowanie\n4.TicTacToe");
            String rodzajGry = input.nextLine();
            int graInt = Integer.parseInt(rodzajGry);
            switch(graInt)
            {
                case 1:
                    System.out.printf("Ilosc powt: \n");
                    String text3 = input.nextLine();
                    int powt = Integer.parseInt(text3);
                    new Thread(new Timer(120)).start();
                    g1.ro(powt);
                    g1.win_game();
                    break;
                case 2:
                    System.out.printf("Ilosc powt: \n");
                    String text4 = input.nextLine();
                    int powt2 = Integer.parseInt(text4);
                    new Thread(new Timer(120)).start();
                    g1.kpn(powt2);
                    g1.win_game();
                    break;
                case 3:
                    System.out.printf("Ilosc powt: \n");
                    String text5 = input.nextLine();
                    int powt3 = Integer.parseInt(text5);
                    new Thread(new Timer(120)).start();
                    g1.polowanie(powt3);
                    g1.win_game();
                    break;
                case 4:
                    g1.ttt();
                    break;
                default:
                    System.out.printf("Nie ma takiej gry \n");
                    System.exit(0);
            }
        }
}

