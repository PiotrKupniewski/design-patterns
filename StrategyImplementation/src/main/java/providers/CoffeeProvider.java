package providers;

import lombok.Value;
import productline.ProductionLine;
import scanner.LabelScanner;

@Value
class CoffeeProvider {
  String name;
  LabelScanner labelScanner;
  ProductionLine productionLine;
}
