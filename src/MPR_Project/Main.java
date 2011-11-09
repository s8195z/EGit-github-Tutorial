package MPR_Project;
import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {

List<Pracownik> pracownicy= new ArrayList<Pracownik>();

pracownicy.add(new Pracownik("Adam","Poniedzialek","1"));
pracownicy.add(new Pracownik("Ewa","Nowak","2"));
pracownicy.add(new Pracownik("Jacek","Jutro","3"));

List<Dzial> dzialy= new ArrayList<Dzial>();

dzialy.add(new Dzial("Ksiêgowoœæ"));
dzialy.add(new Dzial("Marketingu"));
dzialy.add(new Dzial("Sprzeda¿y"));

Firma u=new Firma( "KRZAK",pracownicy, dzialy);


u.printAll();

 }

}

      