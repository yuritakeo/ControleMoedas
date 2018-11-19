package seminarioexemplomoeda;

public class Moeda10 extends MoedaChain {

    private int qtdMoeda;

    public Moeda10() {
        super(IdMoeda.Moeda10);
    }

    @Override
    protected void inserirMoeda() {
        qtdMoeda++;
        System.out.println("Moeda de 10 inserida");
    }

    @Override
    protected void resumoMoeda() {
        System.out.println("Moeda de 10");
        System.out.println("Quantidade de moeda: " + qtdMoeda + " | Valor Moeda:" + (qtdMoeda * 10));//50 Valor
    }

    @Override
    protected float totalMoeda() {
        return qtdMoeda * 10;
    }
}
