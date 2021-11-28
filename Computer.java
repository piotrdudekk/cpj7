
public class Computer
{
    private boolean isOn;
    private int ram;
    private String os;
    private int storage;
    private String socket;
    private Processor processor;
    
    public Computer(boolean isOn, int ram, String os, int storage, String socket, String make, String model, float frequency, int cacheSize){
        this.isOn=isOn;
        this.ram=ram;
        this.os=os;
        this.storage=storage;
        this.socket=socket;
        this.processor=new Processor(make, model, frequency, cacheSize);
    }
    
    public String toString(){
        return "Ram: "+ram+" OS: "+os+"Processor: "+processor;
    }
    
    public void turnOn(){
        isOn=true;
    }
    
    public void turnOff(){
        isOn=false;
    }
    
    public String showStatus(){
        return "\n"+isOn;
    }
    
    public void main(String [] args){
        Computer comp1 = new Computer(false, 8, "Windows", 256, "Celeron", "Intel", "I7-950", 3.33f, 1366);
        comp1.turnOn();
        comp1.showStatus();
        comp1.toString();
    }
    
}
