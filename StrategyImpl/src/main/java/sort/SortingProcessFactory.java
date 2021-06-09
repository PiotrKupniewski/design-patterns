package sort;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SortingProcessFactory {

  public SortingProcess getSortingProcessBasedOnLabel(String scannedLabel){
    if(scannedLabel.equalsIgnoreCase("Brazilian")){
      return new BrazilianSortingProcess();
    }else{
      return new PolkawSortingProcess();
    }
  }
}
