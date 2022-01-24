package com.domino;

import com.domino.olorin.gandalf.FichaExt;
import com.domino.olorin.gandalf.FichaImpl;
import com.domino.olorin.gandalf.PilaDeFichas;


public class Juego {

  public static void main(String[] args) {
    int numeroMaxDominoEspañol = 6;
    PilaDeFichas dominoEspañol = new PilaDeFichas();
    for (int i = 0; i <= numeroMaxDominoEspañol; i++) {
      for (int j = 0; j <= i && j <= numeroMaxDominoEspañol; j++) {
        dominoEspañol.getFichasDomino().add(new FichaImpl(j, i));
      }
    }
    dominoEspañol.getFichasDomino().forEach(System.out::println);
    dominoEspañol.remover();
    dominoEspañol.getFichasDomino().forEach(System.out::println);
    System.out.println("\n \n");
    FichaImpl fichaEspañol = new FichaImpl(5, 6);
    System.out.println("¿la ficha " + fichaEspañol + " esta en el juego? ==> "
        + dominoEspañol.contiene(fichaEspañol));
    System.out.println("Robo la ficha " + dominoEspañol.robar(fichaEspañol));
    dominoEspañol.getFichasDomino().forEach(System.out::println);
    dominoEspañol.getFichasDomino().sort(null);
    dominoEspañol.getFichasDomino().forEach(System.out::println);

    System.out.println("\n \n");
    int numeroMaxDominoBritish = 10;
    PilaDeFichas dominoBritish = new PilaDeFichas();
    for (int i = 0; i <= numeroMaxDominoBritish; i++) {
      for (int j = 0; j <= i && j <= numeroMaxDominoBritish; j++) {
        dominoBritish.getFichasDomino().add(new FichaExt(i, j));
      }
    }

    dominoBritish.getFichasDomino().forEach(System.out::println);
    System.out.println("\n \n");
    dominoBritish.remover();
    dominoBritish.getFichasDomino().forEach(System.out::println);


    System.out.println("\n \n");
    dominoBritish.getFichasDomino().sort(null);
    dominoBritish.getFichasDomino().forEach(System.out::println);
    System.out.println("\n \n");
    // i siempre tiene que ser mayor que j!!!!!!! si lo pones al reves siempre va a salir carta
    // erronea
    FichaExt fichaBritish = new FichaExt(10, 9);
    System.out.println("ATENCION fallo intencionado");
    System.out.println("¿la ficha " + fichaBritish + " esta en el juego español? ==> "
        + dominoEspañol.contiene(fichaBritish));
    System.out.println("¿la ficha " + fichaBritish + " esta en el juego britanico? ==> "
        + dominoBritish.contiene(fichaBritish));
    System.out.println("Robo la ficha " + dominoBritish.robar(fichaBritish));
    dominoBritish.getFichasDomino().forEach(System.out::println);

  }
}


