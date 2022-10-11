import java.util.Date;

public class Automovel {

    private int codigo;
    private String modelo;
    private int ano;
    private String marca;
    private String descricao;
    private int portas;
    private String combustivel;
    private float valor;
    private String placa;
    private String mecanicoResponsavel;
    private int km;
    private String status;
    private String cor;
    private String observacoes;

    public Automovel() {
        this.codigo = 0;
        this.modelo = "";
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMecanicoResponsavel(String mecanicoResponsavel) {
        this.mecanicoResponsavel = mecanicoResponsavel;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPortas() {
        return portas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public float getValor() {
        return valor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMecanicoResponsavel() {
        return mecanicoResponsavel;
    }

    public int getKm() {
        return km;
    }

    public String getStatus() {
        return status;
    }

    public String getCor() {
        return cor;
    }

    public String getObservacoes() {
        return observacoes;
    }

}
