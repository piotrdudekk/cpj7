
public class Writer
{
    private String imie;
    private String nazwisko;
    public String wydawnictwo;
    
    public Writer(String imie, String nazwisko, String wydawnictwo){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wydawnictwo=wydawnictwo;
    }
    
    public String toString(){
        return imie+"\n"+nazwisko+"\n"+wydawnictwo;
    }
    
    public void zmienWydawnictwo(String wydawnictwo2){
        wydawnictwo=wydawnictwo2;
    }
}

