import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {
    private static final Logger log = Logger.getLogger(main.class.getName());

    public static void main(String[] args) {
        HashMap<Integer,String> CAR = new HashMap<>();
        HashMap<Integer,String> SHIP = new HashMap<>();
        HashMap<Integer,String> PLANE = new HashMap<>();
        HashMap<Integer,String> BICYCLE = new HashMap<>();
        CAR.put(180,"BMW");
        CAR.put(160,"AUDI");
        SHIP.put(15,"Motorowka");
        SHIP.put(10,"Jacht");
        PLANE.put(270,"Helikopter");
        PLANE.put(350,"Szybowiec");
        BICYCLE.put(10,"BMX");
        BICYCLE.put(8,"MTB");

        boolean petla=true;
        Scanner scan = new Scanner(System.in);
        int predkosc=0;
        String marka=" ";
        while(petla) {
            System.out.println("Dostepne opcje: CAR,SHIP,PLANE,BICYCLE,ALL,EXIT \n");
            String wybor=scan.nextLine();
            switch(wybor) {
                case "CAR":
                   for(Map.Entry<Integer,String> entry: CAR.entrySet()) {
                       int key = entry.getKey();
                       String value = entry.getValue();
                       if(key>predkosc) {
                           predkosc=key;
                           marka=value;
                       }
                   }
                   System.out.print("Pojazd "+wybor+" "+marka+" jest najszybszy(Predkosc ="+predkosc+")\n");
                    log.log(Level.INFO,wybor);
                   predkosc=0;
                   break;
                case "SHIP":
                    for(Map.Entry<Integer,String> entry2: SHIP.entrySet()) {
                        int key = entry2.getKey();
                        String value = entry2.getValue();
                        if(key>predkosc) {
                            predkosc=key;
                            marka=value;
                        }
                    }
                    System.out.print("Pojazd "+wybor+" "+marka+" jest najszybszy(Predkosc ="+predkosc+")\n");
                    log.log(Level.INFO,wybor);
                    predkosc=0;
                    break;
                case "PLANE":
                    for(Map.Entry<Integer,String> entry3: PLANE.entrySet()) {
                        int key = entry3.getKey();
                        String value = entry3.getValue();
                        if(key>predkosc) {
                            predkosc=key;
                            marka=value;
                        }
                    }
                    System.out.print("Pojazd "+wybor+" "+marka+" jest najszybszy(Predkosc ="+predkosc+")\n");
                    log.log(Level.INFO,wybor);
                    predkosc=0;
                    break;
                case "BICYCLE":
                    for(Map.Entry<Integer,String> entry4: BICYCLE.entrySet()) {
                        int key = entry4.getKey();
                        String value = entry4.getValue();
                        if(key>predkosc) {
                            predkosc=key;
                            marka=value;
                        }
                    }
                    System.out.print("Pojazd "+wybor+" "+marka+" jest najszybszy(Predkosc ="+predkosc+")\n");
                    log.log(Level.INFO,wybor);
                    predkosc=0;
                    break;
                case "ALL":
                    for(Map.Entry<Integer,String> entry5: CAR.entrySet()) {
                        int key = entry5.getKey();
                        String value = entry5.getValue();
                        if(key>predkosc) {
                            predkosc=key;
                            marka=value;
                        }
                    }
                    for(Map.Entry<Integer,String> entry6: SHIP.entrySet()) {
                        int key = entry6.getKey();
                        String value = entry6.getValue();
                        if(key>predkosc) {
                            predkosc=key;
                            marka=value;
                        }
                    }
                    for(Map.Entry<Integer,String> entry7: PLANE.entrySet()) {
                        int key = entry7.getKey();
                        String value = entry7.getValue();
                        if(key>predkosc) {
                            predkosc=key;
                            marka=value;
                        }
                    }
                    for(Map.Entry<Integer,String> entry8: BICYCLE.entrySet()) {
                        int key = entry8.getKey();
                        String value = entry8.getValue();
                        if(key>predkosc) {
                            predkosc=key;
                            marka=value;
                        }
                    }
                    System.out.print("Najszybszy z wszystkich jest "+marka+" (Predkosc ="+predkosc+")\n");
                    log.log(Level.INFO,wybor);
                    predkosc=0;
                    break;
                case "EXIT":
                    petla=false;
                    log.log(Level.INFO,wybor);
                    break;
                default:
                    System.out.println("Podaj prawidłową opcję \n");
                    log.log(Level.INFO,wybor);
                    break;
            }
        }
    }
}