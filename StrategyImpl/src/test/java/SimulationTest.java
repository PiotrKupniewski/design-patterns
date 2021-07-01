import org.junit.jupiter.api.Test;
import pack.PackageProcess;
import pack.PackageProcessFactory;
import pack.PackagedCoffeeBag;
import scan.CoffeeBag;
import scan.Label;
import scan.LabelScanner;
import scan.Truck;
import sort.SortingProcessFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SimulationTest {

  @Test
  public void polkawTest(){

    //given
    List<CoffeeBag> polkawBags = List.of(
        new CoffeeBag(new Label("B1")),
        new CoffeeBag(new Label("")),
        new CoffeeBag(new Label("452")),
        new CoffeeBag(new Label("555")),
        new CoffeeBag(new Label("2")),
        new CoffeeBag(new Label("1"))
    );

    Label polkawLabel = new Label("Polkaw");

    //when
    List<PackagedCoffeeBag> packagedCoffeeBags = runProcess(polkawBags, polkawLabel);

    //excpected
    PackagedCoffeeBag wyborna2kg = new PackagedCoffeeBag(CoffeeBag.CoffeeQuality.WYBORNA, 2.0);
    PackagedCoffeeBag dobra1kg = new PackagedCoffeeBag(CoffeeBag.CoffeeQuality.DOBRA, 1.0);
    PackagedCoffeeBag swietna1kg = new PackagedCoffeeBag(CoffeeBag.CoffeeQuality.ŚWIETNA, 1.0);

    //then
    assertEquals(wyborna2kg, packagedCoffeeBags.get(5));
    assertEquals(swietna1kg, packagedCoffeeBags.get(3));
    assertEquals(dobra1kg, packagedCoffeeBags.get(2));
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

    //excpected
    PackagedCoffeeBag wyborna2kg = new PackagedCoffeeBag(CoffeeBag.CoffeeQuality.WYBORNA, 2.0);
    PackagedCoffeeBag dobra1kg = new PackagedCoffeeBag(CoffeeBag.CoffeeQuality.DOBRA, 1.0);
    PackagedCoffeeBag swietna1kg = new PackagedCoffeeBag(CoffeeBag.CoffeeQuality.ŚWIETNA, 1.0);

    //then
    assertEquals(wyborna2kg, packagedCoffeeBags.get(5));
    assertEquals(swietna1kg, packagedCoffeeBags.get(3));
    assertEquals(dobra1kg, packagedCoffeeBags.get(2));

  }

  private List<PackagedCoffeeBag> runProcess(List<CoffeeBag> bags, Label label) {
    Truck truck = new Truck(label, bags);
    LabelScanner labelScanner = new LabelScanner();
    String scannedLabel = labelScanner.scan(truck);

    ProductionLine productionLine = new ProductionLine(scannedLabel);
    return productionLine.produceBags(truck.getBags());
  }

}
