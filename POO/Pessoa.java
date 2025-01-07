package POO;
 // Criar novos objetos para poder fazer ações no programa com eles
 //Interação entre objetos

 //Classe -> objeto
 //Molde do objeto = classe
 //Cria um novo objeto = instancia

public class Pessoa {
    // Atributos da classe
    private String nome;
    private int idade;
    private double altura;
    private double peso;


    public Pessoa(){
        this.nome = "Sem nome";
        this.idade = 0;
        this.altura = 0;
        this.peso = 0;
    }

    // Métodos = ações da classe
    // setters e getters

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }
}