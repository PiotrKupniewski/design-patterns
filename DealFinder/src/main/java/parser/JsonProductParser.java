package parser;

import lombok.RequiredArgsConstructor;
import model.Product;

import java.util.List;

@RequiredArgsConstructor
public
class JsonProductParser implements ProductReportParser{

  private final String report;

  @Override
  public List<Product> parseReport() {
    return null;
  }
}
