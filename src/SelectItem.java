import java.util.Scanner;

public class SelectItem {


    Scanner scanner = new Scanner(System.in);

    while(true) {
        System.out.println("Menu:");
        System.out.println("1. Add Item");
        System.out.println("Show catalog");
        int selectedChoice = scanner.nextInt();
        scanner.nextLine();

        if (selectedChoice == 1) {
            System.out.println("något något");
        }

        }
}
