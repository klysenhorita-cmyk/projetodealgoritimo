public class Colaboradorproduçao  extends Colaboradores {
    private Double valorProdução;
    private Double percentualProdução;

    public void setValorProdução(Double valorProdução) {
        this.valorProdução = valorProdução;
    }

    public void setPercentualProdução(Double percentualProdução) {
        this.percentualProdução = percentualProdução;
    }

    @Override
    public Double calcularSalarioFinal() {
        Double salarioFinal = super.calcularSalarioFinal() + (valorProdução * percentualProdução);
        return salarioFinal;
    }
     @Override 
        public void exibirDados() {
            super.exibirDados();
            System.out.println("Tipo de colaborador:" + "Produçao");
            System.out.println("Valor de Produção: R$" + valorProdução);
            System.out.println("Percentual de Produção: " + percentualProdução);
             System.out.println("\n\n\n");
}
