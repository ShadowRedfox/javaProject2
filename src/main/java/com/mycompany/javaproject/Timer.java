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
public class Timer implements Runnable{
    public int maxCzas;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public Timer(int czas)
    {
        maxCzas=czas;
    }
    
    public void run()
    {
        int time = 0;
        //int maxCzas = 60;
        while(true)
        {
            try
            {
                Thread.sleep(1000);
            } catch(InterruptedException exc)
            {
                System.out.println("Timer został przerwany.\n");
                System.exit(0);
            }
            if (time%10==0)
            {
                System.out.print("Pozostały czas: " + ANSI_RED);
                System.out.println(maxCzas-time);
                System.out.println(ANSI_RESET);
            }
            time++;
            if (time==maxCzas)
            {
                System.out.println("Koniec czasu. Komputer wygrał.\n");
                System.exit(0);
            }
        }
    }
}

