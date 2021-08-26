import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
class JsonProductParser implements ProductReportParser{

  private final String report;

  @Override
  public List<Product> parseReport() {
    return null;
  }
}
