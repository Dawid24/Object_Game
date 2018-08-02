import java.util.Arrays;
import java.util.Random;

public class Game {
    private String name;
    private Player[] players;

    public Game(String name, Player[] players) {
        this.name = name;
        this.players = new Player[GameUtil.size];
    }

    public Game(String name, int z) {
        this.name = name;
        this.players = new Player[z];
    }

    public String getName() {
        return name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Player getPlayer(int index) {
        return players[index];
    }

    public void add(Player player, int index) {
        this.players[index] = player;
    }

    public void play(Player player) {
        int result = 0;
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            result += random.nextInt(45);
        }
        player.setPoints(result);
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", players=" + Arrays.toString(players) +
                '}';
    }


}
