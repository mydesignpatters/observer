package app.observer.principal;

import app.observer.negocio.CarteiraAcoes;
import app.observer.observador.AcoesLogger;
import app.observer.observador.EnviarMensagem;
import app.observer.observador.GraficoBarras;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Teste do padrao Observer");
        
        CarteiraAcoes carteiraAcoes = new CarteiraAcoes();
        
        GraficoBarras graficoBarras = new GraficoBarras();
        AcoesLogger acoesLogger = new AcoesLogger();
        EnviarMensagem enviarMensagem = new EnviarMensagem();

        //Adicionar os observadores 
        carteiraAcoes.addObservador(graficoBarras);
        carteiraAcoes.addObservador(acoesLogger);
        carteiraAcoes.addObservador(enviarMensagem);

        //Para cada mudanca na CarteiraAcoes, todos os observadores sao notificados
        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("COMP02", 200);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("EMP34", 400);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("ACDF89", 300);
        
        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("EMP34", -200);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("COMP02", 150);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("COMP02", 200);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("EMP34", 400);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("ACDF89", 300);
        
        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("COMP02", 200);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("EMP34", 400);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("ACDF89", 300);
        
        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("EMP34", -200);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("COMP02", 150);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("COMP02", 200);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("EMP34", 400);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("ACDF89", 300);
    }
}