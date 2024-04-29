import java.util.ArrayList;

public class Professor {
    private String nome;
    private String titulacao;
    private String depatarmento;
    private final ArrayList<Diciplina> diciplinas;

    public Professor(String nome, String titulacao, String depatarmento) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.depatarmento = depatarmento;
        this.diciplinas = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public String getTitulacao() {
        return titulacao;
    }
    public String getDepatarmento() {
        return depatarmento;
    }
    public ArrayList<Diciplina> getDiciplinas() {
        return diciplinas;
    }

    public void addDiciplina(Diciplina diciplina) {
        this.diciplinas.add(diciplina);
    }

    public void listarDiciplinas() {
        for (Diciplina disciplina : this.diciplinas) {
            System.out.println(disciplina);
        }
    }
}

