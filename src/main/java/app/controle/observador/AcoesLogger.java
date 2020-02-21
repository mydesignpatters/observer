package app.controle.observador;

import app.controle.observador.Observador;

/**
 * Classe que observa mudanças nas quantidades e registra no console:
 */
public class AcoesLogger implements Observador{

    @Override
    public void mudancaQuantidade(String acao, Integer qtd) {
        System.out.println("Alterada a quantidade da ação " + acao + " para " + qtd);
    }
    
}