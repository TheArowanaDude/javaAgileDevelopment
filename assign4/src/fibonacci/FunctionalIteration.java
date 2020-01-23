package fibonacci;

import java.util.List;
import java.util.stream.Stream;

public class FunctionalIteration implements Fibonacci {

  @Override
  public int computeFibonacci(int position){
    assertPosition(position);

    return Stream.iterate(List.of(0, 1),
        series -> List.of(series.get(1), series.get(0) + series.get(1)))
      .map(series -> series.get(1))
      .limit(position + 1)
      .skip(position)
      .findFirst()
      .orElse(1);
  }
}