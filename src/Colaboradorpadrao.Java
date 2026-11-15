import java.util.Scanner; {

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
    Super.exibirDados();
    System.out.println("\n\n\n");
}




    }
    







}
