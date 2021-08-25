import pack.BrazilianPackageProcess;
import pack.PackageProcess;
import pack.PackagedCoffeeBag;
import pack.PolkawPackageProcess;
import scan.CoffeeBag;
import sort.BrazilianSortingProcess;
import sort.PolkawSortingProcess;
import sort.SortingProcess;

import java.util.List;

public class ProductionLine {

  private SortingProcess sortingProcess;
  private PackageProcess packageProcess;

  public ProductionLine(String scannedLabel) {
    if(scannedLabel.equalsIgnoreCase("brazilian")){
      this.packageProcess = new BrazilianPackageProcess();
      this.sortingProcess = new BrazilianSortingProcess();
    }else if(scannedLabel.equalsIgnoreCase("polkaw")){
      this.packageProcess = new PolkawPackageProcess();
      this.sortingProcess = new PolkawSortingProcess();
    }else{
      throw new UnsupportedOperationException();
    }
  }

  public List<PackagedCoffeeBag> produceBags(List<CoffeeBag> bags) {
    var sortedBags = sortingProcess.sort(bags);
    var packagedCoffeeBags = packageProcess.packCoffee(sortedBags);
    return packagedCoffeeBags;
  }
}
