/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaproject;

/**
 *
 * @author Jakub
 */
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gra extends Gracz
    {
    //    public String imie;
    //    public int wyplata;
        public Gracz komp;
        public int wyp;
        public int graczNow=1;
        public Gra()
        {
            
        }
        
        public Gra(String name, Gracz b, int w)
        {
            imie = name;
            komp = b;
            wyp = w;
        }
        
        private void buttonXActionPerformed(ActionEvent e, JButton b) {
                // TODO add your code here
                if(b.getText()==" ")
                {
                    b.setText("X");
                    graczNow++;
                }
        }
        
        private void buttonOActionPerformed(ActionEvent e, JButton b) {
                // TODO add your code here
                if(b.getText()==" ")
                {
                    b.setText("O");
                    graczNow--;
                }
        }
        
        public void koniecttt(JButton b1, JButton b2, JButton b3, JButton b4, JButton b5, JButton b6, JButton b7, JButton b8, JButton b9)
        {
            if((b1.getText()!=" ") && (b1.getText()==b2.getText()) && (b1.getText()==b3.getText()))
            {
                System.out.print("Wygrał ");
                System.out.println(b1.getText());
                System.exit(0);
            }
            else if((b4.getText()!=" ") && (b4.getText()==b5.getText()) && (b4.getText()==b6.getText()))
            {
                System.out.print("Wygrał ");
                System.out.println(b4.getText());
                System.exit(0);
            }
            else if((b7.getText()!=" ") && (b7.getText()==b8.getText()) && (b7.getText()==b9.getText()))
            {
                System.out.print("Wygrał ");
                System.out.println(b7.getText());
                System.exit(0);
            }
            else if((b1.getText()!=" ") && (b1.getText()==b4.getText()) && (b1.getText()==b7.getText()))
            {
                System.out.print("Wygrał ");
                System.out.println(b1.getText());
                System.exit(0);
            }
            else if((b2.getText()!=" ") && (b2.getText()==b5.getText()) && (b2.getText()==b8.getText()))
            {
                System.out.print("Wygrał ");
                System.out.println(b2.getText());
                System.exit(0);
            }
            else if((b3.getText()!=" ") && (b3.getText()==b6.getText()) && (b3.getText()==b9.getText()))
            {
                System.out.print("Wygrał ");
                System.out.println(b3.getText());
                System.exit(0);
            }
            else if((b1.getText()!=" ") && (b1.getText()==b5.getText()) && (b1.getText()==b9.getText()))
            {
                System.out.print("Wygrał ");
                System.out.println(b1.getText());
                System.exit(0);
            }
            else if((b3.getText()!=" ") && (b3.getText()==b5.getText()) && (b3.getText()==b7.getText()))
            {
                System.out.print("Wygrał ");
                System.out.println(b3.getText());
                System.exit(0);
            }
            else if ((b1.getText()!=" ") && (b2.getText()!=" ") && (b3.getText()!=" ") && (b4.getText()!=" ") && (b5.getText()!=" ") && (b6.getText()!=" ") && (b7.getText()!=" ") && (b8.getText()!=" ") && (b9.getText()!=" "))
            {
                System.out.print("Nikt nie wygrał\n");
                System.exit(0);
            }
        }
        
        public void ttt()
        {
            String[] tekst = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
            JFrame frame = new JFrame("TicTacToe");
            frame.setLayout(new GridLayout(3,3));
            //for (int i=0; i<tekst.length; i++)
            //{
                JButton b1 = new JButton(tekst[0]);
                JButton b2 = new JButton(tekst[1]);
                JButton b3 = new JButton(tekst[2]);
                JButton b4 = new JButton(tekst[3]);
                JButton b5 = new JButton(tekst[4]);
                JButton b6 = new JButton(tekst[5]);
                JButton b7 = new JButton(tekst[6]);
                JButton b8 = new JButton(tekst[7]);
                JButton b9 = new JButton(tekst[8]);
                b1.setVerticalTextPosition(SwingConstants.CENTER);
                b1.setHorizontalTextPosition(SwingConstants.CENTER);
                b2.setVerticalTextPosition(SwingConstants.CENTER);
                b2.setHorizontalTextPosition(SwingConstants.CENTER);
                b3.setVerticalTextPosition(SwingConstants.CENTER);
                b3.setHorizontalTextPosition(SwingConstants.CENTER);
                b4.setVerticalTextPosition(SwingConstants.CENTER);
                b4.setHorizontalTextPosition(SwingConstants.CENTER);
                b5.setVerticalTextPosition(SwingConstants.CENTER);
                b5.setHorizontalTextPosition(SwingConstants.CENTER);
                b6.setVerticalTextPosition(SwingConstants.CENTER);
                b6.setHorizontalTextPosition(SwingConstants.CENTER);
                b7.setVerticalTextPosition(SwingConstants.CENTER);
                b7.setHorizontalTextPosition(SwingConstants.CENTER);
                b8.setVerticalTextPosition(SwingConstants.CENTER);
                b8.setHorizontalTextPosition(SwingConstants.CENTER);
                b9.setVerticalTextPosition(SwingConstants.CENTER);
                b9.setHorizontalTextPosition(SwingConstants.CENTER);
                frame.add(b1);
                frame.add(b2);
                frame.add(b3);
                frame.add(b4);
                frame.add(b5);
                frame.add(b6);
                frame.add(b7);
                frame.add(b8);
                frame.add(b9);
            //}
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            //frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setSize(155, 135);
            frame.setResizable(false);
            //b1.setText(" ");
            b1.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (graczNow==0)
                    {
                        buttonXActionPerformed(e, b1);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                    else
                    {
                        buttonOActionPerformed(e, b1);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                }
            });
            b2.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (graczNow==0)
                    {
                        buttonXActionPerformed(e, b2);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                    else
                    {
                        buttonOActionPerformed(e, b2);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                }
            });
            b3.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (graczNow==0)
                    {
                        buttonXActionPerformed(e, b3);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                    else
                    {
                        buttonOActionPerformed(e, b3);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                }
            });
            b4.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (graczNow==0)
                    {
                        buttonXActionPerformed(e, b4);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                    else
                    {
                        buttonOActionPerformed(e, b4);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                }
            });
            b5.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (graczNow==0)
                    {
                        buttonXActionPerformed(e, b5);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                    else
                    {
                        buttonOActionPerformed(e, b5);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                }
            });
            b6.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (graczNow==0)
                    {
                        buttonXActionPerformed(e, b6);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                    else
                    {
                        buttonOActionPerformed(e, b6);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                }
            });
            b7.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (graczNow==0)
                    {
                        buttonXActionPerformed(e, b7);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                    else
                    {
                        buttonOActionPerformed(e, b7);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                }
            });
            b8.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (graczNow==0)
                    {
                        buttonXActionPerformed(e, b8);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                    else
                    {
                        buttonOActionPerformed(e, b8);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                }
            });
            b9.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (graczNow==0)
                    {
                        buttonXActionPerformed(e, b9);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                    else
                    {
                        buttonOActionPerformed(e, b9);
                        koniecttt(b1,b2,b3,b4,b5,b6,b7,b8,b9);
                    }
                }
            });
        }
        public void ro(int pwt)
        {
            for (int i=0; i<pwt; i++)
            {
                System.out.printf("1.Orzel\n2.Reszka: \n");
                Scanner input = new Scanner(System.in);
                String text3 = input.nextLine();
                int p1 = Integer.parseInt(text3);
                int p2=(int)(Math.random()*2+1);
                String p1c;
                String p2c;
                switch (p1) {
                    case 1:
                        p1c="Orzel";
                        break;
                    case 2:
                        p1c ="Reszka";
                        break;
                    default:
                        System.out.println("Zly wybor. Uznane jako Orzel.");
                        p1c ="Orzel";
                }
                switch (p2) {
                    case 1:
                        p2c="Orzel";
                        break;
                    default:
                        p2c ="Reszka";
                        break;
                }

                System.out.printf("%s\t vs\t%s\t", p1c, p2c);
                this.graj(p1, p2);
            }
        }
        
        public void graj(int s1, int s2)
        {
            if (s1==s2) 
            {
                this.win(wyp);
                System.out.printf("Win: %s\n", this.imie);
            }
            else 
            {
                komp.win(wyp);
                System.out.printf("Win: %s\n", komp.imie);
            }
        }
        
        public void win_game()
        {
            System.out.println("\nPrzedszkolak");
            System.out.printf("%s: %d \n", this.imie, this.wyplata);
            System.out.printf("%s: %d \n", komp.imie, komp.wyplata);
            System.out.printf("Winner: ");
            if (this.wyplata>komp.wyplata) System.out.printf("Win: %s \n", this.imie);
            else if (this.wyplata<komp.wyplata) System.out.printf("Win: %s \n", komp.imie);
            else System.out.printf("Nikt... remis. \n");
            System.exit(0);
        }
        
        public void interfejs(Gra g1)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("1.Orzel/Reszka\n2.TicTacToe");
            String rodzajGry = input.nextLine();
            int graInt = Integer.parseInt(rodzajGry);
            switch(graInt)
            {
                case 1:
                    System.out.printf("Ilosc powt: \n");
                    String text3 = input.nextLine();
                    int powt = Integer.parseInt(text3);
                    new Thread(new Timer(360)).start();
                    g1.ro(powt);
                    g1.win_game();
                    break;
                case 2:
                    g1.ttt();
                    break;
                default:
                    System.out.printf("Nie ma takiej gry \n");
                    System.exit(0);
            }
        }
    }

