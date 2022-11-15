package br.com.takeiteasy.takeiteasy.modules.clock;

import java.util.*;

public class ControladorTimer {

    private List<Timer> timerLista;

    ControladorTimer() {
        timerLista = new ArrayList<Timer>();
    }

    /**
   * @return the List<Timer>
   */

    public List<Timer> getTimer() {
        return timerLista;
    }
 
    public void addTimer(Timer timer) {
        this.timerLista.add(timer);
    }

    public void removeTimer(Timer timer) {
        timerLista.remove(timer);
    }

    public List<Timer> listTimer() {
        return timerLista;
    }

    public void updateTimer(Timer timer) {
        timerLista.set(timerLista.indexOf(timer), timer);
    }

}
