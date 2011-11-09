package MPR_Project;

public class Pracownik {

        private String imie;
        private String id;
        private String nazwisko;

        public Pracownik(String imie, String nazwisko, String id)  //inna nazwa NULL
      {
               this.imie=imie;
               this.nazwisko=nazwisko;
               this.id=id;
     }

        public void printPracownik()
  {
               System.out.println("\nID: "+id+"\n Imiê: "+imie+"\n Nazwisko: "+nazwisko+"\n " );
     }

        public String getImie()
 {
               return this.imie;
       }

        public void setImie(String imie)
        {
               this.imie=imie;
 }

        public String getNazwisko()
       {
               return this.nazwisko;
 }

        public void setNazwisko(String nazwisko)
        {
               this.nazwisko=nazwisko;
     }

     public String getID()
       {
               return this.id;
 }

        public void setID(String id)
        {
               this.id=id;
     }

}

