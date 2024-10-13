package br.gov.sp.bd.demoprojeto_spring2042.dto;


public class DispositivoDTO {
    private Long id;
    private String tipo; // Notebook, Monitor, etc.
    private String marca;
    private String modelo;
    private String numeroSerie;

    
    public DispositivoDTO(Long id, String tipo, String marca, String modelo, String numeroSerie) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getNumeroSerie() {
        return numeroSerie;
    }


    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

}
