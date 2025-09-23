package com.sistemadefilmes.service;

import com.sistemadefilmes.entity.FilmesEntidade;
import com.sistemadefilmes.repository.FilmesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class FilmesService {
    private final FilmesRepository filmesRepository;

    public FilmesService(FilmesRepository repo) {
        this.filmesRepository = repo;
    }

    public list<Filmes> ListarTodos() {
        return filmesRepository.findAll();
    }
    
}
