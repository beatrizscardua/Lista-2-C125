public class Endereco {

    public String nome;
    public int cpf;
    public int qtdEnd;
    public Endereco[] enderecos = new Endereco[5];

    public Pessoa(String nome, int cpf, int qtdEnd){
        this.nome = nome;
        this.cpf = cpf;
        this.qtdEnd = qtdEnd;
    }

    public static int countEnd = 0;
    public void addEndereco(Endereco end){
        if(countEnd < qtdEnd){
            enderecos[countEnd] = end;
            countEnd++;
        }else{
            System.out.println("Não foi possível adicionar mais endereços");
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        for(int i = 0; i< qtdEnd; i++){
            if(enderecos[i]!=null) {
                System.out.println("Enderecos: ")
                System.out.println(enderecos[i].rua());
                System.out.println(enderecos[i].bairro());
                System.out.println(enderecos[i].num());
                System.out.println(" ");
            }

        }
    }

}
