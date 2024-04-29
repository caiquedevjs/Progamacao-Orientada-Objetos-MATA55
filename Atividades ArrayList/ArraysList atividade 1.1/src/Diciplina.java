public class Diciplina {
    private String nome;
    private String codigo;
    private Integer carga_horaria;

    public Diciplina(String nome, String codigo, Integer carga_horaria) {
        this.nome = nome;
        this.codigo = codigo;
        this.carga_horaria = carga_horaria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Integer getCarga_horaria() {
        return carga_horaria;
    }
    public void setCarga_horaria(Integer carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    @Override
    public String toString() {
        return "Nome do Curso: " + nome + ", Código: " + codigo + ", Carga Horária: " + carga_horaria;
    }
}
