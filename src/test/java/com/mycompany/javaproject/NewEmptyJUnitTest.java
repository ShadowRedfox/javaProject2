/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaproject;

import com.mycompany.javaProject.Gra2;
import com.mycompany.javaProject.Gracz;
import com.mycompany.javaProject.Gra3;
import com.mycompany.javaProject.Gra;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jakub
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test1() 
    {
        Gracz g1 = new Gracz ("test");
        Gra g2 = new Gra ("test1", g1, 0);
        Assert.assertEquals(g2 instanceof Gra, true);
    }
    @Test
    public void test2()
    {
	Gracz g1 = new Gracz("test");
	String str = "test2";
	Assert.assertNotEquals(g1.getName(), str);
    }
    @Test
    public void test3()
    {
	Gracz g1 = new Gracz("test");
        Gra g2 = new Gra("test3", g1, 100);
	String str = "test2";
	Assert.assertNotEquals(g2.getName(), str);
    }
    @Test
    public void test4()
    {
	Gracz g1 = new Gracz("test");
        Gra2 g2 = new Gra2("test4", g1, 100);
	String str = "test2";
	Assert.assertNotEquals(g2.getName(), str);
    }
    @Test
    public void test5()
    {
	Gracz g1 = new Gracz("test");
        Gra3 g2 = new Gra3("test5", g1, 100);
	String str = "test2";
	Assert.assertNotEquals(g2.getName(), str);
    }
}
