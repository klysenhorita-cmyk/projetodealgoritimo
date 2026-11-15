

public class Principal {
   
   
    public static void main(String[] args) {

        Colaboradores colaboradorpadrao = new Colaboradores();
        colaboradorpadrao.setNome("jose ");
        colaboradorpadrao.setMatricula("145");
        Double salarioFinal1 = colaboradorpadrao.calcularSalarioFinal();
        colaboradorpadrao.setSalarioFinal(salarioFinal1);
        colaboradorpadrao.exibirDados();
     

        Colaboradores colaboradorcomissario = new Colaboradorcomissario();
        colaboradorcomissario.setNome("bia ");
        colaboradorcomissario.setMatricula("987");
        ((Colaboradorcomissario) colaboradorcomissario).setValorVendas(4000.0);
        ((Colaboradorcomissario) colaboradorcomissario).setpercentualComissão( 0.10);
        Double salarioFinal2 = colaboradorcomissario.calcularSalarioFinal();
        colaboradorcomissario.setSalarioFinal(salarioFinal2);
        colaboradorcomissario.exibirDados();
        
        Colaboradores colaboradorprodução = new Colaboradorproduçao();
        colaboradorprodução.setNome("ana ");
        colaboradorprodução.setMatricula("456");
        ((Colaboradorproduçao) colaboradorprodução).setValorProdução(560.0);
        ((Colaboradorproduçao) colaboradorprodução).setPercentualProdução(0.05);
        Double salarioFinal3 = colaboradorprodução.calcularSalarioFinal();
        colaboradorprodução.setSalarioFinal(salarioFinal3);
        colaboradorprodução.exibirDados();





    }


}
