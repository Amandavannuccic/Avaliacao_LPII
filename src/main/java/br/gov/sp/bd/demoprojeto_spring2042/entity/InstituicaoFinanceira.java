package br.gov.sp.bd.demoprojeto_spring2042.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "instituicoes_financeiras")
public class InstituicaoFinanceira {
    
    @Id
    private String cnpj;
    
    @Column(nullable = false)
    private String nome;

}
