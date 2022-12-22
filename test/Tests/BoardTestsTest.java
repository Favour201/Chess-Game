/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Game.Board;
import Game.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class BoardTestsTest {
    
    public BoardTestsTest() {
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
     * Test of confirmBoardSetUp method, of class BoardTests.
     */
    @Test
    public void testConfirmBoardSetUp() throws Exception {
        System.out.println("confirmBoardSetUp");
        BoardTests instance = new BoardTests();
        instance.confirmBoardSetUp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createGameHelper method, of class BoardTests.
     */
    @Test
    public void testCreateGameHelper() {
        System.out.println("createGameHelper");
        int row = 0;
        Color playerColor = null;
        Board board = null;
        BoardTests instance = new BoardTests();
        instance.createGameHelper(row, playerColor, board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
