package Kolokwium.Kolokwium;

import java.util.List;

public class Dzielnica extends Miasto {

    private int nrDzielnicy;
    public List<String> tablicaUlic[];

    private static int id = 1;


    public Dzielnica(){

        numerowanie();

    }

    public Dzielnica(String nazwaMiasta, Prezydent prezydentMiasta, List<String> tablicaUlic[]){

        super(nazwaMiasta, prezydentMiasta);
        numerowanie();
        this.tablicaUlic = tablicaUlic;

    }

    public Dzielnica(String nazwaMiasta, Prezydent prezydentMiasta){

        super(nazwaMiasta, prezydentMiasta);
        numerowanie();

    }


    public void numerowanie() {

        this.nrDzielnicy = nrDzielnicy;
        nrDzielnicy = id;
        id++;

    }

    public int getNrDzielnicy(){
        return nrDzielnicy;
    }


    @Override
    public String toString(){

        return "\nDzielnica:" + nrDzielnicy;

    }
}

