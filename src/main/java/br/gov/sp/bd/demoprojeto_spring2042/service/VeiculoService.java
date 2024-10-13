package br.gov.sp.bd.demoprojeto_spring2042.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.bd.demoprojeto_spring2042.entity.Veiculo;
import br.gov.sp.bd.demoprojeto_spring2042.rository.VeiculoRepository;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository;

    // Método para obter todos os veículos
    public List<Veiculo> findAll() {
        return veiculoRepository.findAll();
    }

    // Método para encontrar um veículo por ID
    public Optional<Veiculo> findById(Long id) {
        return veiculoRepository.findById(id);
    }

    // Método para criar ou atualizar um veículo
    public Veiculo save(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    // Método para deletar um veículo por ID
    public void deleteById(Long id) {
        veiculoRepository.deleteById(id);
    }
}