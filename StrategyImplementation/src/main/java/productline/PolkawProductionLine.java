package productline;

import productline.guidelines.ProductionGuidelines;
import scanners.LabelScanner;

public class PolkawProductionLine implements ProductionLine {
  @Override
  public ProductionGuidelines getProductionGuideline(LabelScanner scanner) {
    final var coffeeQuality = scanner.distinguishQualityBag();

    if ((Long.parseLong(coffeeQuality) & 1) == 0) {
      return new ProductionGuidelines(ProductionGuidelines.CoffeeType.GOOD, ProductionGuidelines.PackageType.KG_1);
    } else if ((Long.parseLong(coffeeQuality) & 1) == 1) {
      return new ProductionGuidelines(ProductionGuidelines.CoffeeType.VERY_GOOD, ProductionGuidelines.PackageType.KG_1);
    } else {
      throw new UnsupportedOperationException("Unsupported production line!");
    }
  }
}
