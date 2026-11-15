public class Colaboradorcomissario extends Colaboradores {
    private  Double valorVendas;
    private Double percentualComissão;
   
    public void setValorVendas(Double valorVendas) {
        this.valorVendas = valorVendas;}

    public void setpercentualComissão(Double percentualComissão) {
        this.percentualComissão = percentualComissão;}
        
        @Override
        public Double calcularSalarioFinal() {
            Double salarioFinal = super.calcularSalarioFinal() + (valorVendas * percentualComissão);
            return salarioFinal;
        }
        @Override 
        public void exibirDados() {
            super.exibirDados();
            System.out.println("Tipo de colaborador:" + "comissário");
            System.out.println("Valor de Vendas: R$" + valorVendas);
            System.out.println("Percentual de Comissão: " + percentualComissão);
             System.out.println("\n\n\n");
        }
    }













