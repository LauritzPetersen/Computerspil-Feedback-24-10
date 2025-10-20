import java.util.ArrayList;

public class GameSystem {

    private ArrayList<String> games = new ArrayList<>();
    private ArrayList<String> players = new ArrayList<>();
    private int gameCount;
    private int playerCount;

    public GameSystem(int gameCount, int playerCount){
        this.gameCount = gameCount;
        this.playerCount = playerCount;
    }

    public void addGame(String game){
        games.add(game);
    }

    public void addPlayer(String player){
        players.add(player);
    }

    public void displayAllGames(){
        System.out.println("Games currently stored in the system: ");
        for (String game : games){
            System.out.println(game);
        }
    }

    public void displayAllPlayers(){
        System.out.println("Players Currently stored in the system: ");
        for (String player : players){
            System.out.println(player);
        }
    }

    public void updatePlayerScore(int playerId, int newScore){
    }
}
