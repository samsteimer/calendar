import java.util.Scanner;

public class ConsoleService {
     private final Scanner scanner = new Scanner(System.in);

     public int promptForMenuSelection() {
         int menuSelection;
         System.out.println("Choose an option: ");
         try {
             menuSelection = Integer.parseInt(scanner.nextLine());
         } catch (NumberFormatException e) {
             menuSelection = -1;
         }
         return menuSelection;
     }

     public void pause() {
         System.out.println("Press Enter to continue...");
         scanner.nextLine();
     }

     public void printMainMenu() {
         System.out.println();
         System.out.println("-----Calendar Main Menu-----");
         System.out.println("1: View All Today's Events");
         System.out.println("2: View All Week's Events");
         System.out.println("3: View Individual's Events");
         System.out.println("4: View Family Members");
         System.out.println("5: Add Event");
         System.out.println("6: Edit Event");
         System.out.println("7: Delete Event");
         System.out.println("0: Exit");
     }

     public void printEvents(Event[] events) {
         System.out.println("-----EVENTS-----");
         for (Event event: events) {
             System.out.println(event.getDate() + " " + event.getTime());
             System.out.println("---------------------------------------");
             System.out.println(event.getDescription());
             System.out.println("---------------------------------------");
         }
     }

     public void printEvent(Event event) {
         System.out.println(event.getDate() + " " + event.getTime());
         System.out.println("---------------------------------------");
         System.out.println(event.getDescription());
         System.out.println("---------------------------------------");
     }

     public void printFamilyMembers(FamilyMemeber[] familyMemebers) {
         for (FamilyMemeber familyMemeber : familyMemebers) {
             System.out.println(familyMemeber.toString());
         }
     }
}
