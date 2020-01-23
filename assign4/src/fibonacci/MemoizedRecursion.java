package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class MemoizedRecursion extends SimpleRecursion  {
  static public Map<Integer, Integer> cache = new HashMap<>();

  @Override
  public int computeFibonacci(int position) {

    if(!cache.containsKey(position)) {
      cache.put(position, super.computeFibonacci(position));
    }

    return cache.get(position);
  }
}
