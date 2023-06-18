import java.util.Scanner;

public class TextAdventureGame {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean gameRunning = true;
    private static boolean gameStarted = false;
    
    // Player information
    private static String playerName;
    private static int playerHealth;
    
    public static void main(String[] args) {
        startGame();
    }
    
    private static void startGame() {
        while (gameRunning) {
            if (!gameStarted) {
                displayMainMenu();
                int choice = getUserChoice(1, 3);
                handleMainMenuChoice(choice);
            } else {
                playGame();
            }
        }
        System.out.println("Thanks for playing!");
    }
    
    private static void displayMainMenu() {
        System.out.println("=== Text Adventure Game ===");
        System.out.println("1. Start New Game");
        System.out.println("2. Load Game");
        System.out.println("3. Exit");
    }
    
    private static void displayGameMenu() {
        System.out.println("=== Game Menu ===");
        System.out.println("1. Explore");
        System.out.println("2. Inventory");
        System.out.println("3. Save Game");
        System.out.println("4. Quit Game");
    }
    
    private static int getUserChoice(int min, int max) {
        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
        } while (choice < min || choice > max);
        return choice;
    }
    
    private static void handleMainMenuChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Starting new game...");
                initializePlayer();
                gameStarted = true;
                break;
            case 2:
                System.out.println("Loading game...");
                // TODO: Load game logic
                break;
            case 3:
                gameRunning = false;
                break;
        }
    }
    
    private static void initializePlayer() {
        System.out.print("Enter your name: ");
        playerName = scanner.next();
        playerHealth = 100;
        System.out.println("Welcome, " + playerName + "! Let the adventure begin.");
    }
    
    private static void playGame() {
        while (gameStarted) {
            displayGameMenu();
            int choice = getUserChoice(1, 4);
            handleGameMenuChoice(choice);
        }
    }
    
    private static void handleGameMenuChoice(int choice) {
        switch (choice) {
            case 1:
                explore();
                break;
            case 2:
                displayInventory();
                break;
            case 3:
                System.out.println("Saving game...");
                // TODO: Save game logic
                break;
            case 4:
                System.out.println("Quitting game...");
                gameStarted = false;
                break;
        }
    }
    
    private static void explore() {
        System.out.println("You are exploring a new location.");
        // TODO: Implement exploration logic, encounters, choices, etc.
    }
    
    private static void displayInventory() {
        System.out.println("=== Inventory ===");
        // TODO: Display player inventory and items
    }
}
