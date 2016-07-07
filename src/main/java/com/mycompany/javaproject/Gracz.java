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
public class Gracz
    {
        public String imie;
        public int wyplata;
        
        public Gracz()
        {
            
        }
        
        public Gracz (String name)
        {
            imie=name;
            wyplata=0;
        }
        
        public void win(int w)
        {
            wyplata+=w;
        }
    }

