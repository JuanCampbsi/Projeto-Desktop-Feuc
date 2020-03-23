
package model;


public class Livro {
    
    public int codlivro;
    public String exemplar;
    public String autor;
    public String edicao;
   

    public Livro(int codlivro, String exemplar, String autor, String edicao) {
        this.codlivro = codlivro;
        this.exemplar = exemplar;
        this.autor = autor;
        this.edicao = edicao;
        
    }

    public Livro() {
    }   

    public int getCodlivro() {
        return codlivro;
    }

    public void setCodlivro(int codlivro) {
        this.codlivro = codlivro;
    }

    public String getExemplar() {
        return exemplar;
    }

    public void setExemplar(String exemplar) {
        this.exemplar = exemplar;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
 
    
    
}
