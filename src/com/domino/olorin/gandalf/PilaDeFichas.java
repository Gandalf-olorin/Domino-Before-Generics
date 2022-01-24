package com.domino.olorin.gandalf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// pasamos todo de FichaImpl a Ficha

public class PilaDeFichas {

  private List<Ficha> fichasDomino = new ArrayList<Ficha>();

  public List<Ficha> getFichasDomino() {
    return fichasDomino;
  }

  public void remover() {
    Collections.shuffle(getFichasDomino());

  }

  public boolean contiene(Ficha contenida) {
    return getFichasDomino().contains(contenida);
  }


  public Ficha robar(Ficha robada) {
    Ficha encontrada = null;
    if (getFichasDomino().size() == 0) {
      System.out.println("Saque las fichas de la caja.");
    } else if (robada == null) {
      encontrada = getFichasDomino().get(10);
    } else {
      for (Ficha ficha : getFichasDomino()) {
        if (ficha.equals(robada)) {
          encontrada = ficha;
        }
      }
    }
    getFichasDomino().remove(encontrada);
    return encontrada;
  }



}
