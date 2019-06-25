package Kolokwium.Kolokwium;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Kolokwium {

    //duzeLiteryCyfry(){
    public static void plik (Dzielnica[] tabliczka) {

        try ( FileWriter pliczek = new FileWriter("test.txt") ) {

            for(int i = 0; i < tabliczka.length; i++){
                pliczek.write(tabliczka[i].toString());
            }
        } catch (IOException e){
            System.out.println("Nope");
            //return "dupa";
        }
    }

    public static void main(String[] args) {

        Miasto miasteczko = new Miasto();

        /*Dzielnica dzielniczka = new Dzielnica();
        Dzielnica dzielniczka2 = new Dzielnica();
        System.out.println(dzielniczka.getNrDzielnicy());
        System.out.println(dzielniczka2.getNrDzielnicy());*/

        Dzielnica[] tabliczka = new Dzielnica[4];
        Prezydent prezydencik = new Prezydent("Antek", "Dupa");
        tabliczka[3] = new Dzielnica("Elblag", prezydencik);
        tabliczka[0] = new Dzielnica();
        tabliczka[1] = new Dzielnica();
        tabliczka[2] = new Dzielnica();

        System.out.println(Arrays.toString(tabliczka));

        Arrays.sort(tabliczka, new Comparator<Dzielnica>() {
            @Override
            public int compare(Dzielnica x, Dzielnica y) {
                return Integer.compare(x.getNrDzielnicy(), y.getNrDzielnicy());
            }
        });

        System.out.println(Arrays.toString(tabliczka));
        Kolokwium.plik(tabliczka);

    }
}

