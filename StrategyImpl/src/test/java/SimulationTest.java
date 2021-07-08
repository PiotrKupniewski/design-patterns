import org.junit.jupiter.api.Test;
import pack.PackagedCoffeeBag;
import scan.CoffeeBag;
import scan.Label;
import scan.LabelScanner;
import scan.Truck;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SimulationTest {

  @Test
  public void polkawTest(){

    //given
    List<CoffeeBag> polkawBags = List.of(
        new CoffeeBag(new Label("B1")),
//        new CoffeeBag(new Label("")),
        new CoffeeBag(new Label("452")),
        new CoffeeBag(new Label("555")),
        new CoffeeBag(new Label("2")),
        new CoffeeBag(new Label("1"))
    );

    Label polkawLabel = new Label("Polkaw");

    //when
    List<PackagedCoffeeBag> packagedCoffeeBags = runProcess(polkawBags, polkawLabel);

    final var dobraCount = countBagsBasedOnQuality(CoffeeBag.CoffeeQuality.DOBRA, packagedCoffeeBags);
    final var świetnaCount = countBagsBasedOnQuality(CoffeeBag.CoffeeQuality.ŚWIETNA, packagedCoffeeBags);

    assertEquals(2, dobraCount);
    assertEquals(3, świetnaCount);
  }


  @Test
  public void simulationBrazilianTest(){

    //given
    List<CoffeeBag> bags = List.of(new CoffeeBag(new Label("B1")),
        new CoffeeBag(new Label("")),
        new CoffeeBag(new Label("A452")),
        new CoffeeBag(new Label("A555")),
        new CoffeeBag(new Label("B2")),
        new CoffeeBag(new Label("C1")),
        new CoffeeBag(new Label("C1232"))
    );

    Label brazilianaLabel = new Label("Brazilian");

    //when
    List<PackagedCoffeeBag> packagedCoffeeBags = runProcess(bags, brazilianaLabel);

    final var dobraCount = countBagsBasedOnQuality(CoffeeBag.CoffeeQuality.DOBRA, packagedCoffeeBags);
    final var wybornaCount = countBagsBasedOnQuality(CoffeeBag.CoffeeQuality.WYBORNA, packagedCoffeeBags);
    final var świetnaCount = countBagsBasedOnQuality(CoffeeBag.CoffeeQuality.ŚWIETNA, packagedCoffeeBags);

    assertEquals(2, dobraCount);
    assertEquals(2, wybornaCount);
    assertEquals(2, świetnaCount);

    //then
  }

  private long countBagsBasedOnQuality(CoffeeBag.CoffeeQuality quality, List<PackagedCoffeeBag> packagedCoffeeBags) {
   return packagedCoffeeBags.stream()
        .filter(x -> x.getQuality() == quality)
        .count();
  }

  private List<PackagedCoffeeBag> runProcess(List<CoffeeBag> bags, Label label) {
    Truck truck = new Truck(label, bags);
    LabelScanner labelScanner = new LabelScanner();
    String scannedLabel = labelScanner.scan(truck);

    ProductionLine productionLine = new ProductionLine(scannedLabel);
    return productionLine.produceBags(truck.getBags());
  }

}
