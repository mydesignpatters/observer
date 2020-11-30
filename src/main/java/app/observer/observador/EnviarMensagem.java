package app.observer.observador;

import java.util.Date;

public class EnviarMensagem implements Observador{
    String mensagem="";

    @Override
    public void mudancaQuantidade(String acao, Integer qtd) {
        mensagem = "A ação " + acao + " teve uma variação de " + qtd;
        enviar(mensagem);
    }
    
    public void enviar(String mensagem){
        System.out.println("Mensagem " + mensagem + " enviada as " + this.dataCorrente());
    }

    public String dataCorrente(){
        String data;
        Date minhaData = new Date();

        data = "" + minhaData.getHours() + ":" + minhaData.getMinutes() + ":" + minhaData.getSeconds() + " - " + 
        minhaData.getDay() + "/" +  minhaData.getMonth() + "/" +minhaData.getYear();
        
        return data;
    }
}