package productline;

import productline.guidelines.ProductionGuidelines;
import scanners.LabelScanner;

public class BrazilianAromaProductionLine implements ProductionLine {
  @Override
  public ProductionGuidelines getProductionGuideline(LabelScanner scanner) {
    final var coffeeQuality = scanner.distinguishQualityBag();

    if (coffeeQuality.equalsIgnoreCase("A")) {
      return new ProductionGuidelines(ProductionGuidelines.CoffeeType.GOOD, ProductionGuidelines.PackageType.KG_1);
    } else if (coffeeQuality.equalsIgnoreCase("B")) {
      return new ProductionGuidelines(ProductionGuidelines.CoffeeType.VERY_GOOD, ProductionGuidelines.PackageType.KG_1);
    } else if (coffeeQuality.equalsIgnoreCase("C")) {
      return new ProductionGuidelines(ProductionGuidelines.CoffeeType.PREMIUM, ProductionGuidelines.PackageType.KG_2);
    } else {
      throw new UnsupportedOperationException("Unsupported production line!");
    }
  }
}
