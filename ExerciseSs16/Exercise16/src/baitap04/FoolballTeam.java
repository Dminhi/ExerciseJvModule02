package baitap04;

public class FoolballTeam implements Comparable<FoolballTeam> {
    @Override
    public int compareTo(FoolballTeam o) {
        return this.score-o.getScore();
    }

    int Id;
    String Name;
    int numberOfPlayer;
    int score;

    public FoolballTeam() {
    }

    @Override
    public String toString() {
        return "FoolballTeam[" +
                "Id : " + Id +
                ", Name : '" + Name + '\'' +
                ", NumberOfPlayer : " + numberOfPlayer +
                ", Score : " + score +
                ']';
    }

    public FoolballTeam(int id, String name, int numberOfPlayer, int score) {
        Id = id;
        Name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
