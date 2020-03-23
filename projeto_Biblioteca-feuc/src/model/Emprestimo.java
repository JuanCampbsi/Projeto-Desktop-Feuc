
package model;

public class Emprestimo {
    
    private int codemprestimo;
    private int codcliente;
    private int codlivro;
    private String dataemprestimo;
    private String datadevolucao;

    public Emprestimo() {
    }   

    public Emprestimo(int codemprestimo, int codcliente, int codlivro, String dataemprestimo, String datadevolucao) {
        this.codemprestimo = codemprestimo;
        this.codcliente = codcliente;
        this.codlivro = codlivro;
        this.dataemprestimo = dataemprestimo;
        this.datadevolucao = datadevolucao;
    }

    public int getCodemprestimo() {
        return codemprestimo;
    }

    public void setCodemprestimo(int codemprestimo) {
        this.codemprestimo = codemprestimo;
    }

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    public int getCodlivro() {
        return codlivro;
    }

    public void setCodlivro(int codlivro) {
        this.codlivro = codlivro;
    }

    public String getDataemprestimo() {
        return dataemprestimo;
    }

    public void setDataemprestimo(String dataemprestimo) {
        this.dataemprestimo = dataemprestimo;
    }

    public String getDatadevolucao() {
        return datadevolucao;
    }

    public void setDatadevolucao(String datadevolucao) {
        this.datadevolucao = datadevolucao;
    }
    

    
    
   }
