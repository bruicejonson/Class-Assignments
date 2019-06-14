package GameParts;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Wheel {
    public static int spin() throws IOException, InterruptedException {
        Random random = new Random();
        ArrayList<String> wedges = new ArrayList<>();
       BufferedReader br = new BufferedReader(new FileReader(new File("Wheel.txt")));
        int part = Integer.parseInt(br.readLine());
        for(int i = 0; i<part; i++){
            wedges.add(br.readLine());
        }
        int outcome = random.nextInt(wedges.size());
        boolean passed = false;
        for(int i =0; i != outcome || !passed ;i=(i+1)%wedges.size()){
            if( i == outcome) {
                passed = true;
            }
            String pegs = wedges.get(i);
            System.out.print("Spinning \uD83C\uDFB0 ... "+pegs+"\r");
            Thread.sleep(164);
        }
        System.out.println("You Spun \uD83C\uDFB0 : "+wedges.get(outcome));
        int fin;
        if(wedges.get(outcome).equals(wedges.get(0))){
            fin = 0;
            return fin;
        }else if(wedges.get(outcome).equals(wedges.get(18))){
            fin = 1;
            return fin;
        }else {
            fin= Integer.parseInt(wedges.get(outcome));
            return fin;
        }
    }
}
