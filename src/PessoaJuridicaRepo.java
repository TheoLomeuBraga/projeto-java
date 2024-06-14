import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaJuridicaRepo {
    private List<PessoaJuridica> pessoas = new ArrayList<>();

    public void inserir(PessoaJuridica pessoa) {
        pessoas.add(pessoa);
    }

    public void alterar(PessoaJuridica pessoa) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).id == (pessoa.id)) {
                pessoas.set(i, pessoa);
                return;
            }
        }
    }

    public void excluir(int id) {
        pessoas.removeIf(pessoa -> pessoa.id == (id));
    }

    public PessoaJuridica obter(int id) {
        for (PessoaJuridica pessoa : pessoas) {
            if (pessoa.id == (id)) {
                return pessoa;
            }
        }
        return null; 
    }

    public List<PessoaJuridica> obterTodos() {
        return new ArrayList<>(pessoas);
    }

    public void persistir(String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(pessoas);
        }
    }

    public void recuperar(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            pessoas = (ArrayList<PessoaJuridica>) ois.readObject();
        }
    }

    public void save(String fileName) throws IOException {
        persistir(fileName);
    }

    public void load(String fileName) throws IOException {
        try {
            recuperar(fileName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
