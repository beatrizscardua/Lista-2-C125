public class Principal {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Beatriz", 1234567, 2);

        Endereco end1 = new Endereco("Rua sebastiao moreira da silva", "Jardim dos estados", 51);
        Endereco end2 = new Endereco("Rua papuana", "Coqueiral", 105);


        p1.addEndereco(end1);
        p1.addEndereco(end2);


        p1.mostraInfo();
    }

}
