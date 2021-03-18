package abstracts;

import io.vavr.Tuple2;

import static io.vavr.API.*;

public class FighterChooser {

    public Tuple2<Fighter, Fighter> choose() {
        return Tuple(new Fighter("Anrjew", 1.0d, new BoxerPunch(), new BoxerKick()), new Fighter("Vandal", 1.0d, new BoxerPunch(), new BoxerKick()));
    }
}
