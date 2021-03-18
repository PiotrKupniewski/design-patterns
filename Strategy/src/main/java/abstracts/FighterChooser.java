import io.vavr.API;
import io.vavr.Tuple2;

public class FighterChooser {
    public Tuple2<Fighter,Fighter> choose() {
        return new API.Tuple(new Fighter("Kasza"), new Fighter("Wasza"));
    }
}
