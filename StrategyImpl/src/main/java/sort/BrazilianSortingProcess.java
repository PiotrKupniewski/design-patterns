package sort;

import scan.CoffeeBag;
import scan.Truck;

import java.util.List;
import java.util.stream.Collectors;

public class BrazilianSortingProcess implements SortingProcess{

  @Override
  public List<SortedCoffeeBag> sort(List<CoffeeBag> bags) {
    return bags.stream()
        .filter(bag -> !bag.getLabel().getLabelName().isEmpty())
        .map(bag -> new SortedCoffeeBag(chooseCoffeeTypeBasedOnLabel(bag), bag.getLabel()))
        .collect(Collectors.toList());
  }

  @Override
  public CoffeeBag.CoffeeQuality chooseCoffeeTypeBasedOnLabel(CoffeeBag coffeeBag) {
    if (coffeeBag.getLabel().getLabelName().startsWith("A")) {
      return CoffeeBag.CoffeeQuality.DOBRA;
    } else if (coffeeBag.getLabel().getLabelName().startsWith("B")) {
      return CoffeeBag.CoffeeQuality.ŚWIETNA;
    } else {
      return CoffeeBag.CoffeeQuality.WYBORNA;
    }
  }
}
