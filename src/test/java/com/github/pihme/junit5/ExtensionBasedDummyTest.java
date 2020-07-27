package com.github.pihme.junit5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;


public class ExtensionBasedDummyTest {

  @RegisterExtension
  public DummyExtension dummyExtension = new DummyExtension();

  @Test
  public void testFoo() {

    int actual = dummyExtension.getSut().foo();

    Assert.assertEquals(42, actual);
  }


}
