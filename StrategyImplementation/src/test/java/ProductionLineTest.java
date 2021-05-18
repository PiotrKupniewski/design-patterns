import org.junit.jupiter.api.Test;
import productline.BrazilianAromaProductionLine;
import productline.PolkawProductionLine;
import productline.guidelines.ProductionGuidelines;
import scanners.BarcodeScanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductionLineTest {

  ProductionGuidelines bz = new ProductionGuidelines(ProductionGuidelines.CoffeeType.GOOD, ProductionGuidelines.PackageType.KG_1);
  ProductionGuidelines polakwEvenGuide = new ProductionGuidelines(ProductionGuidelines.CoffeeType.GOOD, ProductionGuidelines.PackageType.KG_1);
  ProductionGuidelines polakwOddGuide = new ProductionGuidelines(ProductionGuidelines.CoffeeType.VERY_GOOD, ProductionGuidelines.PackageType.KG_1);


  @Test
  public void shouldReturnProperGuideline() {
    var brazilan = new BarcodeScanner("BrazilianAroma-A");
    var brazilanUnusupported = new BarcodeScanner("BrazilianAroma-G");
    var polkawEven = new BarcodeScanner("Polkaw-1234534");
    var polkawOdd = new BarcodeScanner("Polkaw-123453");

    var brazilianProductionLine = new BrazilianAromaProductionLine();
    var brazlizianUnsupportedProductionLine = new BrazilianAromaProductionLine();
    var polkawEvenProductionLine = new PolkawProductionLine();
    var polawOddProductionLine = new PolkawProductionLine();

    var bzProductionGuideline = brazilianProductionLine.getProductionGuideline(brazilan);
    var polkawEvenGuideline = polkawEvenProductionLine.getProductionGuideline(polkawEven);
    var polawOddGuideline = polawOddProductionLine.getProductionGuideline(polkawOdd);

    assertEquals(bz, bzProductionGuideline);
    assertEquals(polakwEvenGuide, polkawEvenGuideline);
    assertEquals(polawOddGuideline, polakwOddGuide);

    assertThrows(UnsupportedOperationException.class, () -> brazlizianUnsupportedProductionLine.getProductionGuideline(brazilanUnusupported));


  }
}
