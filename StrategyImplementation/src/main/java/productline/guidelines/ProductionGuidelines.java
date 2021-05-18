package productline.guidelines;

import lombok.Value;

@Value
public class ProductionGuidelines {

  CoffeeType coffeeType;
  PackageType packageType;

  public enum CoffeeType {
    PREMIUM, VERY_GOOD, GOOD
  }
  public enum PackageType {
    KG_1, KG_2
  }
}
