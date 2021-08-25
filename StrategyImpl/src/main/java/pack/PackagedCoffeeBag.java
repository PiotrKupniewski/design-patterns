package pack;

import lombok.Value;
import scan.CoffeeBag;

@Value
public class PackagedCoffeeBag {

  CoffeeBag.CoffeeQuality quality;
  double packageSize;

}

