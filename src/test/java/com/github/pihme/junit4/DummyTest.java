package com.github.pihme.junit4;



import com.github.pihme.Dummy;
import org.junit.Assert;
import org.junit.Test;

public class DummyTest {

  private Dummy sut = new Dummy();

  @Test
  public void testFoo() {

    int actual = sut.foo();

    Assert.assertEquals(42, actual);
  }

}

