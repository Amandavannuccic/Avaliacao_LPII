package br.gov.sp.bd.demoprojeto_spring2042.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "leiloes")
public class Leilao {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    
        @Column(nullable = false)
        private LocalDateTime dataOcorrencia;
    
        @Column(nullable = false)
        private LocalDateTime dataVisitacao;
    
        @Column(nullable = false)
        private String local;
    
        @Column(nullable = false)
        private String endereco;
    
        @Column(nullable = false)
        private String cidade;
    
        @Column(nullable = false)
        private String estado;
    
        @OneToMany(mappedBy = "leilao")
        private List<DispositivoInformatica> dispositivos;
    
        @OneToMany(mappedBy = "leilao")
        private List<Veiculo> veiculos;
}
