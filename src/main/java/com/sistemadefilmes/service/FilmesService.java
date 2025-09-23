package com.sistemadefilmes.service;

import com.sistemadefilmes.entity.FilmesEntidade;
import com.sistemadefilmes.repository.FilmesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class FilmesService {
    private final FilmesRepository filmesRepository;

    //Metodo construtor
    public FilmesService(FilmesRepository repo) {
        this.filmesRepository = repo;
    }

    //Metodo de listar todos
    public list<Filmes> ListarTodos() {
        return filmesRepository.findAll();
    }

    //Metodo de listar por id
    public Optional<Filmes> ListarPorId(Long id) {
        return filmesRepository.findById(id);
    }

    //Metodo de listar por nome
    public list<Filmes> ListarporNome(String nome) {
        return filmesRepository.findByNome(nome);
    }
    

    //Metodo de adicionar filme
    public Filmes AdicionarFilme(Filmes filme) {
        return filmesRepository.save(filme);
    }

    //Metodo de atualizar filme
    public Filmes AtualizarFilme(Filmes filme) {

        if (filme.getnome().isBlank()){
            throw new IllegalArgumentException("O nome do filme não encontrado ou não pode ser vazio.");
        }
        return filmesRepository.save(filme);
    }

    //Metodo de deletar filme
    public boolean ExcluirFilme(long id) {
        return filmesRepository.deleteById(id);
    }

}
