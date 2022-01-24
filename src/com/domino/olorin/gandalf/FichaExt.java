package com.domino.olorin.gandalf;

import com.github.cards.Card;

public class FichaExt extends Card implements Ficha {

  public FichaExt(int suit, int rank) {
    super(suit, rank);
  }

  @Override
  public int getNumero1() {
    return getSuit();
  }

  @Override
  public int getNumero2() {
    return getRank();
  }

  // hago ñapa para que no me aparezcan los palos de las cartas francesas, si no sería
  // getSuitString()
  @Override
  public String getToStringNumero1() {
    return getSuit() + "";
  }

  @Override
  public String getToStringNumero2() {
    return getRankString();
  }

  @Override
  public String toString() {
    String toString1;
    if (getNumero1() == getNumero2()) {
      toString1 = "pair of " + getToStringNumero1();
    } else
      toString1 = getToStringNumero1() + " (|) " + getToStringNumero2();
    return toString1;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    return true;
  }

  // no añado el compare to porque lo he subido a la interfaz


}
