import lombok.Value;

@Value
public class CoffeeBag {
  public enum CoffeeQuality{
    DOBRA, ŚWEITNA, WYBORNA
  }

  Label label;
}
