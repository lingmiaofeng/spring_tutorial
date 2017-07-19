package com.journaldev.java.dependencyinjection.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Created by radar on 23.5.15.
 */
public class JUnitTest {
    private Logger logger = LoggerFactory.getLogger(JUnitTest.class);
    private Long num;
    
    @Before
    public void setUp(){
        num = new Long(123l);
        logger.debug("Variable num is set.");

    }

    @Test
    public void test()  {
        Assert.assertNotNull(num);
    }

    @Test(expected = Exception.class)
    public void test2() throws Exception {
        logger.debug("Test výjimky - před vyhozením.");

        if (1==1)
            throw new Exception("Test výjimky");

        logger.debug("Test výjimky - po vyhozením.");
    }

    @After
    public void tear(){
        num = null;
        Assert.assertNull(num);
        logger.debug("Variable num set to null.");

    }
}
