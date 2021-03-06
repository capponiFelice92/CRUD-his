package crudhis;

public class AutomaCrud implements State {

    private State stato;
    private Automabile ui;

    /**
     *
     * @param e
     */
    @Override
    public void next(Event e) {
        System.out.println("Siamo nello stato " + stato);
        System.out.println("Ricevuto evento " + e);
        stato.next(e);
        System.out.println("Siamo arrivati nello stato " + stato + "\n");
    }

    /**
     *
     * @param ui
     */
    public AutomaCrud(Automabile ui) {
        this.ui = ui;
        stato = new Ricerca();
        ui.entraStatoRicerca();
    }

    private class Ricerca implements State {

        public Ricerca() {
        }

        @Override

        public void next(Event e) {
            if (e instanceof RicercaEvent) {
                System.out.println("Tabella aggiornata");
            } else if (e instanceof AddEvent) {
                stato = new Aggiungi();
            } else if (e instanceof SelezionaEvent) {
                ui.entraStatoVisualizza();
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
                ui.entraStatoVisualizza();
            } else if (e instanceof AnnullaEvent) {
                stato = new Ricerca();
                ui.entraStatoRicerca();
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
                ui.entraStatoAggiungi();
            } else if (e instanceof SelezionaEvent) {

            } else if (e instanceof ModificaEvent) {
                ui.entraStatoModifica();
                stato = new Modifica();
            } else if (e instanceof RimuoviEvent) {
                stato = new Rimuovi();
                ui.entraStatoRimuovi();
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
                ui.entraStatoRicerca();
            } else if (e instanceof AnnullaEvent) {
                stato = new Visualizza();
                ui.entraStatoVisualizza();
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
                ui.entraStatoVisualizza();
            } else if (e instanceof AnnullaEvent) {
                stato = new Visualizza();
                ui.entraStatoVisualizza();
            } else {
                System.out.println("errore");
            }
        }

    }

}
