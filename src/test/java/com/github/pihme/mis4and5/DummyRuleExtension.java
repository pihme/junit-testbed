package com.github.pihme.mis4and5;

import com.github.pihme.Dummy;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class DummyRuleExtension implements BeforeAllCallback, TestRule {

  private Dummy sut;

  @Override
  public Statement apply(final Statement statement, final Description description) {
    initSut();
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

  @Override
  public void beforeAll(final ExtensionContext extensionContext) throws Exception {
    initSut();
  }

  private void initSut() {
    System.out.println("initSut");
    if (sut == null) {
      sut = new Dummy();
    }
  }
}
