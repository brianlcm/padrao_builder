public class AutomovelBuilder {

    private Automovel automovel;

    public AutomovelBuilder() {automovel = new Automovel();}

    public Automovel build() {
        if (automovel.getCodigo() == 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (automovel.getModelo().equals("")) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        return automovel;
    }

    public AutomovelBuilder setCodigo(int codigo) {
        automovel.setCodigo(codigo);
        return this;
    }

    public AutomovelBuilder setModelo(String modelo) {
        automovel.setModelo(modelo);
        return this;
    }

    public AutomovelBuilder setAno(int ano) {
        automovel.setAno(ano);
        return this;
    }

    public AutomovelBuilder setMarca(String marca) {
        automovel.setMarca(marca);
        return this;
    }

    public AutomovelBuilder setDescricao(String descricao) {
        automovel.setDescricao(descricao);
        return this;
    }

    public AutomovelBuilder setPortas(int portas) {
        automovel.setPortas(portas);
        return this;
    }

    public AutomovelBuilder setCombustivel(String combustivel) {
        automovel.setCombustivel(combustivel);
        return this;
    }

    public AutomovelBuilder setValor(float valor) {
        automovel.setValor(valor);
        return this;
    }

    public AutomovelBuilder setPlaca(String placa) {
        automovel.setPlaca(placa);
        return this;
    }

    public AutomovelBuilder setMecanicoResponsavel(String mecanicoResponsavel) {
        automovel.setMecanicoResponsavel(mecanicoResponsavel);
        return this;
    }

    public AutomovelBuilder setKm(int km) {
        automovel.setKm(km);
        return this;
    }

    public AutomovelBuilder setStatus(String status) {
        automovel.setStatus(status);
        return this;
    }

    public AutomovelBuilder setCor(String cor) {
        automovel.setCor(cor);
        return this;
    }

    public AutomovelBuilder setObservacoes(String observacoes) {
        automovel.setObservacoes(observacoes);
        return this;
    }


}
