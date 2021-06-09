import org.junit.jupiter.api.Test;

import java.util.List;

public class SimulationTest {

  @Test
  public void simulationTest(){

    List<CoffeeBag> aromaBags = List.of(new CoffeeBag(new Label("abe")),
        new CoffeeBag(new Label("abe")),
        new CoffeeBag(new Label("abe")),
        new CoffeeBag(new Label("abe")),
        new CoffeeBag(new Label("abe")),
        new CoffeeBag(new Label("abe")));

    Label aromaLabel = new Label("Aroma");
    Truck truck = new Truck(aromaLabel,aromaBags);


    // zczytywanie etykiety z ciężarówki
    LabelScanner labelScanner = new LabelScanner();
    String scannedLabel = labelScanner.scan(truck);

    //sortowanie kawy na podstawie etykiety z worka
    CoffeeSorter coffeeSorter = new CoffeeSorter();
    var sortedCoffee = coffeeSorter.sort(truck);

    //pakowanie kawy
    PackageManager packageManager = new PackageManager();
    List<PackagedCoffeeBag> packagedCoffeeBags = packageManager.packCoffee(sortedCoffee, scannedLabel);

    System.out.println(packagedCoffeeBags);

  }

}
