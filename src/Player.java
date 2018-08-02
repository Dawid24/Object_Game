public class Player {
    private String name;
    private String username;
    private int points;

    public Player(String name, String username) {
        this.name = name;
        this.username = username;
        this.points = 0;
    }

    public Player() {
        this.name = null;
        this.username = null;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", points=" + points +
                '}';
    }
}
