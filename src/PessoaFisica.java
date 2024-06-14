public class PessoaFisica  extends Pessoa {
    public int idade;
    public String cpf;
    public void exibir(){
        System.out.println(id + " " + nome + " " + idade);
    }
    public PessoaFisica(int id, String nome,int idade,String cpf) {
		super(id, nome);
        this.idade = idade;
	}

    public PessoaFisica(String[] data) {
        super(Integer.parseInt(data[0]), data[1]);
        this.idade = Integer.parseInt(data[2]);
    }

    public String[] toStrings() {
        return new String[]{String.valueOf(id), nome, String.valueOf(idade)};
    }

}
