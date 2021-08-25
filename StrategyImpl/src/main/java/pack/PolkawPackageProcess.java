package pack;

import scan.CoffeeBag;
import sort.SortedCoffeeBag;

import java.util.List;
import java.util.stream.Collectors;

public class PolkawPackageProcess implements PackageProcess {
  @Override
  public List<PackagedCoffeeBag> packCoffee(List<SortedCoffeeBag> sortedBags) {
    return sortedBags.stream()
        .map(bag -> new PackagedCoffeeBag(bag.getQuality(), selectPackageSize(bag)))
        .collect(Collectors.toList());
  }

  private double selectPackageSize(SortedCoffeeBag bag) {
    var quality = bag.getQuality();
    if(quality == CoffeeBag.CoffeeQuality.DOBRA){
      return 1.0;
    }else if(quality == CoffeeBag.CoffeeQuality.ŚWIETNA){
      return 1.0;
    }else{
      throw new UnsupportedOperationException("Noy support other quality");
    }
  }
}
