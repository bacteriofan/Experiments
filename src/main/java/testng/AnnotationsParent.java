package testng;

import org.testng.annotations.*;

public class AnnotationsParent {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        System.out.println("before suite parent");
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("before test parent");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before class parent");
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
