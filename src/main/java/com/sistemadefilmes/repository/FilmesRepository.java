package com.sistemadefilmes.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sistemadefilmes.entity.FilmesEntidade;

@Repository
public class FilmesRepository {
    private final List<FilmesEntidade> baseFilmes = new ArrayList<>();
}
