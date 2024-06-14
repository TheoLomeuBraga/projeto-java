public class PessoaJuridica extends Pessoa {
    public String cnpj;
    public void exibir(){
        System.out.println(id + " " + nome + " " + cnpj);
    }
    public PessoaJuridica(int id, String nome,String cnpj) {
		super(id, nome);
        this.cnpj = cnpj;
	}

    public PessoaJuridica(String[] data) {
        super(Integer.parseInt(data[0]), data[1]);
        this.cnpj = data[2];
    }

    public String[] toStrings() {
        return new String[]{String.valueOf(id), nome, String.valueOf(cnpj)};
    }

}
