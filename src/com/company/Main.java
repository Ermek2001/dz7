package Hero;

public class Magic extends Hero {

    public Magic (int herohealth, int heroDamage, String heroDefencetype) {
        super(herohealth, heroDamage, heroDefencetype);

    }

    @Override
    public void superAbilityType(){
        System.out.println("Магический герой использовал свою силу" + getheroDefencetype());
    }

    }

