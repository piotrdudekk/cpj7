public class Processor
    {
        private String make;
        private String model;
        private float frequency;
        private int cacheSize;
        
        public Processor(String make, String model, float frequency, int cacheSize){
            this.make=make;
            this.model=model;
            this.frequency=frequency;
            this.cacheSize=cacheSize;
        }
        
        public String toString(){
            return make+"\n"+model+"\n"+frequency+"\n"+cacheSize;
        }
        
        private void compile(){
            
        }
    }