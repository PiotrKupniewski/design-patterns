import java.util.List;
import java.util.stream.Collectors;

public class PackageManager {
  public List<PackagedCoffeeBag> packCoffee(List<SortedCoffeeBag> sortedBags, String scannedLabel) {
    return sortedBags.stream()
        .map(bag -> new PackagedCoffeeBag(bag))
        .collect(Collectors.toList());
  }
}
