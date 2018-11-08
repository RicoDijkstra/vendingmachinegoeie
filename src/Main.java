import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hey daar wij hebben broeken in de aanbieden zou je er een willen??");
        Scanner s = new Scanner(System.in);
        String antwoord;
        int geld = 20;

        antwoord = s.next();
        if (antwoord.equals("Ja")) {
            System.out.println("Wil je dan de goedkopere of de dure?");
        } else if (antwoord.equals("nee")) {
            System.out.println("Oke sorry dan hebben wij hier niks voor jou!");
        }
        String type = s.next();
        if (type.equals("dure")) {
            System.out.println("Stone island of armani?");
        } else if (type.equals("goedkope")) {
            System.out.println("Cars of vingino?");
        }
        String merk = s.next();
        if (merk.equals("cars")) {
            geld = geld - 10;
            System.out.println("Dat kost dan €10");
            System.out.println(geld);
        }else if (merk.equals("vingino"))
        {
            geld = geld - 10;
            System.out.println("Dat kost dan €10");
            System.out.println(geld);
        }
        String top = s.next();
        if(top.equals("alsjeblieft"))
        {
            System.out.println("" +
                    ",==c==.\n" +
                    "|_/|\\_|\n" +
                    "| ´|` |\n" +
                    "|  |  |\n" +
                    "|  |  |\n" +
                    "|__|__|" +
                    "zou je dan ook nog koffie willen? Dat kost dan €2");
        }
        String answer = s.next();
        if (answer.equals("ja"))
        {
            geld = geld - 2;
            System.out.println("         {\n" +
                    "      {   }\n" +
                    "       }_{ __{\n" +
                    "    .-{   }   }-.\n" +
                    "   (   }     {   )\n" +
                    "   |`-.._____..-'|\n" +
                    "   |             ;--.\n" +
                    "   |            (__  \\\n" +
                    "   |             | )  )\n" +
                    "   |             |/  /\n" +
                    "   |             /  /\n" +
                    "   |            (  /\n" +
                    "   \\             y'\n" +
                    "    `-.._____..-'\n");
            System.out.println(geld);

        }
        else if (answer.equals("nee"))
        {
            System.out.println("Fijne dag verder!");
        }

        String duur = s.next();
        if(duur.equals("stone"))
        {
            geld = geld - 10;
            System.out.println("Oke dat kost dan €15");
            System.out.println(geld);
        }
        else if(duur.equals("armani"))
        {
            geld = geld - 15;
           System.out.println("Oke dat kost dan €15");
            System.out.println(geld);
        }
        String bedankt = s.next();
        if (bedankt.equals("alsjeblieft")) {
            System.out.println("     _____________\n" +
                    "               [_I_I[L]=_I_I_]\n" +
                    "               /     | :     \\\n" +
                    "               |    /|  \\    |\n" +
                    "               |   | '-  |   |\n" +
                    "               \\  | /^\\ |  /\n" +
                    "                |  | | | |  |\n" +
                    "                |  | | | |  |\n" +
                    "                |  | | | |  |\n" +
                    "               \\  | | | |  /\n" +
                    "                / -|-| |-|- \\\n" +
                    "                |  | | | |  |\n" +
                    "                |  | | | |  |\n" +
                    "                |  | | | |  |\n" +
                    "                |__|_| |_|__|\n" +
                    "                [____] [____]" +
                    "Zou je er nog koffie bij willen?");
            String janee = s.next();
            if (janee.equals("Ja")) {
                geld = geld - 2;
                System.out.println("         {\n" +
                        "      {   }\n" +
                        "       }_{ __{\n" +
                        "    .-{   }   }-.\n" +
                        "   (   }     {   )\n" +
                        "   |`-.._____..-'|\n" +
                        "   |             ;--.\n" +
                        "   |            (__  \\\n" +
                        "   |             | )  )\n" +
                        "   |             |/  /\n" +
                        "   |             /  /\n" +
                        "   |            (  /\n" +
                        "   \\             y'\n" +
                        "    `-.._____..-'\n");
                System.out.println(geld);
            } else if (janee.equals("nee"))
            {
                System.out.println("Fijne dag verder!");
            }
        }

    }

    }


