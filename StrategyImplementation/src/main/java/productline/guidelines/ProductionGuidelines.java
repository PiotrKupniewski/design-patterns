package productline.guidelines;

import lombok.Value;
import scanner.LabelScanner;

@Value
public class ProductionGuidelines {
  LabelScanner.CoffeType coffeeType;
  LabelScanner.PackageType packageType;
}
