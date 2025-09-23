package com.sistemadefilmes.repository;

import com.sistemadefilmes.entity.FilmesEntidade;
import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class FilmesRepository {
    private final List<Filmes> baseFilmes = new ArrayList<>();
}
