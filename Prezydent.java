package Kolokwium.Kolokwium;

public class Prezydent {

    public String imie;
    public String nazwisko;

    Prezydent(String imie, String nazwisko){

        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString(){
        return "\tPrezydent: " + imie + " " + nazwisko;
    }

}
