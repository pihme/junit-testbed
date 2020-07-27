package com.github.pihme;

import java.util.function.Supplier;

public class Dummy {

  public int foo() {
    return 42;
  }

  public int fooWithSupplier(Supplier<Integer> supplier) {
    return supplier.get();
  }

}
