package sort;

import lombok.Value;
import scan.CoffeeBag;
import scan.Label;

@Value
public class SortedCoffeeBag {
  CoffeeBag.CoffeeQuality quality;
  Label label;
}
