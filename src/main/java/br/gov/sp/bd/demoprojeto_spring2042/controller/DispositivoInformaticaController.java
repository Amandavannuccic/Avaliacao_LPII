package br.gov.sp.bd.demoprojeto_spring2042.controller;

import br.gov.sp.bd.demoprojeto_spring2042.entity.DispositivoInformatica;
import br.gov.sp.bd.demoprojeto_spring2042.service.DispositivoInformaticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dispositivos")
public class DispositivoInformaticaController {

    @Autowired
    private DispositivoInformaticaService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DispositivoInformatica>> getAllDispositivos() {
        List<DispositivoInformatica> dispositivos = service.findAll();
        return ResponseEntity.ok(dispositivos);
    }

    @GetMapping(value = "/{cnpj}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DispositivoInformatica> getDispositivoById(@PathVariable String cnpj) {
        DispositivoInformatica dispositivo = service.findById(cnpj);
        return ResponseEntity.ok(dispositivo);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DispositivoInformatica> createDispositivo(@RequestBody DispositivoInformatica dispositivo) {
        DispositivoInformatica savedDispositivo = service.save(dispositivo);
        return ResponseEntity.ok(savedDispositivo);
    }

    @PutMapping(value = "/{cnpj}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DispositivoInformatica> updateDispositivo(@PathVariable String cnpj, @RequestBody DispositivoInformatica dispositivo) {
        dispositivo.setCnpj(cnpj);
        DispositivoInformatica updatedDispositivo = service.save(dispositivo);
        return ResponseEntity.ok(updatedDispositivo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDispositivo(@PathVariable String id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
