package br.com.comparablevscomparator.livro;

import java.util.Comparator;

public class CompararAnoAutorTitulo implements Comparator<Livro> {
    @Override
    public int compare(Livro livro1, Livro livro2) {
        int ano = Integer.compare(livro1.getAno(), livro2.getAno());
        if (ano != 0)
            return ano;
        int autor = livro1.getAutor().compareTo(livro2.getAutor());
        if (autor != 0)
            return autor;
        return livro1.getTitulo().compareTo(livro2.getTitulo());
    }

}
