import java.util.Random;
import java.util.Scanner;

public class gra {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int wspolne = 0;
        int y = 0;
        int attemptsLeft = 4;
        String odpowiedz;
        String poprawneSlowo;
        String random1;
        String random2;
        String random3;
        String random4; 
        String random5;
        String random6;
        String random7;
        String random8;
        String random9;
        String random10;
        String random11;
        String random12;

        do {
            String[] bankSlow = {
                "kernel", "matrix", "system", "vector","tablet","tramsformator"
            };

            Random rand = new Random();{
                random1 = bankSlow[rand.nextInt(bankSlow.length)];
                y++;
            }

            Random rand2 = new Random();{
            random2 = bankSlow[rand2.nextInt(bankSlow.length)];
            y++;
            }

            Random rand3 = new Random();{
            random3 = bankSlow[rand3.nextInt(bankSlow.length)];
            y++;
            }

            Random rand4 = new Random();{
            random4 = bankSlow[rand4.nextInt(bankSlow.length)];
            y++;
            }

            Random rand5 = new Random();{
            random5 = bankSlow[rand5.nextInt(bankSlow.length)];
            y++;
            }

            Random rand6 = new Random();{
            random6 = bankSlow[rand6.nextInt(bankSlow.length)];
            y++;
            }

            Random rand7 = new Random();{
            random7 = bankSlow[rand7.nextInt(bankSlow.length)];
            y++;
            }

            Random rand8 = new Random();{
                random8 = bankSlow[rand8.nextInt(bankSlow.length)];
                y++;
            }

            Random rand9 = new Random();{
                random9 = bankSlow[rand9.nextInt(bankSlow.length)];
                y++;

            }
            
            Random rand10 = new Random();{
                random10 = bankSlow[rand10.nextInt(bankSlow.length)];
                y++;
            }
                      
            Random rand11 = new Random();{
                random11 = bankSlow[rand11.nextInt(bankSlow.length)];
                y++;
            }
            
            Random rand12 = new Random();{
                random12 = bankSlow[rand12.nextInt(bankSlow.length)];
                y++;
            }
            
            String[] options = {random1, random2, random3, random4, random5, random6, random7, random8, random9,random10,random11,random12};
            Random randslowo = new Random();
            poprawneSlowo = options[randslowo.nextInt(options.length)];

        } while (y != 12);

        do {
            System.out.println("ROBOCO INDUSTRIES (TM) TERMLINK PROTOCOL");
            System.out.println("!!! WARNING: LOCKOUT IMMINENT !!!");
            System.out.println("");
            System.out.println(attemptsLeft + " ATTEMPT(S) LEFT:");
            System.out.println("");
            System.out.println(getRandomHex() + " >$#!{" + random1 + "}>$#!" + "              " + getRandomHex() + ">$#!{" + random2 + "}>$#!");
            System.out.println(getRandomHex() + " >$#!{" + random3 + "}>$#!" + "              " + getRandomHex() + ">$#!{" + random4 + "}>$#!");
            System.out.println(getRandomHex() + " >$#!{" + random5 + "}>$#!" + "              " + getRandomHex() + ">$#!{" + random6 + "}>$#!");
            System.out.println(getRandomHex() + " >$#!{" + random7 + "}>$#!" + "              " + getRandomHex() + ">$#!{" + random8 + "}>$#!");
            System.out.println(getRandomHex() + " >$#!{" + random9 + "}>$#!" + "              " + getRandomHex() + ">$#!{" + random10 + "}>$#!");
            System.out.println(getRandomHex() + " >$#!{" + random11 + "}>$#!" + "              " + getRandomHex() + ">$#!{" + random12 + "}>$#!");
            System.out.println("");

            System.out.println("Wpisz odpowiedz ");
            odpowiedz = scan.next();

            if (poprawneSlowo.equals(odpowiedz)) {
            System.out.print("Brawo to jest poprawne słowo!");
            attemptsLeft = 0;
            } else {

                attemptsLeft = attemptsLeft-1;
                String[] tab1 = odpowiedz.split("");
                String[] tab2 = poprawneSlowo.split("");

                for(int n = 0; n < tab1.length; n++){
                    for(int i = 0; i < tab2.length; i++){
                        if(tab1[n].equals(tab2[i])){
                                wspolne = wspolne + 1;
                                break;
                        }
                    }
                }
            }

            System.out.println("");
            System.out.println(wspolne);

        }while (attemptsLeft != 0);

        IO.print(poprawneSlowo);
        scan.close();
    }

    public static String getRandomHex() {
        int value = new java.util.Random().nextInt(0x10000);
        return String.format("0x%04X", value);
    }
}
   

