package app.controle.principal;

import app.controle.observador.AcoesLogger;
import app.controle.observador.GraficoBarras;
import app.controle.negocio.CarteiraAcoes;

public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Teste do padrao Observer");

        GraficoBarras graficoBarras = new GraficoBarras();
        AcoesLogger acoesLogger = new AcoesLogger();
        CarteiraAcoes carteiraAcoes = new CarteiraAcoes();
        
        carteiraAcoes.addObservador(graficoBarras);
        carteiraAcoes.addObservador(acoesLogger);

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