//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {

    private final ConsoleService consoleService = new ConsoleService();

    public static void main(String[] args) {
       App app = new App();
       app.run();
    }

    private void run() {
        int menuSelection = -1;

        while (menuSelection !=0) {
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection();
            if (menuSelection == 1) {
                handleViewAllTodaysEvents();
            } else if (menuSelection == 2) {
                handleViewAllWeeksEvents();
            } else if (menuSelection == 3) {
                handleViewIndividualsEvents();
            } else if (menuSelection == 4) {
                handleViewFamilyMembers();
            } else if (menuSelection == 5) {
                handleAddEvent();
            } else if (menuSelection == 6) {
                handleEditEvent();
            } else if (menuSelection == 7) {
                handleDeleteEvent();
            } else if (menuSelection != 0) {
                System.out.println("Invalid Selection");
            }
        }
    }

    private void handleViewAllTodaysEvents() {
    }

    private void handleViewAllWeeksEvents() {
    }

    private void handleViewIndividualsEvents() {
    }

    private void handleViewFamilyMembers() {
    }

    private void handleAddEvent() {
    }

    private void handleEditEvent() {
    }
    
    private void handleDeleteEvent() {
    }

}