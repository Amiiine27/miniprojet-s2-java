package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class GestionVols {
    private static List<Vol> volsPlannifies = new ArrayList<>();

    public static void ajouterVol(Vol vol) {
        volsPlannifies.add(vol);
    }

    public static void annulerVol(String numeroVol) {
        volsPlannifies.removeIf(v -> v.getNumeroVol().equals(numeroVol));
    }

    public static List<Vol> getVolsPlannifies() {
        return volsPlannifies;
    }
}
