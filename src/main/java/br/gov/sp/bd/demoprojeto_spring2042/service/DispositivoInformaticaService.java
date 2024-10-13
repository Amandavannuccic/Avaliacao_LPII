package br.gov.sp.bd.demoprojeto_spring2042.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.bd.demoprojeto_spring2042.entity.DispositivoInformatica;
import br.gov.sp.bd.demoprojeto_spring2042.rository.DispositivoInformaticaRepository;

@Service
public class DispositivoInformaticaService {

    @Autowired
    private DispositivoInformaticaRepository repository;

    public List<DispositivoInformatica> findAll() {
        return repository.findAll();
    }

    public DispositivoInformatica findById(String cnpj) {
        return repository.findById(cnpj).orElse(null);
    }

    public DispositivoInformatica save(DispositivoInformatica dispositivo) {
        return repository.save(dispositivo);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
