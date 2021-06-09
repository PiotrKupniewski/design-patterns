import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class PackagedCoffeeBag {

  CoffeeBag.CoffeeQuality quality;
  double packageSize;

  PackagedCoffeeBag(SortedCoffeeBag bag){
    this.quality = bag.getQuality();
    this.packageSize = selectPackageSize(bag);
  }

  private double selectPackageSize(SortedCoffeeBag bag) {
    return 1.0d;
  }

}

