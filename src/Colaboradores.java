public  class Colaboradores {
     
    private  String nome ;
    private  String matricula ;
    private  Double  salarioBase = 2000.0 ;
    private  Double salarioFinal = ( salarioBase );



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Double getSalarioFinal() {
        return salarioFinal;
    }
    public void setSalarioFinal(Double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    void exibirDados() {
        System.out.println("Nome:" + nome);
        System.out.println( "Matricula:" + matricula);
        System.out.println("Salario :"+ salarioBase);
        System.out.println("Salário Final: " + salarioFinal);

    }
    public Double calcularSalarioFinal() {
        Double salarioFinal = ( salarioBase);
        return salarioFinal;
    }
} 


  


