package fibonacci;

public interface Fibonacci {

  int computeFibonacci(int position);

  default void assertPosition(int position){
    if(position < 0) {
      throw new IllegalArgumentException("Input should be positive");
    }
  }
}