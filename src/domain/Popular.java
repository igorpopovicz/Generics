package domain;

public abstract class Popular implements Carro {

    private String nome;
    private String placa;
    private String cor;
    private Integer ano;

    public Popular(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCor() {
        return this.cor;
    }

    public Integer getAno() {
        return this.ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public String toString() {
        return "Popular [nome=" + nome + ", placa=" + placa + ", cor=" + cor + ", ano=" + ano + "]";
    }

}
