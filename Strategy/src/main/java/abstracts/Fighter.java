package abstracts;

public class Fighter {

    private String name;
    protected double energy;
    private FighterSkillPunch fighterPunch;
    private FighterSkillKick fighterKick;

    public Fighter(String name, double energy, FighterSkillPunch punch, FighterSkillKick kick) {
        this.name = name;
        this.energy = energy;
        this.fighterPunch = punch;
        this.fighterKick = kick;
    }

    public double energy() {
        return energy;
    }

    public String name() {
        return name;
    }

    public void kick(Fighter enemy) {
        fighterKick.kick(enemy);
    }

    public void punch(Fighter enemy) {
        fighterPunch.punch(enemy);
    }
}
