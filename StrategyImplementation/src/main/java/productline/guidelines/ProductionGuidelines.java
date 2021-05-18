import lombok.Value;

@Value
public class ProductionGuidelines {
  LabelScanner.CoffeType coffeeType;
  LabelScanner.PackageType packageType;
}
