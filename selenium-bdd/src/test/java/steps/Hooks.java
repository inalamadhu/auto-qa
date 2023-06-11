package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import java.sql.SQLOutput;

public class Hooks {
    @Before
    public void before(){
        System.out.println("before method executed");
    }

    @Before("@Smoke")
    public void beforeSmoke(){
        System.out.println("before smoke method executed");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll method executed");
    }

    @After
    public void after(){
        System.out.println("after method executed");
    }

    @After("@Sanity")
    public void afterSanity(){
        System.out.println("after sanity method executed");
    }


    @AfterAll
    public static void afterAll(){
        System.out.println("afterall method executed");
    }

}
