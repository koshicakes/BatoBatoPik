import java.util.Random;
import java.util.Scanner;

public class BatoBatoPik {

    private static final String[] MOVES = {"Bato", "Papel", "Gunting"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int wins = 0, losses = 0, draws = 0;

        System.out.println("=== Bato Bato Pik ===");

        while (true) {
            System.out.print("\n1) Bato  2) Papel  3) Gunting  0) Quit: ");
            String input = scanner.nextLine().trim();

            if (input.equals("0")) break;
            if (!input.equals("1") && !input.equals("2") && !input.equals("3")) {
                System.out.println("Please enter 0, 1, 2 or 3.");
                continue;
            }

            int player = Integer.parseInt(input) - 1;
            int computer = random.nextInt(3);

            System.out.println("Bato-bato-pik!");
            System.out.println("You: " + MOVES[player] + "  |  Computer: " + MOVES[computer]);

            if (player == computer) {
                System.out.println("Tabla! (Draw)");
                draws++;
            } else if ((player + 2) % 3 == computer) {
                System.out.println("Panalo ka! (You win)");
                wins++;
            } else {
                System.out.println("Talo ka! (You lose)");
                losses++;
            }
        }

        System.out.printf("%nFinal score - Wins: %d, Losses: %d, Draws: %d%n", wins, losses, draws);
        System.out.println("Salamat sa paglalaro!");
        scanner.close();
    }
}