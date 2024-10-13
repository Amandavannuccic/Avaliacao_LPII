package br.gov.sp.bd.demoprojeto_spring2042.controller;

import br.gov.sp.bd.demoprojeto_spring2042.entity.Leilao;
import br.gov.sp.bd.demoprojeto_spring2042.service.LeilaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/leiloes")
public class LeilaoController {

    @Autowired
    private LeilaoService leilaoService;

    @GetMapping
    public List<Leilao> listar() {
        return leilaoService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Leilao> buscarPorId(@PathVariable Long id) {
        Optional<Leilao> leilao = leilaoService.buscarPorId(id);
        return leilao.map(ResponseEntity::ok)
                     .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Leilao> criar(@RequestBody Leilao leilao) {
        Leilao novoLeilao = leilaoService.criar(leilao);
        return ResponseEntity.status(201).body(novoLeilao); // 201 Created
    }

    @PutMapping("/{id}")
    public ResponseEntity<Leilao> atualizar(@PathVariable Long id, @RequestBody Leilao leilao) {
        Optional<Leilao> leilaoAtualizado = leilaoService.atualizar(id, leilao);
        return leilaoAtualizado.map(ResponseEntity::ok)
                               .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (leilaoService.deletar(id)) {
            return ResponseEntity.noContent().build(); // 204 No Content
        }
        return ResponseEntity.notFound().build(); // 404 Not Found
    }
}
