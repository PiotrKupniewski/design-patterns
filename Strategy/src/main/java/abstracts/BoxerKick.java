package abstracts;

public class BoxerKick implements FighterSkillKick {
    @Override
    public void kick(Fighter enemy) {
        enemy.energy = enemy.energy - 0.4d;
    }
}
