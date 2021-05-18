import org.junit.jupiter.api.Test;
import scanners.BarcodeScanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarcodeScannersTest {

  @Test
  public void shouldScannerBarcode() {
    String barcode = "BrazillianAroma-A";

    var labelScanner = new BarcodeScanner(barcode);

    assertEquals("BrazillianAroma", labelScanner.getProvider());
    assertEquals("A", labelScanner.distinguishQualityBag());

  }
}
