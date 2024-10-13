package br.gov.sp.bd.demoprojeto_spring2042.dto;

import java.time.LocalDateTime;

public class LeilaoDTO {
    private Long id;
    private LocalDateTime dataOcorrencia;
    private LocalDateTime dataVisitacao;
    private String local;
    private String endereco;
    private String cidade;
    private String estado;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getDataOcorrencia() {
        return dataOcorrencia;
    }
    public void setDataOcorrencia(LocalDateTime dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }
    public LocalDateTime getDataVisitacao() {
        return dataVisitacao;
    }
    public void setDataVisitacao(LocalDateTime dataVisitacao) {
        this.dataVisitacao = dataVisitacao;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
