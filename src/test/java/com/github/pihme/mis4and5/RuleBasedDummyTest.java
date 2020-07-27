package com.github.pihme.mis4and5;

import com.github.pihme.junit4.DummyRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class RuleBasedDummyTest {

  @Rule
  public DummyRuleExtension dummyRule = new DummyRuleExtension();

  @Test
  public void testFoo() {

    int actual = dummyRule.getSut().foo();

    Assert.assertEquals(42, actual);
  }


}
