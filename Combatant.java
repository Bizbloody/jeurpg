abstract class Combatant{
     private int attaque;
     private int defense;
     private int life;
     private int speed;
     String name;

    protected Combatant(int attaque, int defense,int life,int speed, String name) {
        this.attaque = attaque;
        this.defense = defense;
        this.name = name;
        this.life = life;
        this.speed = speed;
    }

     public int getSpeed() {
         return speed;
     }

     public void setSpeed(int speed) {
         this.speed = speed;
     }

     public int getLife(){
         return life;
     }
     public void setLife(int life){
         this.life = life;

     }
     public int getAttaque(){
         return attaque;
     }

     public  int getDefense() {
         return defense;
     }

     public String getName(){
        return name;
     }


     public void attaque(Combatant target) {

         int damage = this.getAttaque() - target.getDefense();
         if (damage >= 0){
             target.setLife(target.getLife() - damage);
         }

     }
     public static void mort(Combatant mort){
         if (mort.getLife() == 0){
             System.out.println(mort);
         }
     }
}