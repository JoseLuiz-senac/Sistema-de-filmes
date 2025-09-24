package com.sistemadefilmes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemadefilmes.entity.FilmesEntidade;
import com.sistemadefilmes.service.FilmesService;

@RestController
@CrossOrigin(
        origins={
            "http://localhost:5500",
            "http://127.0.0.1:5500",
            "http://localhost:3000",
            "http://127.0.0.1:3000"
    }
)
public class FilmesController {
    private final FilmesService filmesServico;

    public FilmesController(FilmesService Servico) {
        this.filmesServico = Servico;
    }
    
    @GetMapping("/filmes")
    public List<FilmesEntidade> listarTodos() {
        return filmesServico.ListarTodos();
    }

    @PostMapping("/filme")
    public FilmesEntidade adicionarFilme(FilmesEntidade filme) {
        return filmesServico.AdicionarFilme(filme);
    }

    @GetMapping("/filme/{id}")
    public FilmesEntidade listarPorId(int id) {
        return filmesServico.ListarPorId(id).orElse(null);
    }

    @GetMapping("/filme/nome/{nome}")
    public List<FilmesEntidade> listarPorNome(String nome) {
        return filmesServico.ListarporNome(nome);
    }

    @PostMapping("/filme/atualizar")
    public FilmesEntidade atualizarFilme(FilmesEntidade filme) {    
        return filmesServico.AtualizarFilme(filme);
    }

    @DeleteMapping("/filme/{id}")
    public boolean excluirFilme(int id) {
        return filmesServico.ExcluirFilme(id);
    }
}
