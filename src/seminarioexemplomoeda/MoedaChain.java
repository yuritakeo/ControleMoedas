package seminarioexemplomoeda;

public abstract class MoedaChain {

    protected MoedaChain proximo;
    protected IdMoeda identificadorMoeda;

    public MoedaChain(IdMoeda id) {
        proximo = null;
        identificadorMoeda = id;
    }

    public void setNext(MoedaChain tipoMoeda) {
        if (proximo == null) {
            proximo = tipoMoeda;
        } else {
            proximo.setNext(tipoMoeda);
        }
    }

    private boolean mesmoTipoDeMoeda(IdMoeda id) {
        return identificadorMoeda == id;
    }

    //metodo inserir moeda
    public void inserirMoeda(IdMoeda id) throws Exception {
        if (mesmoTipoDeMoeda(id)) {
            inserirMoeda();
        } else {
            if (proximo == null) {
                throw new Exception("Moeda não cadastrada");
            }
            proximo.inserirMoeda(id);
        }
    }

    protected abstract void inserirMoeda();

    //metodos de resumo moeda
    public void resumoMoeda(IdMoeda id) throws Exception {
        if (mesmoTipoDeMoeda(id)) {
            resumoMoeda();
        } else {
            if (proximo == null) {
                throw new Exception("Tipo de moeda não encontrada");
            }
            proximo.resumoMoeda(id);
        }
    }

    public void fullResumo() {
        resumoMoeda();
        if (proximo != null) {
            proximo.fullResumo();
        }
    }

    protected abstract void resumoMoeda();

    public float totalArrecadacao() {
        float total = 0;
        total = totalMoeda();
        if (proximo != null) {
            total += proximo.totalArrecadacao();
        }
        return total;
    }
    
    protected abstract float totalMoeda();

}
