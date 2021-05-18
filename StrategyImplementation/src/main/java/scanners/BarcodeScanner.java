package scanners;

import lombok.NonNull;
import lombok.Value;

@Value
public class LabelScanner implements LabelScannerAbstract{
  @Override
  public String getProvider() {
    return null;
  }

  @Override
  public String distinguishQualityBag() {
    return null;
  }


  //  @NonNull  String barcode;
//
//  public String getProvider(){
//    return this.barcode.split("-")[0];
//  }
//
//  public String getCoffeeQuality(){
//    return this.barcode.split("-")[1];
//  }

}
