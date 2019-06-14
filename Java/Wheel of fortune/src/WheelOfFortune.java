import GameParts.GameBoard;
import java.io.*;
import static GameParts.SoundEffects.PlaySoundTheme;

public class WheelOfFortune {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("**********************************");
        Thread.sleep(500);
        System.out.println("Welcome to Wheel of Fortune  \uD83C\uDFAF ");
        Thread.sleep(500);
        System.out.println("**********************************");
        Thread.sleep(500);
        File Theme = new File("Sounds/Theme.wav");
        PlaySoundTheme(Theme);
        GameBoard.GameBoard();
        Thread.sleep(10000);
    }

}
