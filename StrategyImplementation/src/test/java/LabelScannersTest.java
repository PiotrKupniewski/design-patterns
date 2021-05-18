import org.junit.jupiter.api.Test;
import scanner.LabelScanner;

import static org.junit.jupiter.api.Assertions.*;

public class LabelScannersTest {

  @Test
  public void shouldScannerBarcode(){
    String barcode = "BrazillianAroma-A";

     var labelScanner = new LabelScanner(barcode);

     assertEquals("BrazillianAroma", labelScanner.getProvider());
     assertEquals("A", labelScanner.getCoffeeQuality());

  }
}
