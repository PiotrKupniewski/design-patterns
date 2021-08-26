import comparator.BestDealComparator;
import comparator.ProductComparator;
import identifier.DBProductIdentifier;
import identifier.ProductIdentififer;
import parser.JsonProductParser;
import parser.ProductReportParser;

public class Simulation {
  public static void main(String[] args) {

/*
   Mamy dwa źródła informacji:
    - bazę danych sklepów i ich produktów
    - wynik raportu średnich cenych na rynku dla konkretnych produktów
   Chcemy napisać aplikację wyszukującą okazji.
   Jak rozpocząłbyś, nie znając technicznych szczegółów źródeł danych, ani definicji "okazji", napisanie takiej aplikacji aby zasymulować jej działanie i pokazać,
   że jest ona gotowa na różne potrzeby i technologie utzymującej dane o sklepach i raportach cen.
   Powiedzmy, że dla pierwszej prezentacji jeżeli produkt jest w sklepie to jest on "okazją".*/

    //pobierz raport produktóœ i cen
    //wyszukaj produktu w bazie danych
    //poróznwaj cenę

    String report = "{Papier-Toaletowy:2.25},{Szkło kontaktowe:1.64}";

    ProductReportParser parser = new JsonProductParser(report);
    ProductIdentififer identifier = new DBProductIdentifier();
    ProductComparator comparator = new BestDealComparator();


    DealFinder dealFinder = new DealFinder(parser, identifier, comparator);
    var bestDeals = dealFinder.findGoodPrices();

    bestDeals.stream()
        .forEach(System.out::println);
  }
}
