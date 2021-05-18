public class BrazilianAromaProductionLine implements ProductionLine{
  @Override
  public ProductionGuidelines getProductionGuideline(LabelScanner scanner) {
    final var coffeeQuality = scanner.getCoffeeQuality();

    if(coffeeQuality.equalsIgnoreCase("A")){
      return new ProductionGuidelines(LabelScanner.CoffeType.GOOD, LabelScanner.PackageType.KG_1);
    }else if(coffeeQuality.equalsIgnoreCase("B")){
      return new ProductionGuidelines(LabelScanner.CoffeType.VERY_GOOD, LabelScanner.PackageType.KG_1);
    }else if(coffeeQuality.equalsIgnoreCase("C")){
      return new ProductionGuidelines(LabelScanner.CoffeType.PREMIUM, LabelScanner.PackageType.KG_2);
    }else{
      throw new UnsupportedOperationException("Unsupported production line!");
    }
  }
}
