import java.util.ArrayList;

class Agenda {
    public final ArrayList<Contato> contatos = new ArrayList<>();


    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContatoPeloNome(String nome) {
        contatos.removeIf(contato -> contato.getNome().equals(nome));
    }

    public void removerContatoPeloTelefone(String telefone) {
        contatos.removeIf(contato -> contato.getTelefone().equals(telefone));
    }

    public void alterarTelefoneDoContatoPeloNome(String nome, String novoTelefone) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contato.telefone = novoTelefone;
                break;
            }
        }
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        }
    }

    public int quantidadeTotalContatos() {
        return contatos.size();
    }
}