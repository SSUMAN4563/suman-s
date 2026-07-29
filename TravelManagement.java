import java.util.ArrayList; 
import java.util.Scanner;

public class TravelManagement {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=======MENU========="); // Fixed typo: Systyem -> System
            System.out.println("1.Add city\n2.Insert city\n3.Search city\n4.Display city\n5.Exit");
            System.out.print("Enter the choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("City to add: ");
                    String cityToAdd = s.next();
                    cities.add(cityToAdd);
                    System.out.println("City was added.");
                    break;

                case 2:
                    System.out.print("Enter index position to insert: ");
                    int index = s.nextInt();
                    if (index >= 0 && index <= cities.size()) {
                        System.out.print("City to insert: ");
                        String cityToInsert = s.next();
                        cities.add(index, cityToInsert);
                        System.out.println("City was inserted.");
                    } else {
                        System.out.println("Invalid index! Active range is 0 to " + cities.size());
                    }
                    break;

                case 3:
                    System.out.print("City to search for: ");
                    String cityToSearch = s.next();
                    if (cities.contains(cityToSearch)) {
                        int pos = cities.indexOf(cityToSearch);
                        System.out.println(cityToSearch + " found at index " + pos);
                    } else {
                        System.out.println("City not found in the list.");
                    }
                    break;

                case 4:
                    if (cities.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("--- Cities List ---");
                        for (int i = 0; i < cities.size(); i++) {
                            System.out.println(i + ". " + cities.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid option! Please enter a choice between 1 and 5.");
                    break;
            }
        } while (choice != 5);

        s.close();
    }
}
