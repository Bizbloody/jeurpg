abstract class SpellCaster extends Hero {
    static int magie;
    public SpellCaster(int attaque, int defense,int life,int speed, int magie, String name){
        super(attaque,defense,life,speed,name);
        SpellCaster.magie = magie;
    }
}
