package POO;

public class ProgramaPrincipal {
    public static void main(String[] args){

        //Criar uma pessoa -> instanciar (new)
        //tipo(classe) var = new classe()
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Laécio");      
        pessoa1.setIdade(21);      
        pessoa1.setAltura(1.75);      
        pessoa1.setPeso(65.4);     


        System.out.println(pessoa1.getNome()+ " têm " + pessoa1.getIdade() +" anos e "+ pessoa1.getAltura() + " de altura e " + pessoa1.getPeso() + " de peso.");
    }
}
