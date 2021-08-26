package identifier;

import model.Product;

import java.util.List;

public interface ProductIdentififer {

  List<Product> identifyProducts(List<Product> parsedProducts);
}
