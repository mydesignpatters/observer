package app.observer.negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.observer.observador.Observador;

public class CarteiraAcoes {
    private Map<String, Integer> acoes = new HashMap<>();
    //lista de observadores da Carteira de Acoes
    private List<Observador> meusObservadores = new ArrayList<>();

    /**
     * De acordo com uma acao adicionada na carteira de acoes, adiciona um valor na quantidade dessa acao
     * @param acao Acao adicionada na carteira de acoes
     * @param qtd valor que sera adicionado na acao
     */
    public void adicionaAcoes(String acao, Integer qtd) {
        if (acoes.containsKey(acao)) {
            qtd += acoes.get(acao);
        }
        acoes.put(acao, qtd);
        notificar(acao, qtd);
    }

    /**
     * Notifica a acao aos observadores
     * @param acao acao que foi adicionada na carteira de acoes
     * @param qtd valor que sera alterado na quantidade de acoes
     */
    private void notificar(String acao, Integer qtd) {
        for (Observador o : meusObservadores)
            o.mudancaQuantidade(acao, qtd);
    }

    /**
     * Adiciona um observador 
     * @param o observador
     */
    public void addObservador(Observador o) {
        meusObservadores.add(o);
    }
}
