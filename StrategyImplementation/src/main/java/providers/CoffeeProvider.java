package providers;

import lombok.Value;
import productline.ProductionLine;
import scanners.LabelScanner;

@Value
class CoffeeProvider {
  String name;
  LabelScanner barcodeScanner;
  ProductionLine productionLine;
}
