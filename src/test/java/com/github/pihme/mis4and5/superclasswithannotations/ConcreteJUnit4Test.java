package com.github.pihme.mis4and5.superclasswithannotations;

import org.junit.Assert;
import org.junit.Test;

public class ConcreteJUnit4Test extends AbstractTestCase {

  @Test
  public void testFoo() {

    int actual = getSut().foo();

    Assert.assertEquals(42, actual);
  }
}
