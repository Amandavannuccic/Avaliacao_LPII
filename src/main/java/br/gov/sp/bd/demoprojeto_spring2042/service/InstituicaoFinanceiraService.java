package br.gov.sp.bd.demoprojeto_spring2042.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.bd.demoprojeto_spring2042.entity.InstituicaoFinanceira;
import br.gov.sp.bd.demoprojeto_spring2042.rository.InstituicaoFinanceiraRepository;

@Service
public class InstituicaoFinanceiraService {
    @Autowired
    private InstituicaoFinanceiraRepository instituicaoFinanceiraRepository;

    public List<InstituicaoFinanceira> findAll() {
        return instituicaoFinanceiraRepository.findAll(); // Aqui estamos usando o repositório
    }

    public InstituicaoFinanceira findById(String cnpj) {
        return instituicaoFinanceiraRepository.findById(cnpj).orElse(null); // Aqui também
    }

    public InstituicaoFinanceira save(InstituicaoFinanceira instituicao) {
        return instituicaoFinanceiraRepository.save(instituicao);
    }

    public void deleteById(String cnpj) {
        instituicaoFinanceiraRepository.deleteById(cnpj);
    }
}