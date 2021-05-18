package productline;

import productline.guidelines.ProductionGuidelines;
import scanner.LabelScanner;

public interface ProductionLine {
  ProductionGuidelines getProductionGuideline(LabelScanner scanner);
}
