package com.github.pihme.junit5;

import com.github.pihme.Dummy;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class DummyExtension implements BeforeAllCallback {

  private Dummy sut = new Dummy();

  public Dummy getSut() {
    return sut;
  }

  @Override
  public void beforeAll(final ExtensionContext extensionContext) throws Exception {
    sut = new Dummy();
  }
}
