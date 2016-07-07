/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaproject;

import javax.swing.JButton;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jakub
 */
public class GraTest {
    
    public GraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of koniecttt method, of class Gra.
     */
    @org.junit.Test
    public void testKoniecttt() {
        System.out.println("koniecttt");
        JButton b1 = null;
        JButton b2 = null;
        JButton b3 = null;
        JButton b4 = null;
        JButton b5 = null;
        JButton b6 = null;
        JButton b7 = null;
        JButton b8 = null;
        JButton b9 = null;
        Gra instance = new Gra();
        instance.koniecttt(b1, b2, b3, b4, b5, b6, b7, b8, b9);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ttt method, of class Gra.
     */
    @org.junit.Test
    public void testTtt() {
        System.out.println("ttt");
        Gra instance = new Gra();
        instance.ttt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ro method, of class Gra.
     */
    @org.junit.Test
    public void testRo() {
        System.out.println("ro");
        int pwt = 0;
        Gra instance = new Gra();
        instance.ro(pwt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of graj method, of class Gra.
     */
    @org.junit.Test
    public void testGraj() {
        System.out.println("graj");
        int s1 = 0;
        int s2 = 0;
        Gra instance = new Gra();
        instance.graj(s1, s2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of win_game method, of class Gra.
     */
    @org.junit.Test
    public void testWin_game() {
        System.out.println("win_game");
        Gra instance = new Gra();
        instance.win_game();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of interfejs method, of class Gra.
     */
    @org.junit.Test
    public void testInterfejs() {
        System.out.println("interfejs");
        Gra g1 = null;
        Gra instance = new Gra();
        instance.interfejs(g1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
