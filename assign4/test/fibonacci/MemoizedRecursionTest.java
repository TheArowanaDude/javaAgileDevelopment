package fibonacci;

public class MemoizedRecursionTest implements FibonacciTest{

  @Override
  public Fibonacci createFibonacci() {
    return new MemoizedRecursion();
  }
}