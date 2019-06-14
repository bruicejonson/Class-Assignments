package GameParts;
import java.io.File;
import java.util.Scanner;

import static GameParts.SoundEffects.PlaySound;

public class Players {
    private String playerName;
    private int total;
    private String emoji;
    private int roundBalance;

    public Players() {
    }

    public void setName(String n) {
        playerName = n;
    }
    public void setEmoji(String n){ emoji = n;}
    public String getEmoji(){return emoji;}
    public String getName() {
        return playerName;
    }

    public void newGame()//sets the total balance to zero
    {
        total = 0;
        roundBalance = 0;
    }

    public void addrBal(long rb) {
        roundBalance += rb;
    }
    public void removerBal(long rb){roundBalance -= rb;}

    public void addTBal(long tb) {
        total += tb;
    }

    public int getTBal() {
        return total;
    }

    public int getRBal() {
        return roundBalance;
    }

    public void bankrupt()
    {
        roundBalance = 0;
    }
    public static int getplayerNum() {
        System.out.println("- How many Players do we have today:");
        int number = GetAnInteger();
        File Click = new File("Sounds/Click.wav");
        PlaySound(Click);
        return number;
    }
    public static int GetAnInteger(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                int i = scanner.nextInt();
                if(i <= 0){
                  throw new NumberFormatException();
                }
                return i;
            }catch (NumberFormatException e){
                System.out.println("N.A.N. Please try again: ");
               scanner.nextLine();
            }
        }
    }
}

