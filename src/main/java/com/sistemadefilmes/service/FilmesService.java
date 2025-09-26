package com.sistemadefilmes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sistemadefilmes.entity.FilmesEntidade;
import com.sistemadefilmes.repository.FilmesRepository;

@Service
public class FilmesService {
    private final FilmesRepository FilmesRepository;
    
    //Metodo construtor
    public FilmesService(FilmesRepository repo) {
        this.FilmesRepository = repo;
    }

    //Metodo de listar todos
    public List<FilmesEntidade> ListarTodos() {
        return FilmesRepository.findAll();
    }

    //Metodo de listar por id
    public Optional<FilmesEntidade> ListarPorId(int id) {
        return FilmesRepository.findById(id);
    }

    //Metodo de listar por nome
    public List<FilmesEntidade> ListarporNome(String nome) {
        return FilmesRepository.findByNameContaining(nome);
    }
    

    //Metodo de adicionar filme
    public FilmesEntidade AdicionarFilme(FilmesEntidade filme) {
        return FilmesRepository.save(filme);
    }

    //Metodo de atualizar filme
    public FilmesEntidade AtualizarFilme(FilmesEntidade filme) {

        if (filme.getNome().isBlank()){
            throw new IllegalArgumentException("O nome do filme não encontrado ou não pode ser vazio.");
        }
        return FilmesRepository.save(filme);
    }

    //Metodo de deletar filme
    public boolean ExcluirFilme(int id) {
        return FilmesRepository.deleteById(id);
    }

}
