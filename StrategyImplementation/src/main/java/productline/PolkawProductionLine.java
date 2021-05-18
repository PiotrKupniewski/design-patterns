package productline;

import productline.guidelines.ProductionGuidelines;
import scanner.LabelScanner;

public class PolkawProductionLine implements ProductionLine {
  @Override
  public ProductionGuidelines getProductionGuideline(LabelScanner scanner ) {
    final var coffeeQuality = scanner.getCoffeeQuality();

    if((Long.parseLong(coffeeQuality) & 1) == 0){
      return new ProductionGuidelines(LabelScanner.CoffeType.GOOD, LabelScanner.PackageType.KG_1);
    }else if((Long.parseLong(coffeeQuality) & 1) == 1){
      return new ProductionGuidelines(LabelScanner.CoffeType.VERY_GOOD, LabelScanner.PackageType.KG_1);
    }else{
      throw new UnsupportedOperationException("Unsupported production line!");
    }
  }
}
