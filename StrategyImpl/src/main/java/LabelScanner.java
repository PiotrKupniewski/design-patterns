import lombok.Value;

@Value
public class LabelScanner {
  public String scan(Truck truck){
    return truck.getTruckLabel().getLabelName();
  }
}
