package seminarioexemplomoeda;

public class Moeda25 extends MoedaChain {

    private int qtdMoeda;

    public Moeda25() {
        super(IdMoeda.Moeda25);
    }

    @Override
    protected void inserirMoeda() {
        qtdMoeda++;
        System.out.println("Moeda de 25 inserida");
    }

    @Override
    protected void resumoMoeda() {
        System.out.println("Moeda de 25");
        System.out.println("Quantidade de moeda: " + qtdMoeda + " | Valor Moeda:" + (qtdMoeda * 25));//50 Valor
    }

    @Override
    protected float totalMoeda() {
        return qtdMoeda * 25;
    }
}
