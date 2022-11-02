package org.rexsong.demo.cucumberjunit.steps;

import io.cucumber.java.en.Given;

public class DemoStep {
  @Given("I start browser at start")
  public void Open_Browser_At_Start() {
      System.out.println("Started Browser");
  }
}
