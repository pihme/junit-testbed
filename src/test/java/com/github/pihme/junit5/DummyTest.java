package com.github.pihme.junit5;



import com.github.pihme.Dummy;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class DummyTest {

  private Dummy sut = new Dummy();

  @Test
  public void testFoo() {

    int actual = sut.foo();

    Assert.assertEquals(42, actual);
  }

}

