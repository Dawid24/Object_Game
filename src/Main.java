
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź nazwę gry: ");
        String name = sc.nextLine();

        System.out.print("Podaj max liczbę graczy: ");
        int number = sc.nextInt();

        System.out.print("1 - Dodaj gracza, " +
                "^D - zakończ wprowadzanie: ");

        Game game = new Game(name, number);
        while (sc.hasNext()) {

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 1:
                    System.out.print("[Name]: ");
                    String namePlayer = sc.nextLine();
                    System.out.print("[Username]: ");
                    String usernamePlayer = sc.nextLine();
                    Player player = new Player(namePlayer, usernamePlayer);
                    addPlayerToGame(player, game);
                    break;
            }
        }

        for (int i = 0; i <= PlayerUtil.lastAddedPosition; i++) {
            game.play(game.getPlayer(i));
        }

        for (int i = 0; i <= PlayerUtil.lastAddedPosition; i++) {
            System.out.println("Gracz: " + game.getPlayer(i).getName() + " "
                    + game.getPlayer(i).getUsername() + ": " + game.getPlayer(i).getPoints() + " points");
        }

    }

    public static void addPlayerToGame(Player player, Game game) {
        if (PlayerUtil.lastAddedPosition == null) {
            PlayerUtil.lastAddedPosition = 0;
        } else {
            PlayerUtil.lastAddedPosition = PlayerUtil.lastAddedPosition + 1;
        }
        game.add(player,PlayerUtil.lastAddedPosition);
    }
}
