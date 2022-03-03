package testng;

import org.testng.annotations.*;

public class AnnotationsChild extends AnnotationsParent {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test");
    }

    @AfterGroups(value = {"my"})
    public void afterGroups() {
        System.out.println("after groups");
    }

    @BeforeGroups(value = {"my"})
    public void beforeGroups() {
        System.out.println("before groups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }

    @Test
    public void test1() {
        System.out.println("test 1");
    }

    @Test(groups = {"my"})
    public void test2() {
        System.out.println("test 2");
    }

}


/*
@BeforeSuite
@AfterSuite
@BeforeTest
@AfterTest

@BeforeGroups
@AfterGroups
@BeforeClass
@AfterClass
@BeforeMethod
@AfterMethod*/
