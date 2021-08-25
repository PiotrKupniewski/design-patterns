package productline;

import productline.guidelines.ProductionGuidelines;
import scanners.LabelScanner;

public interface ProductionLine {
  ProductionGuidelines getProductionGuideline(LabelScanner scanner);
}
