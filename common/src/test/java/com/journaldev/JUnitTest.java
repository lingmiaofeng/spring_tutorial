package com.journaldev;

import org.jetbrains.exceptions.MyException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;


/**
 * Created by radar on 23.5.15.
 */
public class JUnitTest {
    private Logger logger = LoggerFactory.getLogger(JUnitTest.class);
    private Long num;
    
    @Before
    public void setUp(){
        num = 123l;
        logger.debug("Variable num is set.");

    }

    @Test
    public void test()  {
        Assert.assertNotNull(num);
    }

    @Test(expected = Exception.class)
    public void test2() throws MyException {
        logger.debug("Test výjimky - před vyhozením.");

        Random r = new Random();
        int rand = r.nextInt(10);


        if (rand > 0 && rand < 10 )
            throw new MyException("Test výjimky");

        logger.debug("Test výjimky - po vyhozením.");
    }

    @After
    public void tear(){
        num = null;
        Assert.assertNull(num);
        logger.debug("Variable num set to null.");

    }
}
