package org.rexsong.demo.cucumberjunit.steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {

  @BeforeAll
  public static void beforeAll() {
    System.out.println("before all executed");
  }

  @AfterAll
  public static void afterAll() {
    System.out.println("after all executed");
  }
}
