public class Player {
    private int playerId;
    private String playerName;
    private int age;
    private double score;


    public Player(int playerId, String playerName, int age, double score) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.age = age;
        this.score = score;
    }

    public int getPlayerId(){
        return playerId;
    }
    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }

    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public double getScore(){
        return score;
    }
    public void setScore(double score){
        this.score = score;
    }

    public void displayDetails(){
        System.out.println("player ID: " + playerId);
        System.out.println("player Name: " + playerName);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
    }

    public void updateScore(double score){
        this.score = score;
    }

}