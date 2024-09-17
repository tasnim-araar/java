import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();
        zoo.zooName = getZooName(scanner);
        zoo.nbrCages = getNumberOfCages(scanner);
        System.out.println("\nLe zoo \"" + zoo.zooName + "\" comporte " + zoo.nbrCages + " cages.");
        scanner.close();
    }
    public static String getZooName(Scanner scanner) {
        String name;
        while (true) {
            System.out.print("Entrez le nom du zoo : ");
            name = scanner.nextLine().trim();
            if (!name.isEmpty()) {
                break;
            } else {
                System.out.println("Le nom du zoo ne peut pas être vide. Veuillez réessayer.");
            }
        }
        return name;
    }


    public static int getNumberOfCages(Scanner scanner) {
        int number = -1;
        while (number <= 0) {
            System.out.print("Entrez le nombre de cages (doit être un entier positif) : ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number <= 0) {
                    System.out.println("Le nombre de cages doit être un entier positif.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.");
            }
        }
        return number;
    }
}
