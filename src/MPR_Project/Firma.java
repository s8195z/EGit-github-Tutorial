package MPR_Project;

import java.util.ArrayList;
import java.util.List;

public class Firma {

        public String Nazwa;

        public List<Pracownik> pracownicy= new ArrayList<Pracownik>();
        public List<Dzial> dzialy= new ArrayList<Dzial>();
        public Firma(String nazwa, List<Pracownik> pracownicy , List<Dzial> dzialy)
      {
        	    	
               this.Nazwa=nazwa;
               this.pracownicy=pracownicy;
               this.dzialy=dzialy; 
 }

    	public Firma(String nazwa) {
    		super();
    		this.Nazwa = nazwa;
    		this.pracownicy = new ArrayList<Pracownik>();
    		this.dzialy = new ArrayList<Dzial>();
    	}

    	public String getNazwa() {
    		return Nazwa;
    	}

    	public void setNazwa(String nazwa) {
    		Nazwa = nazwa;
    	}

        public List<Pracownik> getPracownicy() {
    		return pracownicy;
    	}

    	public void setPacownicy(List<Pracownik> pracownicy) {
    		this.pracownicy = pracownicy;
    	}

    	public List<Dzial> getDzialy() {
    		return dzialy;
    	}

    	public void setDzialy(List<Dzial> dzialy) {
    		this.dzialy = dzialy;
    	}

    	public void addDzial(Dzial dzial){
    		dzialy.add(dzial);
    	}
    	
    	public void addPracownik(Pracownik pracownik){
    		pracownicy.add(pracownik);
    	}
    	
    	public void removeDzial(Dzial dzial){
    		dzialy.remove(dzial);
    	}
    	
    	public void removePracownik(Pracownik pracownik){
    		pracownicy.remove(pracownicy);
    	}
    	
    	public void printPracownicy(){
    		
    		System.out.println("Pracownicy:");
    		for(Pracownik pracownik: pracownicy){
    			pracownik.printPracownik();
    		}
    	}
    	
    	public void printDzialy(){
    		
    		System.out.println("Dzialy:");
    		for(Dzial dzial: dzialy){
    			dzial.Dzial();
    		}
    	}
    	
    	public void printAll(){
    		
    		System.out.println("Dzialy:");
    		
    		for(Dzial dzial: dzialy){
    			dzial.Dzial();
    		}
    		
    		System.out.println("Pracownicy:");
    		
    		for(Pracownik pracownik: pracownicy){
    			pracownik.printPracownik();
    		}
    		
    	}
    	
    }

