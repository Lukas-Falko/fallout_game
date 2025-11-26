import java.util.Random;
import java.util.Scanner;

public class gra {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
 
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
        int numerLos = 61;

        do {
            String[] bankSlow = {
                "kernel", "matrix", "system", "vector", "tablet", "transformator",
                "algorithm", "interface", "protocol", "network",
                "firewall", "database", "gateway", "compiler",
                "runtime", "package", "library", "framework",
                "thread", "process", "endpoint", "function",
                "variable", "instance", "object", "class",
                "inheritance", "constructor", "parameter", "operator",
                "pointer", "buffer", "register", "cache",
                "filesystem", "cluster", "replica", "backup",
                "monitor", "adapter", "router", "switch",
                "ethernet", "wireless", "virtualization", "container",
                "deployment", "encryption", "hash", "token",
                "session", "latency", "bandwidth", "throughput",
                "storage", "archive", "metadata", "checksum",
                "exception", "iterator", "recursion", "syntax"
            };

            Random rand = new Random();{
                random1 = bankSlow[rand.nextInt(numerLos)];

                for(int i =0; i<bankSlow.length; i++){
                    if(random1.equals((bankSlow[i]))){
                        numerLos = i;
                    

                        String temp = bankSlow[i];

                        
                        
                        

                       

                        
                    };
                }






                y++;




                //wylosowane slowo jako element tablicy kotry
                //przenoszenie wylosowanego elementu na koniec taba
                //skracanie zakresu losowania 
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
            
            //Randomowe slowo
            String[] options = {random1, random2, random3, random4, random5, random6, random7, random8, random9,random10,random11,random12};
            Random randslowo = new Random();
            poprawneSlowo = options[randslowo.nextInt(options.length)];

        } while (y != 12);

        //Główne menu
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

            System.out.print("Wpisz odpowiedz ");
            odpowiedz = scan.next();

            if (poprawneSlowo.equals(odpowiedz)) {
            System.out.print("Brawo to jest poprawne słowo!");
            attemptsLeft = 0;
            } else {

                int wspolne = 0;
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

                System.out.println("");{
                    System.out.println("Wspolne litery: "+ wspolne);
                    System.out.println("");
                }
                
            }




        }while (attemptsLeft != 0);
        
        IO.println("");
        IO.println("Odpowiedz to: " + poprawneSlowo);

        scan.close();
    }


    //randomowy hex
    public static String getRandomHex() {
        int value = new java.util.Random().nextInt(0x10000);
        return String.format("0x%04X", value);
    }



}
   

