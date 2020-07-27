package com.github.pihme.mis4and5.superclasswithannotations;

import com.github.pihme.Dummy;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public abstract class AbstractTestCase {

  private Dummy sut = new Dummy();

  public Dummy getSut() {
    return sut;
  }

  @Test
  @org.junit.Test
  public void Fail() {
    Assert.fail("Fail on purpose");
  }
}
