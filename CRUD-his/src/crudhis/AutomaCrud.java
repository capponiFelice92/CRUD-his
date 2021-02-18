package crudhis;

public class AutomaCrud implements State {

    private State stato;
    private Automabile ui;

    @Override
    public void next(Event e) {
        stato.next(e);
    }

    public AutomaCrud(Automabile ui) {
        this.ui = ui;
        stato = new Ricerca();
    }

    private class Ricerca implements State {

        public Ricerca() {

        }

        @Override
        public void next(Event e) {
            if (e instanceof RicercaEvent) {
                ui.entraStatoAggiungi();
            } else if (e instanceof AddEvent) {
                stato = new Aggiungi();
            } else if (e instanceof SelezionaEvent) {
                stato = new Visualizza();
            } else {
                System.out.println("errore");
            }

        }

    }

    private class Aggiungi implements State {

        public Aggiungi() {
            ui.entraStatoAggiungi();
        }

        
        @Override
        public void next(Event e) {
            if (e instanceof ConfermaEvent) {
                stato = new Visualizza();
            } else if (e instanceof AnnullaEvent) {
                stato = new Ricerca();
            } else {
                System.out.println("errore");
            }
        }
    }

    private class Visualizza implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AddEvent) {
                stato = new Aggiungi();
            } else if (e instanceof SelezionaEvent) {

            } else if (e instanceof ModificaEvent) {
                stato = new Modifica();
            } else if (e instanceof RimuoviEvent) {
                stato = new Rimuovi();
            } else if (e instanceof RicercaEvent) {
                stato = new Ricerca();
            } else {
                System.out.println("errore");
            }
        }
    }

    private class Rimuovi implements State {

        @Override
        public void next(Event e) {
            if (e instanceof ConfermaEvent) {
                stato = new Ricerca();
            } else if (e instanceof AnnullaEvent) {
                stato = new Visualizza();
            } else {
                System.out.println("errore");
            }
        }
    }

    private class Modifica implements State {

        @Override
        public void next(Event e) {
            if (e instanceof ConfermaEvent) {
                stato = new Visualizza();
            } else if (e instanceof AnnullaEvent) {
                stato = new Visualizza();
            } else {
                System.out.println("errore");
            }
        }

    }

}
