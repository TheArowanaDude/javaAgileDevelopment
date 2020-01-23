package fibonacci;

public class ImperativeIterationTest implements FibonacciTest {

  @Override
  public Fibonacci createFibonacci() {
    return new ImperativeIteration();
  }
}