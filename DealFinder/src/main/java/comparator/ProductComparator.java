package comparator;

import model.Product;

import java.util.List;

public interface ProductComparator {
  List<Product> getBestDeal(List<Product> parsedFromReport, List<Product> identified);
}
