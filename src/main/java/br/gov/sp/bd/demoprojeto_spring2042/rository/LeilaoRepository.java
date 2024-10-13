package br.gov.sp.bd.demoprojeto_spring2042.rository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.bd.demoprojeto_spring2042.entity.Leilao;

@Repository
public interface LeilaoRepository extends JpaRepository<Leilao, Long> {}
