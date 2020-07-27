package com.github.pihme;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class DummyRule implements TestRule {

  private Dummy sut = new Dummy();

  @Override
  public Statement apply(final Statement statement, final Description description) {
    return new Statement() {
      @Override
      public void evaluate() throws Throwable {
        statement.evaluate();
      }
    };
  }

  public Dummy getSut() {
    return sut;
  }
}
