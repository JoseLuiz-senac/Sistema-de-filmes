package com.sistemadefilmes.entity;

public class FilmesEntidade {
    
    private Long id;
    private String nome;
    private String genero;
    private int anoLancamento;
    private String diretor;
    private double nota; 


    public FilmesEntidade(String nome, String genero, int anoLancamento, String diretor, double nota) {
        this.nome = nome;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
