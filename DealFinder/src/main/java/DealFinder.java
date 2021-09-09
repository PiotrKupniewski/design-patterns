import comparator.BestDealComparator;
import comparator.ProductComparator;
import identifier.DBProductIdentifier;
import identifier.ProductIdentififer;
import model.Product;
import parser.JsonProductParser;
import parser.ProductReportParser;

import java.util.List;

public class DealFinder {

  private final ProductReportParser parser;
  private final ProductIdentififer identifier;
  private final ProductComparator comparator;

  public DealFinder(String type){
    if(type.equals("json")){
      this.parser = new JsonProductParser();
      this.identifier = new DBProductIdentifier();
      this.comparator = new BestDealComparator();
    }else{
      throw new UnsupportedOperationException("Unsupported type");
    }
  }


  List<Product> findGoodPrices(){
    var parsedProducts = parser.parseReport();
    var identifiedProducts = identifier.identifyProducts(parsedProducts);
    return comparator.getBestDeal(parsedProducts, identifiedProducts);
  }
}

