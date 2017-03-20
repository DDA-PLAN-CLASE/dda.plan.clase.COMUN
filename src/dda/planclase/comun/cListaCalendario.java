/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dda.planclase.comun;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class cListaCalendario {
    private List<cCalendario> calendario = new ArrayList<>();

    public List<cCalendario> getCalendario() {
        return calendario;
    }

    public void setCalendario(List<cCalendario> calendario) {
        this.calendario = calendario;
    }
    
    Hashtable<String, String> DiasCalendario = new Hashtable<>();

    public Hashtable<String, String> getDiasCalendario() {
        return DiasCalendario;
    }

    public void setDiasCalendario(Hashtable<String, String> DiasCalendario) {
        this.DiasCalendario = DiasCalendario;
    }
}


