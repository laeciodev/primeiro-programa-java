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

    //função construtora
    public Pessoa(){
        this.nome = "Sem nome";
        this.idade = 0;
        this.altura = 0;
        this.peso = 0;
    }

    //funçao construtora com atributos
    public Pessoa(String nome, int idade, double altura, double peso){
        this.nome =  nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
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

    public double calcularImc(){
        return peso / (altura * altura);
    }

    public String classificacaoDeImc(){
        double imc = calcularImc();

        if(imc < 18.5) return "Abaixo do peso";
        if(imc < 25.0) return "Peso normal";
        if(imc < 30) return "Sobrepeso";
        return "Obesidade";
    }

    public String apresentar(){
        return "Olá, me chamo " + nome + ", eu tenho " + idade + " anos, e tenho " + altura + " de altura, e peso " + peso; 
    }
}