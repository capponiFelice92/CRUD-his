
package crudhis;

public class AutomaCrud implements State {
    
    private State stato;

    @Override
    public void next(Event e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private class Ricerca implements State{

        @Override
        public void next(Event e) {
            if (e instanceof RicercaEvent){
            }else if(){
                stato = new Aggiungi();
             }
                
            }
        
         
            
        }
        
         private class Aggiungi implements State{

        @Override
        public void next(Event e) {
         
            
        }
        
         private class Visualizza implements State{

        @Override
        public void next(Event e) {
         
            
        }
        
         private class Rimuovi implements State{

        @Override
        public void next(Event e) {
         
            
        }
        
         private class Modifica implements State{

        @Override
        public void next(Event e) {
         
            
        }
        
        
    }
    
 }
