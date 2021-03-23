import abstracts.Fighter;
import abstracts.FighterChooser;
import io.vavr.Tuple2;

import java.util.Scanner;
public class Fight {

    public static void main(String[] args) {
        FighterChooser fightersFactory = new FighterChooser();
        Tuple2<Fighter, Fighter> fighters = fightersFactory.choose();
        Fighter winner;
        introduceFighters(fighters);
        while(true) {
            interpretUserInput(fighters);
            printFightersStats(fighters._1, fighters._2);
            if (fighters._1.energy() <= 0) {
                winner = fighters._2;
                break;
            } else if (fighters._2.energy() <= 0) {
                winner = fighters._1;
                break;
            }
        }
        printWinner(winner);
    }
    private static void introduceFighters(Tuple2<Fighter, Fighter> fighterTable) {
        System.out.printf("%nLaddies and Gentelment!!! In the red corener %s, in the blue corner %s%n" +
                        "Press \"r\" for red player punch, Press \"b\" for blue player punch%n",
                fighterTable._1.name(), fighterTable._2.name());
    }
    private static void interpretUserInput(Tuple2<Fighter, Fighter> fighterTable) {
        Scanner inputReader = new Scanner(System.in);
        String userInput = inputReader.next();
        if(userInput.equals("r")) {
            String userInput2 = inputReader.next();
            if(userInput2.equals("k")) {
                fighterTable._1.kick(fighterTable._2);
            } else if (userInput2.equals("p")){
                fighterTable._1.punch(fighterTable._2);
            }
        } else if (userInput.equals("b")) {
            String userInput2 = inputReader.next();
            if(userInput2.equals("k")) {
                fighterTable._2.kick(fighterTable._1);
            } else if (userInput2.equals("p")){
                fighterTable._2.punch(fighterTable._1);
            }
        } else {
            System.out.println("Boring! Buuuuuu!");
        }
    }
    private static void printWinner(Fighter winner) {
        System.out.printf("%nAnd the winner is %s", winner.name());
    }
    private static void printFightersStats(Fighter red, Fighter blue) {
        System.out.printf("%nRed fighter: %s%nBlueFighter: %s%n",
                red.energy(), blue.energy());
    }
}