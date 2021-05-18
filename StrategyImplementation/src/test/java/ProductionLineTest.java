import org.junit.jupiter.api.Test;
import productline.BrazilianAromaProductionLine;
import productline.PolkawProductionLine;
import productline.ProductionLine;
import productline.guidelines.ProductionGuidelines;
import scanner.LabelScanner;

import static org.junit.jupiter.api.Assertions.*;

public class ProductionLineTest {

  @Test
  public void shouldReturnProperGuideline(){
    LabelScanner brazilan = new LabelScanner("BrazilianAroma-A");
    LabelScanner brazilanUnusupported = new LabelScanner("BrazilianAroma-G");
    LabelScanner polkawEven = new LabelScanner("Polkaw-1234534");
    LabelScanner polkawOdd = new LabelScanner("Polkaw-123453");

    ProductionLine brazilianProductionLine = new BrazilianAromaProductionLine();
    ProductionLine brazlizianUnsupportedProductionLine = new BrazilianAromaProductionLine();
    ProductionLine polkawEvenProductionLine = new PolkawProductionLine();
    ProductionLine polawOddProductionLine = new PolkawProductionLine();

    var bzProductionGuideline = brazilianProductionLine.getProductionGuideline(brazilan);
    var polkawEvenGuideline = polkawEvenProductionLine.getProductionGuideline(polkawEven);
    var polawOddGuideline = polawOddProductionLine.getProductionGuideline(polkawOdd);


    ProductionGuidelines bz = new ProductionGuidelines(LabelScanner.CoffeType.GOOD, LabelScanner.PackageType.KG_1);
    ProductionGuidelines polakwEvenGuide = new ProductionGuidelines(LabelScanner.CoffeType.GOOD, LabelScanner.PackageType.KG_1);
    ProductionGuidelines polakwOddGuide = new ProductionGuidelines(LabelScanner.CoffeType.VERY_GOOD, LabelScanner.PackageType.KG_1);

    assertEquals(bz, bzProductionGuideline);
    assertEquals(polakwEvenGuide, polkawEvenGuideline);
    assertEquals(polawOddGuideline, polakwOddGuide);

    assertThrows(UnsupportedOperationException.class, () -> brazlizianUnsupportedProductionLine.getProductionGuideline(brazilanUnusupported));


  }
}
