package scan;

import lombok.Value;

import java.util.List;

@Value
public class Truck {
  Label truckLabel;
  List<CoffeeBag> bags;
}
