package com.domino.olorin.gandalf;


// la interfaz comparable es a mano!!!!!
public interface Ficha extends Comparable<Ficha> {

  int getNumero1();

  int getNumero2();

  String getToStringNumero1();

  String getToStringNumero2();


  default int compareTo(Ficha otraFicha) {
    int resultado = Integer.compare(getNumero1(), otraFicha.getNumero1());
    if (resultado == 0) {
      resultado = Integer.compare(getNumero2(), otraFicha.getNumero2());
    }
    return resultado;
  }



}
