package fibonacci;

public class ImperativeIteration implements Fibonacci {

  @Override
  public int computeFibonacci(int position) {
    assertPosition(position);

    int result = 1;
    int previousFibonacci = 1;

    for (int i = 1; i < position; i++) {
      int temp = result;
      result += previousFibonacci;
      previousFibonacci = temp;
    }

    return result;
  }
}
