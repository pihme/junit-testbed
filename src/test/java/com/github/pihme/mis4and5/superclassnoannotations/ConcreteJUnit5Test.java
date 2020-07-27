package com.github.pihme.mis4and5.superclassnoannotations;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ConcreteJUnit5Test extends AbstractTestCase {

  @Test
  public void testFoo() {

    int actual = getSut().foo();

    Assert.assertEquals(42, actual);
  }
}
