import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Comparator.comparingInt;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hero> heroes = new ArrayList<Hero>();
        ArrayList<Enemy> vague1 = new ArrayList<Enemy>();
        ArrayList<Enemy> vague2 = new ArrayList<Enemy>();
        ArrayList<Enemy> vague3 = new ArrayList<Enemy>();
        ArrayList<Enemy> vague4 = new ArrayList<Enemy>();
        ArrayList<Enemy> vague5 = new ArrayList<Enemy>();
        System.out.println("Bonjour, bienvenue dans le rpg, de personnage voulez-vous?(entre 1 et 4)");
        int arrete = 0;
        int nbp = scanner.nextInt();

        while ((nbp < 1) || nbp > 4){

            arrete ++;
            switch (arrete){
                case 1:
                    System.out.println("Entre 1 et 4");
                    nbp = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("ENTRE 1 ET 4");
                    nbp = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Juste entre 1 et 4 c'est pas dure pourtant");
                    nbp = scanner.nextInt();
                    break;
                default:
                    System.out.println("Les maternelles on de la concurence");
                    nbp = scanner.nextInt();
                    break;
            }
        }

        switch (nbp){
            case 1:
                vague1.add(new Enemy(150,45,215,5,"Slime"));
                vague2.add(new Enemy(150,45,215,100,"Skelete"));
                vague3.add(new Enemy(150,45,215,100,"Troll"));
                vague4.add(new Enemy(150,45,215,100,"Fée sous poudre magique"));
                vague5.add(new Enemy(150,45,215,100,"Dragon"));
                System.out.println("Donnez un nom a votre Warrior");
                heroes.add(new Warrior(150,45,215,35,scanner.next()));
                ArrayList<Combatant> ordrecb = new ArrayList<Combatant>();
                ordrecb.addAll(vague1);
                ordrecb.addAll(heroes);
                for (int i = 0; i<=1 ; i++){
                    int ordrecb.get(i).setSpeed() = (int) (Math.random() * 100);
                }
                ordrecb.sort(comparingInt(Combatant::getSpeed));
                while (heroes.get(0).getLife() <= 0 || vague1.get(0).getLife() <= 0 ){
                    for (int i = 0; i<=1 ; i++){
                        if(ordrecb.get(i).getSpeed() == 35){
                            System.out.println("que voulez-vous faire?(entree le chiffre pour effectuer l'action) 1: Attaquer ; 2:Defendre ; 3 prendre un Objet");
                            int Action = scanner.nextInt();
                            switch (Action){
                                case 1:
                                    System.out.println("gros coup dans le chicots");
                                    heroes.get(0).attaque(vague1.get(0));
                                    break;
                                case 2:
                                    System.out.println("vous serrez les dents et vous preparer a endurer le choc");
                                    break;
                                case 3:
                                    System.out.println("t'es un warrior tu n'as pas d'items, tu perd un tour");
                                    break;
                                default:
                                    System.out.println("entre 1 et 3... c'est pas dure pourtant, pour la peine tu perds un tour");
                                    break;
                        }
                            if (Action == 3)

                                heroes.get(0).attaque(vague1.get(0)); //pas implementer les reductions de dommages si on defend.;
                    }


                    }

                }
                break;
            case 2:
                vague1.add(new Enemy(150,45,215,100,"Slime"));
                vague1.add(new Enemy(150,45,215,100,"Mouton enragé"));
                vague2.add(new Enemy(150,45,215,100,"Skelete"));
                vague2.add(new Enemy(150,45,215,100,"feu follet"));
                vague3.add(new Enemy(150,45,215,100,"Troll"));
                vague3.add(new Enemy(150,45,215,100,"Orc"));
                vague4.add(new Enemy(150,45,215,100,"Fée sous poudre magique"));
                vague4.add(new Enemy(150,45,215,100,"Elf Corompue"));
                vague5.add(new Enemy(150,45,215,100,"Dragon Blanc au yeux bleus"));
                System.out.println("Donnez un nom a votre Warrior");
                heroes.add(new Warrior(160,45,215,100,scanner.next()));
                System.out.println("Donnez un nom a votre Mage");
                heroes.add(new Mage(123,154,79,45,100,scanner.next()));
                break;
            case 3:
                vague1.add(new Enemy(150,45,215,100,"Slime"));
                vague1.add(new Enemy(150,45,215,100,"Mouton enragé"));
                vague1.add(new Enemy(150,45,215,100,"Mouton enragé"));
                vague2.add(new Enemy(150,45,215,100,"Skelete"));
                vague2.add(new Enemy(150,45,215,100,"Skelete"));
                vague2.add(new Enemy(150,45,215,100,"feu follet"));
                vague3.add(new Enemy(150,45,215,100,"Troll"));
                vague3.add(new Enemy(150,45,215,100,"Troll"));
                vague3.add(new Enemy(150,45,215,100,"Orc"));
                vague4.add(new Enemy(150,45,215,100,"Fée sous poudre magique"));
                vague4.add(new Enemy(150,45,215,100,"Fée sous poudre magique"));
                vague4.add(new Enemy(150,45,215,100,"Elf Corompue"));
                vague5.add(new Enemy(150,45,215,100,"Dragon Noir aux Yeux Rouges"));
                System.out.println("Donnez un nom a votre Warrior");
                heroes.add(new Warrior(150,45,215,100,scanner.next()));
                System.out.println("Donnez un nom a votre Mage");
                heroes.add(new Mage(123,154,79,45,100,scanner.next()));
                System.out.println("Donnez un nom a votre Hunter");
                heroes.add(new Hunter(123,154,79,100, scanner.next()));
                break;
            case 4:
                vague1.add(new Enemy(150,45,215,100,"Slime"));
                vague1.add(new Enemy(150,45,215,100,"Mouton enragé"));
                vague1.add(new Enemy(150,45,215,100,"Mouton enragé"));
                vague1.add(new Enemy(150,45,215,100,"Mouton enragé"));
                vague2.add(new Enemy(150,45,215,100,"Skelete"));
                vague2.add(new Enemy(150,45,215,100,"feu follet"));
                vague2.add(new Enemy(150,45,215,100,"feu follet"));
                vague2.add(new Enemy(150,45,215,100,"feu follet"));
                vague3.add(new Enemy(150,45,215,100,"Troll"));
                vague3.add(new Enemy(150,45,215,100,"Troll"));
                vague3.add(new Enemy(150,45,215,100,"Orc"));
                vague3.add(new Enemy(150,45,215,100,"Orc"));
                vague4.add(new Enemy(150,45,215,100,"Fée sous poudre magique"));
                vague4.add(new Enemy(150,45,215,100,"Fée sous poudre magique"));
                vague4.add(new Enemy(150,45,215,100,"Fée sous poudre magique"));
                vague4.add(new Enemy(150,45,215,100,"Elf Corompue"));
                vague5.add(new Enemy(150,45,215,100,"Dieu Demon de la mort qui tue"));
                System.out.println("Donnez un nom a votre Warrior");
                heroes.add(new Warrior(150,45,215,100,scanner.next()));
                System.out.println("Donnez un nom a votre Mage");
                heroes.add(new Mage(123,154,79,45,100,scanner.next()));
                System.out.println("Donnez un nom a votre Hunter");
                heroes.add(new Hunter(123,154,79,99, scanner.next()));
                System.out.println("Donnez un nom a votre Healer");
                heroes.add(new Healer(45,45,45,45,100, scanner.next()));
                break;
            default:
                System.out.println(heroes.get(0).getAttaque());
                break;



        }
    }
}
