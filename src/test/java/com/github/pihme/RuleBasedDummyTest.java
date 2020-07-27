package com.github.pihme;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class RuleBasedDummyTest {

  @Rule
  public DummyRule dummyRule = new DummyRule();

  @Test
  public void testFoo() {

    int actual = dummyRule.getSut().foo();

    Assert.assertEquals(42, actual);
  }


}
