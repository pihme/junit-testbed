package com.github.pihme.mis4and5;



import com.github.pihme.Dummy;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class DummyTest {

  private Dummy sut = new Dummy();

  @Test
  @org.junit.Test
  public void testFoo() {

    int actual = sut.foo();

    Assert.assertEquals(42, actual);
  }

  @Test
  public void testFoo5() {

    int actual = sut.foo();

    Assert.assertEquals(42, actual);
  }

  @org.junit.Test
  public void testFoo4() {

    int actual = sut.foo();

    Assert.assertEquals(42, actual);
  }

}

