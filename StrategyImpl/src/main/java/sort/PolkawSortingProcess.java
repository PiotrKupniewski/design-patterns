package sort;

import scan.CoffeeBag;
import scan.Truck;

import java.util.List;
import java.util.stream.Collectors;

public class PolkawSortingProcess implements SortingProcess{

  @Override
  public List<SortedCoffeeBag> sort(List<CoffeeBag> bags) {
    return bags.stream()
        .map(bag -> new SortedCoffeeBag(chooseCoffeeTypeBasedOnLabel(bag), bag.getLabel()))
        .collect(Collectors.toList());
  }
  @Override
  public CoffeeBag.CoffeeQuality chooseCoffeeTypeBasedOnLabel(CoffeeBag coffeeBag) {

    var labelName = coffeeBag.getLabel().getLabelName();
    var length = coffeeBag.getLabel().getLabelName().length();

    if(labelName.isEmpty()){
      throw new UnsupportedOperationException("Empty label");
    }

    final var bitwise = Character.getNumericValue(labelName.charAt(length - 1)) & 1;
    if (bitwise == 1 ) {
      return CoffeeBag.CoffeeQuality.ŚWIETNA;
    } else if (bitwise == 0) {
      return CoffeeBag.CoffeeQuality.DOBRA;
    } else {
      return CoffeeBag.CoffeeQuality.WYBORNA;
    }
  }
}
