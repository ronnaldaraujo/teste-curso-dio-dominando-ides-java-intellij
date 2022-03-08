package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("Você nasceu rico",  300);
        System.out.println(livro);

       /* int a = 5;
        int b = 3;
        System.out.println("Hello World " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String none, Integer numPaginas) {
        this.nome = none;
        this.numPaginas = numPaginas;
    }

    public String getNone() {
        return nome;
    }

    public void setNone(String none) {
        this.nome = none;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "none='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

