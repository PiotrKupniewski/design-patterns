package scanners;

import lombok.NonNull;
import lombok.Value;

@Value
public class BarcodeScanner implements LabelScanner {

  @NonNull String barcode;

  @Override
  public String getProvider() {
    return this.barcode.split("-")[0];
  }

  @Override
  public String distinguishQualityBag() {
    return this.barcode.split("-")[1];
  }
}
