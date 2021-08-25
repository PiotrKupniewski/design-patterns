package scan;

import lombok.Value;

@Value
public class CoffeeBag {
  public enum CoffeeQuality{
    DOBRA, ŚWIETNA, WYBORNA
  }
  Label label;
}
