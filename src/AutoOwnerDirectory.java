import java.util.Scanner;
import java.util.TreeMap;

public class AutoOwnerDirectory {
    TreeMap<String, String> treeMap = new TreeMap<String, String>();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("1. Add new car owner");
        System.out.println("2. Delete car owner");
        System.out.println("3. Rename car owner");
        System.out.println("4. Search car owner ");
        System.out.println("5. Output list of car owner");
    }

    public void addCarOwner() {
        System.out.println("Input car number (AA1234AA): ");
        String carNamber = scanner.nextLine();
        System.out.println("Input car owner (Name(space)Surname): ");
        String carOwner = scanner.nextLine();
        treeMap.put(carNamber, carOwner);
    }

    public void delete() {
        System.out.println("Input car number (AA1234AA): ");
        String carNamber = scanner.nextLine();
        treeMap.remove(carNamber);
    }

    public void rename() {
        System.out.println("Input car number (AA1234AA): ");
        String carNamber = scanner.nextLine();
        System.out.println("Input new Name(space)Surname: ");
        String carOwner = scanner.nextLine();
        treeMap.replace(carNamber, carOwner);
    }

    public void search() {
        System.out.println("Input car number (AA1234AA): ");
        String carNamber = scanner.nextLine();
        System.out.println(treeMap.get(carNamber));
    }

    public void output() {
        for (String key : treeMap.keySet()) {
            System.out.println(key + " - " + treeMap.get(key));
        }
    }
}
