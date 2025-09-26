package com.sistemadefilmes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public FilmesEntidade adicionarFilme(@RequestBody FilmesEntidade filme) {
        return filmesServico.AdicionarFilme(filme);
    }

    @GetMapping("/filme/{id}")
    public FilmesEntidade listarPorId( @PathVariable int id) {
        return filmesServico.ListarPorId(id).orElse(null);
    }

    @GetMapping("/filme/nome/{nome}")
    public List<FilmesEntidade> listarPorNome(@PathVariable String nome) {
        return filmesServico.ListarporNome(nome);
    }

    @PutMapping("/filme/atualizar")
    public FilmesEntidade atualizarFilme(@RequestBody FilmesEntidade filme) {    
        return filmesServico.AtualizarFilme(filme);
    }

    @DeleteMapping("/filme/{id}")
    public String excluirFilme(@PathVariable int id) {
        boolean filmeExcluido = filmesServico.ExcluirFilme(id);

        return filmeExcluido ? "Filme excluído com sucesso." : "Filme não encontrado.";
    }
}
