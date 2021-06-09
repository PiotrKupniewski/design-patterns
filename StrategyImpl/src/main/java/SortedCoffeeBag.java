import lombok.Value;

@Value
public class SortedCoffeeBag {
  CoffeeBag.CoffeeQuality quality;
  Label label;
}
