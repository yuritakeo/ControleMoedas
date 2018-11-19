package seminarioexemplomoeda;

public class Moeda5 extends MoedaChain {

    private int qtdMoeda;

    public Moeda5() {
        super(IdMoeda.Moeda5);
    }

    @Override
    protected void inserirMoeda() {
        qtdMoeda++;
        System.out.println("Moeda de 5 inserida");
    }

    @Override
    protected void resumoMoeda() {
        System.out.println("Moeda de 5");
        System.out.println("Quantidade de moeda: " + qtdMoeda + " | Valor Moeda:" + (qtdMoeda * 5));//50 Valor
    }

}
