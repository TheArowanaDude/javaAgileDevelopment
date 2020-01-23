package fibonacci;

public class SimpleRecursion implements Fibonacci {

  @Override
  public int computeFibonacci(int position){
    assertPosition(position);

    if(position < 2) {
      return 1;
    }

    return computeFibonacci(position-1)
      + computeFibonacci(position-2);
  }
}
