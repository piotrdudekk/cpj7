
public class Book
{
    private String tytul;
    private String gatunek;
    private int iloscStron;
    private Writer autor;
    
    public Book(String tytul, String gatunek, int iloscStron,
    String imie, String nazwisko, String wydawnictwo){
        this.tytul=tytul;
        this.gatunek=gatunek;
        this.iloscStron=iloscStron;
        this.autor=new Writer(imie, nazwisko, wydawnictwo);
    }
    
    public String toString(){
        return "Tytul: "+tytul+" Gatunek: "+gatunek+" Dlugosc: "+iloscStron+" Autor: "+autor;
    }
    
    public void usunStrone(int ile){
        iloscStron=iloscStron-ile;
    }
    
    public static void main (String [] args){
        Book book1 = new Book("Nigdy", "thriller", 726, "Ken", "Follett", "Albatraus");
        book1.usunStrone(3);
        book1.toString();
    }
}
