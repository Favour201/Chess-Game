/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author chris
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Tests.BoardTestsTest.class, Tests.QueenTestsTest.class, Tests.CheckmateTestsTest.class, Tests.KnightTestsTest.class, Tests.RookTestsTest.class, Tests.BishopTestsTest.class, Tests.KingTestsTest.class, Tests.PawnTestsTest.class})
public class TestsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
