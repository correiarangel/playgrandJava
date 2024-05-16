package br.com.comparablevscomparator.livro;

import java.util.Comparator;

public class CompararAno implements Comparator<Livro> {
   @Override
    public int compare(Livro l1, Livro l2) {
        return Integer.compare(l1.getAno(), l2.getAno());
    }


}
