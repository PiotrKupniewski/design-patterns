package pack;

import sort.SortedCoffeeBag;

import java.util.List;

public interface PackageProcess {
  List<PackagedCoffeeBag> packCoffee(List<SortedCoffeeBag> sortedBags);
}
