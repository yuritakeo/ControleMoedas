package seminarioexemplomoeda;

public class Moeda50 extends MoedaChain {

    private int qtdMoeda;

    public Moeda50() {
        super(IdMoeda.Moeda50);
    }

    @Override
    protected void inserirMoeda() {
        qtdMoeda++;
        System.out.println("Moeda de 50 inserida");
    }

    @Override
    protected void resumoMoeda() {
        System.out.println("Moeda de 50");
        System.out.println("Quantidade de moeda: " + qtdMoeda + " | Valor Moeda:" + (qtdMoeda * 50));//50 Valor
    }

}
