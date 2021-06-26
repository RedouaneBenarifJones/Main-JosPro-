import java.util.*;

public class Josephus {

    public static void main(String[] args) {

        // creation du cercle des soldats
        ArrayList<Soldier> soldiersCircle = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // collecter les donnees de chez l'utilisateur
        System.out.println("donner le nombre de soldats!");
        int soldiersNumber = scanner.nextInt();
        System.out.println("");
        String soldierFirstName, soldierLastName;

        // population de la ArrayList soldierCircle
        int counter = 0;
        while (counter < soldiersNumber) {
            System.out.println("donner le prenom du soldat!");
            soldierFirstName = scanner.next();
            System.out.println("donner le nom du soldat");
            soldierLastName = scanner.next();
            System.out.println("");
            soldiersCircle.add(new Soldier(counter + 1, soldierFirstName, soldierLastName));
            counter++;
        }

        // reccuperer le pas
        System.out.println("donner le pas!");
        int step = scanner.nextInt();
        System.out.println("");

        // tuons des soldats maintenant hahahahahaha!
        step--;
        josephus(soldiersCircle, 0, step);

    }

    static void josephus(ArrayList<Soldier> soldiers, int index, int step)
    {
        // cas ou un seul soldat est restant
        if (soldiers.size() == 1) {
            System.out.println("Je suis Josephus le survivant ;D et mon nom complet est " + soldiers.get(soldiers.size() - 1).getFullName());
            return;
        }

        // l'index du soldat qui va mourir
        index = ((index + step) % soldiers.size());

        // elimination du soldat qui doit mourir
        System.out.println("Soldat : " + soldiers.get(index).getFullName());
        System.out.println("tue a la position " + soldiers.get(index).getPosition());
        System.out.println("");
        soldiers.remove(index);

        // appel recursif pour n-1 soldats
        josephus(soldiers, index, step);
    }
}
