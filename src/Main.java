import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        AutoOwnerDirectory auto = new AutoOwnerDirectory();
        auto.treeMap.put("AA0021IA", "Serega SupaDupa");
        auto.treeMap.put("AA0012IA", "Serega King");
        auto.treeMap.put("AA0003IA", "Serega Kingman");
        auto.treeMap.put("AA0004IA", "Serega Opapa");
        auto.treeMap.put("AA0009IA", "Serega Kryt");
        auto.treeMap.put("AA0011IA", "Serega Napadenie");

        while (true) {
            auto.menu();
            int choice = scanner.nextInt();
            if (choice <= 0 || choice > 5) break;
            switch (choice) {
                case 1: {
                    auto.addCarOwner();
                    break;
                }
                case 2: {
                    auto.delete();
                    break;
                }
                case 3: {
                    auto.rename();
                    break;
                }
                case 4: {
                    auto.search();
                    break;
                }
                case 5: {
                    auto.output();
                    break;
                }
            }
        }


    }
}
