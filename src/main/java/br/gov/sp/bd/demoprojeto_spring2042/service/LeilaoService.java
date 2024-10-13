package br.gov.sp.bd.demoprojeto_spring2042.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.gov.sp.bd.demoprojeto_spring2042.entity.Leilao;
import br.gov.sp.bd.demoprojeto_spring2042.rository.LeilaoRepository;

@Service
public class LeilaoService {
    
    @Autowired
    private LeilaoRepository leilaoRepository;

    public List<Leilao> listar() {
        return leilaoRepository.findAll();
    }

    public Optional<Leilao> buscarPorId(Long id) {
        return leilaoRepository.findById(id);
    }

    public Leilao criar(Leilao leilao) {
        return leilaoRepository.save(leilao);
    }

    public Optional<Leilao> atualizar(Long id, Leilao leilao) {
        return leilaoRepository.findById(id).map(existingLeilao -> {
            existingLeilao.setDataOcorrencia(leilao.getDataOcorrencia());
            existingLeilao.setDataVisitacao(leilao.getDataVisitacao());
            existingLeilao.setLocal(leilao.getLocal());
            existingLeilao.setEndereco(leilao.getEndereco());
            existingLeilao.setCidade(leilao.getCidade());
            existingLeilao.setEstado(leilao.getEstado());
            return leilaoRepository.save(existingLeilao);
        });
    }

    public boolean deletar(Long id) {
        if (leilaoRepository.existsById(id)) {
            leilaoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
