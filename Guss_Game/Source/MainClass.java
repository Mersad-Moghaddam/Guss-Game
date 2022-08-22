package MyProject.Guss_Game.Source;
import java.util.Scanner;
import java.util.Random;
public class MainClass {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        try (Scanner reader = new Scanner(System.in)) {
            Random random = new Random();
            System.out.print("Enter First Player Name : ");
            String Player1_Name=reader.next();
            System.out.print("Enter ID : ");
            int Player1_ID=reader.nextInt();
            System.out.print("Enter Second Player Name : ");
            String Player2_Name=reader.next();
            System.out.print("Enter ID : ");
            int Player2_ID=reader.nextInt();
            Gamer player1 =new Gamer(Player1_Name,Player1_ID,0);
            Gamer player2 =new Gamer(Player2_Name,Player2_ID,0);
            System.out.print("\033[H\033[2J"); 
            int key=1;
            while(key!=0){
                for(int i=0;i<5;i++){
                    int number_game=random.nextInt(1,10);
                    System.out.print("Guss Player 1 : ");
                    int guss1=reader.nextInt();
                    System.out.print("Guss Player 2 : ");
                    int guss2=reader.nextInt();
                    if(number_game==guss1 && number_game==guss2){
                        player1.AddScore(1);
                        player2.AddScore(1);
                        System.out.println("Equal");
                    }else if(number_game==guss1){
                        player1.AddScore(1);
                        System.out.println("Player 1 Guss Right");
                    }else if(number_game==guss2){
                        player2.AddScore(1);
                        System.out.println("Player2 Guss Right");
                    }
                    System.out.println("Number You've Guss = "+number_game);
                }
                System.out.println("Press Enter 1 To Continue ... ");
                int wait=reader.nextInt();
                System.out.print("\033[H\033[2J"); 
                player1.Print();
                player2.Print();
                if(player1.getScore()>player2.getScore()){
                    System.out.println("Player 1 :"+player1.getName()+" Is Winner !!!");
                }else if(player1.getScore()<player2.getScore()){
                    System.out.println("Player 2 :"+player2.getName()+" Is Winner !!!");
                }
                else{System.out.println("Equal");}
                System.out.println("Press Enter 1 To Continue ... ");
                wait=reader.nextInt();
                System.out.print("\033[H\033[2J");
                System.out.print("Enter 0 to Exit / 1 to continue : ");
                key=reader.nextInt();
                player1.setScore(0);
                player2.setScore(0);
                System.out.println(wait);
                System.out.print("\033[H\033[2J");
            }
        }
    }
}
