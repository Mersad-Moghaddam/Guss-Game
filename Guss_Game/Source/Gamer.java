package MyProject.Guss_Game.Source;

public class Gamer {
    String name;
    int Gamer_Id;
    int Score;

    public Gamer(String name, int Gamer_Id ,int Score) {
        this.name = name;
        this.Score = Score;
        this.Gamer_Id = Gamer_Id;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGamer_Id() {
        return this.Gamer_Id;
    }

    public void setGamer_Id(int Gamer_Id) {
        this.Gamer_Id = Gamer_Id;
    }

    public int getScore() {
        return this.Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public void AddScore(int input_score) {
        Score+=input_score;
    }

    public void Print(){
        System.out.println("Name : " + this.name+"\tGamer ID : " + this.Gamer_Id+"\tScore : " + this.Score);
    }
}
