package pack;


import lombok.Getter;
import scan.LabelScanner;


public class PackageProcessFactory {

  @Getter
  PackageProcess packageProcess;

  public PackageProcessFactory(String scannedLabel){
    if(scannedLabel.equalsIgnoreCase("brazilian")){
        this.packageProcess = new BrazilianPackageProcess();
    }else if(scannedLabel.equalsIgnoreCase("polkaw")) {
      this.packageProcess = new PolkawPackageProcess();
    }else{
      throw new UnsupportedOperationException();
    }

  }

}
