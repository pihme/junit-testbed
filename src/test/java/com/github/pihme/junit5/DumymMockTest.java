package com.github.pihme.junit5;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.github.pihme.Dummy;
import java.util.function.Supplier;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DumymMockTest {

  @Mock
  Supplier<Integer> mockSupplier;

  private Dummy sut = new Dummy();

  @Test
  public void testFooWithSupplier() {
    when(mockSupplier.get()).thenReturn(42);

    int actual = sut.fooWithSupplier(mockSupplier);

    Assert.assertEquals(42, actual);
    verify(mockSupplier).get();
  }

}
