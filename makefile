classes = src/PessoaFisica.java src/PessoaJuridica.java src/CSVManager.java src/PessoaFisicaRepo.java src/PessoaJuridicaRepo.java

all:
	javac -d out src/Pessoa.java $(classes)  src/Main.java
	java -cp out Main
