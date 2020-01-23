package fibonacci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public interface FibonacciTest {

  Fibonacci createFibonacci();

  @Test
  default void testPositions() {
    Fibonacci instance = createFibonacci();

    assertAll(
      () -> assertEquals(1, instance.computeFibonacci(0)),
      () -> assertEquals(1, instance.computeFibonacci(1)),
      () -> assertEquals(2, instance.computeFibonacci(2)),
      () -> assertEquals(55, instance.computeFibonacci(9))
    );
  }

  @Test
  default void testIllegalArgumentException() {
    Fibonacci instance = createFibonacci();
    assertThrows(IllegalArgumentException.class,
      () -> instance.computeFibonacci(-1));

  }
}
