package fibonacci;

public class SimpleRecursionTest implements FibonacciTest {

  @Override
  public Fibonacci createFibonacci() {
    return new SimpleRecursion();
  }
}