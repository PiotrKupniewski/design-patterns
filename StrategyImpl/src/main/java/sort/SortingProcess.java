package sort;

import scan.CoffeeBag;
import scan.Truck;

import java.util.List;

public interface SortingProcess {

  List<SortedCoffeeBag> sort(Truck truck);
  CoffeeBag.CoffeeQuality chooseCoffeeTypeBasedOnLabel(CoffeeBag coffeeBag);
}
