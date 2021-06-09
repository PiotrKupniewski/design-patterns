import java.util.List;
import java.util.stream.Collectors;

public class CoffeeSorter {

  public List<SortedCoffeeBag> sort(Truck truck) {
    return truck.getBags().stream()
        .map(bag -> new SortedCoffeeBag(chooseCoffeeTypeBasedOnLabel(bag), bag.getLabel()))
        .collect(Collectors.toList());
  }

  private CoffeeBag.CoffeeQuality chooseCoffeeTypeBasedOnLabel(CoffeeBag coffeeBag){
    return CoffeeBag.CoffeeQuality.DOBRA;
  }
}
