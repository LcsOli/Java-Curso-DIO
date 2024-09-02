package Estados;

public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo",35),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 33),
    MINAS_GERAIS("MG", "Minas Gerais",31),
    ESPIRITO_SANTO("ES", "Espirito Santo",32),
    PARANA("PR", "Paraná",42);

    private String nome;
    private String sigla;
    private int ibge;

    
    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    public int getIbge() {
        return ibge;
    }


}