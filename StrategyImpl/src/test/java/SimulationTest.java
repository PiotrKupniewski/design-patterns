import org.junit.jupiter.api.Test;
import pack.BrazilianPackageProcess;
import pack.PackageManager;
import pack.PackagedCoffeeBag;
import scan.CoffeeBag;
import scan.Label;
import scan.LabelScanner;
import scan.Truck;
import sort.CoffeeSorter;
import sort.SortingProcessFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SimulationTest {

  @Test
  public void simulationTest(){

    List<CoffeeBag> bags = List.of(new CoffeeBag(new Label("B1")),
        new CoffeeBag(new Label("")),
        new CoffeeBag(new Label("A452")),
        new CoffeeBag(new Label("A555")),
        new CoffeeBag(new Label("B2")),
        new CoffeeBag(new Label("C1")),
        new CoffeeBag(new Label("C1232")));

    Label polkawLabel = new Label("Polkaw");
    Label brazilianaLabel = new Label("Brazilian");
    Truck truck = new Truck(brazilianaLabel,bags);


    // read truck label
    LabelScanner labelScanner = new LabelScanner();
    String scannedLabel = labelScanner.scan(truck);

    assertNotNull(scannedLabel);
    assertEquals("Brazilian", scannedLabel);

    //sort coffee based on labels
    var sortingProcessFactory = new SortingProcessFactory();

    CoffeeSorter coffeeSorter = new CoffeeSorter(sortingProcessFactory.getSortingProcessBasedOnLabel(scannedLabel));
    var sortedCoffee = coffeeSorter.getSortingProcess().sort(truck);

    assertEquals(6, sortedCoffee.size());
    assertEquals(CoffeeBag.CoffeeQuality.DOBRA, sortedCoffee.get(1).getQuality());
    assertEquals(CoffeeBag.CoffeeQuality.DOBRA, sortedCoffee.get(2).getQuality());
    assertEquals(CoffeeBag.CoffeeQuality.ŚWIETNA, sortedCoffee.get(3).getQuality());
    assertEquals(CoffeeBag.CoffeeQuality.WYBORNA, sortedCoffee.get(4).getQuality());

    //pack coffee
    PackageManager packageManager = new PackageManager(new BrazilianPackageProcess());
    List<PackagedCoffeeBag> packagedCoffeeBags = packageManager.getPackageProcess().packCoffee(sortedCoffee);

    PackagedCoffeeBag wyborna2kg = new PackagedCoffeeBag(CoffeeBag.CoffeeQuality.WYBORNA, 2.0);
    PackagedCoffeeBag dobra1kg = new PackagedCoffeeBag(CoffeeBag.CoffeeQuality.DOBRA, 1.0);
    PackagedCoffeeBag swietna1kg = new PackagedCoffeeBag(CoffeeBag.CoffeeQuality.ŚWIETNA, 1.0);

    assertNotNull(packagedCoffeeBags);
    assertEquals(wyborna2kg, packagedCoffeeBags.get(5));
    assertEquals(swietna1kg, packagedCoffeeBags.get(3));
    assertEquals(dobra1kg, packagedCoffeeBags.get(2));


  }

}
