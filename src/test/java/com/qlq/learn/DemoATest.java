package com.qlq.learn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoATest {
    /**
     * @BeforeClass调用一次
     * @Before 每次都调用
     * @Test
     *      @Test(expected=异常类)
     *      @Test(timeout=毫秒)
     * @After 每次调用
     * @AfterClass 调用一次
     * @Ignore忽略
     * @RunWith 更改测试运行器
     */


    @Before
    public void setUp() throws Exception {
        System.out.println("@Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@After");
    }

    @Test
    public void add() {
        System.out.println("@Test1");
    }

    @Test
    public void a() {
        System.out.println("@Test2");
    }



}