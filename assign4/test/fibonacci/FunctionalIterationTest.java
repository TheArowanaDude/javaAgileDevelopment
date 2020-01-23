package fibonacci;

public class FunctionalIterationTest implements FibonacciTest {

  @Override
  public Fibonacci createFibonacci() {
    return new FunctionalIteration();
  }
}