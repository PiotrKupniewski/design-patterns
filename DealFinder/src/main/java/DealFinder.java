import comparator.ProductComparator;
import identifier.ProductIdentififer;
import lombok.RequiredArgsConstructor;
import model.Product;
import parser.ProductReportParser;

import java.util.List;

@RequiredArgsConstructor
public class DealFinder {

  private final ProductReportParser parser;
  private final ProductIdentififer identifier;
  private final ProductComparator comparator;

  List<Product> findGoodPrices(){
    var parsedProducts = parser.parseReport();
    var identifiedProducts = identifier.identifyProducts(parsedProducts);
    var foundDeals = comparator.getBestDeal(parsedProducts, identifiedProducts);
    return foundDeals;
  }
}
