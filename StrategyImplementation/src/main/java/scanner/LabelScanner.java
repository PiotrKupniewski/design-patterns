import lombok.NonNull;
import lombok.Value;

@Value
public class LabelScanner {
  @NonNull  String barcode;

  public enum CoffeType{
    PREMIUM, VERY_GOOD, GOOD
  }

  public enum PackageType{
    KG_1,KG_2
  }

  public String getProvider(){
    return this.barcode.split("-")[0];
  }

  public String getCoffeeQuality(){
    return this.barcode.split("-")[1];
  }

}
