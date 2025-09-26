package com.sistemadefilmes.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.sistemadefilmes.entity.FilmesEntidade;

@Repository
public class FilmesRepository {
    private final List<FilmesEntidade> baseFilmes = new ArrayList<>();

    public FilmesRepository() {
        baseFilmes.add(new FilmesEntidade(1,"Dragon ball Super: Broly", "Ação", 2018, "Tatsuya Nagamine", 10.0));
        baseFilmes.add(new FilmesEntidade(2,"Rampage", "Ação", 2018, "brad peyton", 7.6));
        baseFilmes.add(new FilmesEntidade(3,"se beber nao case", "Comédia", 2009, "todd phillips", 8.3));
        baseFilmes.add(new FilmesEntidade(4,"crepusculo", "Romance", 2008, "catharine hardwicke", 0.3));
        baseFilmes.add(new FilmesEntidade(5,"Cidade de Deus", "Drama", 2002, "Fernando meireles", 8.4));
        baseFilmes.add(new FilmesEntidade(6,"Amor e outras drogas", "Romance", 2011, "edward zwick", 9.4));
        baseFilmes.add(new FilmesEntidade(7,"As Aventuras de Nathanzin do Grau", "ficção Policial", 2013, "Adenilza", 10.0));
    }

    //Buscar todos os filmes
    public List<FilmesEntidade> findAll() {
        return new ArrayList<>(baseFilmes);
    }

    //Buscar filme pelo ID
    public Optional<FilmesEntidade> findById(int id) {
        return baseFilmes.stream()
                .filter(filme -> filme.getId() == id)
                .findFirst();
    }

    //Buscar filme pelo nome
    public List<FilmesEntidade> findByNameContaining(String nome) {
        List<FilmesEntidade> resultados = new ArrayList<>();
        for (FilmesEntidade filme : baseFilmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                resultados.add(filme);
            }
        }
        return resultados;
    }

    //Salvar um novo filme
    public FilmesEntidade save(FilmesEntidade filme) {
        baseFilmes.add(filme);
        return filme;
    }

    //Deletar um filme pelo ID
    public boolean deleteById(long id) {
        return baseFilmes.removeIf(filme -> filme.getId() == id);
    }
}
