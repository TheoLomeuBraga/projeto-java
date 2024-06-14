// src/Main.java

import java.io.IOException;

public class Main {
    public static void save(){
        PessoaFisicaRepo pfr = new PessoaFisicaRepo();
        PessoaFisica pf = new PessoaFisica(0, "alam", 23, "12121212121212");
        pfr.inserir(pf);
        pf = new PessoaFisica(2, "ana", 43, "12121212121212");
        pfr.inserir(pf);
        try {
            pfr.save("PessoaFisicaRepo.bim");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        

        PessoaJuridicaRepo pjr = new PessoaJuridicaRepo();
        PessoaJuridica pj = new PessoaJuridica(0, "alam", "12121212121212");
        pjr.inserir(pj);
        pj = new PessoaJuridica(2, "alam", "12121212121212");
        pjr.inserir(pj);
        try {
            pjr.save("PessoaJuridicaRepo.bim");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void read(){
        
    }
    public static void main(String[] args) {
        save();
        read();
    }
}
