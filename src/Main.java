import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hey daar wij hebben broeken in de aanbieden zou je er een willen??");
        Scanner s = new Scanner(System.in);
        String antwoord;

        antwoord = s.next();
        if (antwoord.equals("Ja")) {
            System.out.println("Wil je dan de goedkopere of de dure?");
        } else if (antwoord.equals("nee")) {
            System.out.println("Oke sorry dan hebben wij hier niks voor jou!");
        }
        String dure = s.next();
        String goedkope = s.next();
        if (dure.equals("dure")) {
            System.out.println("Stone island of armani?");
        } else if (goedkope.equals("goedkope")) {
            System.out.println("Cars of vingino?");
        }
        String cars = s.next();
        String vingino = s.next();
        if (cars.equals("cars")) {
            System.out.println("Ok, komt goed!");
        }else if (vingino.equals("vingino"))
        {
            System.out.println("Komt eraan!");
        }
        String top = s.next();
        if(top.equals("top"))
        {
            System.out.println("Graag gedaan!");
        }

        String stone = s.next();
        String armani = s.next();
        if(stone.equals("stone"))
        {
            System.out.println("Komt eraan!");
        }
        else if(armani.equals("armani"))
        {
           System.out.println("Broek is onderweg!");
        }
        String bedankt = s.next();
        if (bedankt.equals("bedankt"))
        {
            System.out.println("Graag gedaan!");
        }

    }

    }


