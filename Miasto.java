package Kolokwium.Kolokwium;

public class Miasto {

    public String nazwaMiasta;
    public Prezydent prezydentMiasta;


    Miasto(String nazwaMiasta, Prezydent prezydentMiasta){

        this.nazwaMiasta = nazwaMiasta;
        this.prezydentMiasta = prezydentMiasta;
        //System.out.println("Miasto:" + nazwaMiasta + "\nPrezydent: " + prezydentMiasta);

    }

    Miasto(){
        this( "MiasteczkoHej" , new Prezydent("Jan", "Kowalski"));
    }


    @Override
    public String toString(){

        return "Miasto:" + nazwaMiasta + "\nPrezydent: " + prezydentMiasta;

    }

}
