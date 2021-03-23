package abstracts;

public class BoxerPunch implements FighterSkillPunch {

    @Override
    public void punch(Fighter enemy) {
        enemy.energy = enemy.energy() - 0.2d;
    }
}
