package GameParts;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static GameParts.Players.GetAnInteger;
import static GameParts.SoundEffects.PlaySound;
import static GameParts.SoundEffects.PlaySoundEnd;

public class GameBoard {
    public static void GameBoard() throws IOException, InterruptedException {
        File Bruh = new File("Sounds/Bruh.wav");
        File Click = new File("Sounds/Click.wav");
        File Theme = new File("Sounds/Theme.wav");
        File Ding = new File("Sounds/Correct.wav");
        File Wrong = new File("Sounds/Buzzer.wav");
        File Puzzle = new File("Sounds/Puzzle Reveal.wav");
        File Solve = new File("Sounds/Puzzle solve.wav");
        File Bankrupt = new File("Sounds/Bankrupt.wav");
        ArrayList<Players> players = new ArrayList<>();
        File file = new File("Puzzles.txt");
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String guesses = "  ";
        int num = Integer.parseInt(br.readLine());
        ArrayList<String> category = new ArrayList<>();
        ArrayList<String> solvedPhrase = new ArrayList<>();
        int playerNum = Players.getplayerNum();
        String playName;
        int emojis;
        for (int k = 0; k < playerNum; k++) {
            //makes an arrayList of players
                    Players player = new Players();
                    System.out.println("- Player " + (k + 1) + "'s Name: \r");
                    Thread.sleep(1000);
                    players.add(player);
                    playName = scanner.nextLine();
                    PlaySound(Click);
                    players.get(k).setName(playName);
                    System.out.println("- "+players.get(k).getName()+" Which Emoji Would You Like:  [1] \uD83D\uDC20 ,  [2] \uD83D\uDC27 ,  [3] \uD83D\uDC3C ,  [4] \uD83E\uDD84   ");
                    emojis = GetAnInteger();
                    PlaySound(Click);
                    if(emojis == 1){
                        String emoji = " \uD83D\uDC20  ";
                        players.get(k).setEmoji(emoji);
                    }else if( emojis == 2){
                        String emoji = " \uD83D\uDC27 ";
                        players.get(k).setEmoji(emoji);
                    }else if(emojis == 3){
                        String emoji = " \uD83D\uDC3C ";
                        players.get(k).setEmoji(emoji);
                    }else if(emojis == 4){
                        String emoji = " \uD83E\uDD84 ";
                        players.get(k).setEmoji(emoji);
                    }else{
                        String emoji = " \uD83D\uDC38 ";
                        players.get(k).setEmoji(emoji);
                    }
                    players.get(k).newGame();
        }
        for (int i = 0; i < num; i++) {
            String[] secretPhrase = br.readLine().toUpperCase().split(":");
            category.add(secretPhrase[0]);
            solvedPhrase.add(secretPhrase[1]);
        }
        gameLoop:
        for (int n = 0; n < solvedPhrase.size(); n++) {
            Integer k = new Random().nextInt(solvedPhrase.size());
            //array lists of vowels and consonants
            ArrayList<Character>Vowels = new ArrayList<>();
            Vowels.add('A');Vowels.add('E');Vowels.add('I');
            Vowels.add('O');Vowels.add('U');
            ArrayList<Character>Consonants = new ArrayList<>();
            PlaySound(Puzzle);
            Thread.sleep(500);
            for(int y = 65; y<=90;y++)
                if (!Vowels.contains((char)y)) Consonants.add((char)y);

            for (int g =0 ; g < solvedPhrase.size();g++) { // loop through all players
               playerLoop:
                for(int u =0; u< players.size();u++) {
                    while (true) {
                        System.out.println("**********************************");
                        System.out.println("Category: " + category.get(k));
                        Thread.sleep(500);
                        System.out.print("Puzzle: ");
                        Thread.sleep(500);
                        for (char secretLetter : solvedPhrase.get(k).toCharArray()) {
                            if (guesses.indexOf(secretLetter) == -1) {
                                System.out.print("_ ");
                                Thread.sleep(100);

                            } else {
                                System.out.print(secretLetter+" ");

                            }
                        }
                        System.out.println("\n**********************************");
                        Thread.sleep(500);
                        System.out.println("It's "+ players.get(u).getName()+"'s "+players.get(u).getEmoji()+"Turn:");
                        Thread.sleep(500);
                        System.out.println("- Balance: " + players.get(u).getRBal());
                        Thread.sleep(500);
                        System.out.println("_______________________________");
                        Thread.sleep(500);
                        System.out.println("- Which would you like to do ?");
                        System.out.println("[1]Spin The Wheel\n[2]Solve Phrase\n[3]Buy A Vowel");
                        int choices = GetAnInteger();
                        if (choices == 1) {
                            File Spin = new File("Sounds/Spin.wav");
                            PlaySound(Spin);
                            int s = Wheel.spin();
                            if (s == 0) {
                                PlaySound(Bruh);
                                Thread.sleep(700);
                                System.out.println("You Lose A Turn !!!");
                                Thread.sleep(700);
                                continue playerLoop;
                            } else if (s == 1) {
                                PlaySound(Bankrupt);
                                System.out.println("You have been Robbed !!!");
                                Thread.sleep(700);
                                players.get(u).bankrupt();
                                continue playerLoop;
                            }
                            System.out.print("Pick A Consonant: ");
                            System.out.println(Consonants.toString());
                            Thread.sleep(500);
                            char letter = scanner.nextLine().toUpperCase().charAt(0);
                            long count = solvedPhrase.get(k).chars().filter(i -> i == letter).count();
                            if(Consonants.contains(letter)) {
                                Consonants.remove(Consonants.indexOf(letter));
                                if (solvedPhrase.get(k).indexOf(letter) == -1) {
                                    PlaySound(Wrong);
                                    System.out.println("There are "+ count+" "+letter + "'s in this puzzle !!!");
                                    Thread.sleep(500);
                                    continue playerLoop;
                                }
                                guesses += letter;
                                PlaySound(Ding);
                                if(count == 1){
                                    System.out.println("There is "+count+" "+letter + " in this puzzle !!!");
                                    Thread.sleep(500);
                                }else {
                                    System.out.println("There are " + count + " " + letter + "'s in this puzzle !!!");
                                    Thread.sleep(500);
                                }
                                long bal = count * s;
                                players.get(u).addrBal(bal);
                            }else{
                                PlaySound(Wrong);
                                System.out.println(letter + " is not an available consonant.");
                                Thread.sleep(500);
                                System.out.println("Sorry Now You Lose A Turn");
                                Thread.sleep(200);
                                continue playerLoop;
                            }
                        } else if (choices == 2) {
                            PlaySound(Click);
                            System.out.println("What is your Guess: ");
                            String words = scanner.nextLine().toUpperCase();
                            if (words.equals(solvedPhrase.get(k))) {
                                PlaySound(Solve);
                                System.out.println("You are spot on you figured out the puzzle !!!");
                                Thread.sleep(500);
                                players.get(u).addTBal( Math.max(players.get(u).getRBal(),1000));
                                guesses = " ";
                                System.out.println("___________________________");
                                System.out.println("Round Complete !!!");
                                for(int x = 0 ; x < players.size();x++) {
                                    players.get(x).bankrupt();
                                    System.out.println("- "+players.get(x).getEmoji()+players.get(x).getName()+"'s Total Score: "+players.get(x).getTBal());
                                    Thread.sleep(500);
                                }
                                System.out.println("___________________________\n");
                                Thread.sleep(500);
                                System.out.println("Do you want to play another Puzzle?");
                                Thread.sleep(500);
                                System.out.println("[Y or N]");
                                Thread.sleep(500);
                                char more = scanner.nextLine().toUpperCase().charAt(0);
                                PlaySound(Click);
                                if(more == 'Y'){
                                    continue gameLoop;
                                }else {
                                    break gameLoop;
                                }
                            } else {
                                PlaySound(Wrong);
                                System.out.println("That's not the puzzle :(");
                                Thread.sleep(500);
                                continue playerLoop;
                            }
                        } else if (choices == 3) {
                            PlaySound(Click);
                            if (players.get(u).getRBal() == 0) {
                                PlaySound(Wrong);
                                System.out.println("Sorry you don't have enough money");
                                Thread.sleep(500);
                                continue playerLoop;
                            } else {
                                players.get(u).removerBal(50);
                                System.out.print("Pick A Vowel: ");
                                System.out.println(Vowels.toString());
                                Thread.sleep(500);
                                char vowel = scanner.nextLine().toUpperCase().charAt(0);
                                long counts = solvedPhrase.get(k).chars().filter(i -> i == vowel).count();
                                if (Vowels.contains(vowel)) {
                                    Vowels.remove(Vowels.indexOf(vowel));
                                    if (solvedPhrase.get(k).indexOf(vowel) == -1) {
                                        PlaySound(Wrong);
                                        System.out.println("There are "+counts+" "+vowel + "'s in this puzzle !!!");
                                        Thread.sleep(500);
                                        continue playerLoop;
                                    }
                                    PlaySound(Ding);
                                    if(counts == 1){
                                        System.out.println("There is "+counts+" "+vowel + " in this puzzle !!!");
                                        Thread.sleep(500);
                                    }else {
                                        System.out.println("There are " + counts + " " + vowel + "'s in this puzzle !!!");
                                        Thread.sleep(500);
                                    }
                                    guesses += vowel;
                                }else{
                                    PlaySound(Wrong);
                                    System.out.println(vowel + " is not an available vowel.");
                                    Thread.sleep(500);
                                    System.out.println("Sorry Now You Loose A Turn ");
                                    Thread.sleep(200);
                                    continue playerLoop;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\n*******************************************");
        Thread.sleep(500);
        PlaySoundEnd(Theme);
        System.out.println("Thanks For Playing Wheel Of Fortune \uD83C\uDFAF !!!");
        Thread.sleep(500);
        System.out.println("*********************************************");
        Thread.sleep(500);
    }
}