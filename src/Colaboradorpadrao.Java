

public class Colaboradorpadrao extends Colaboradores {

        private Double salarioBase;


        public Colaboradorpadrao(Double salarioBase) {
            this.salarioBase = salarioBase;
        }

        public Double calcularSalarioFinal() {
            return super.calcularSalarioFinal();
        }
@Override
public void exibirDados() {
    super.exibirDados();
    System.out.println("Tipo de colaborador:" + "Padrao");
}




    }
    







}
