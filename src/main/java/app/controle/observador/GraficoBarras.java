package app.controle.observador;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * É preciso baixar o JFreeChar http://www.jfree.org/jfreechart/
 * Os gráficos desse framework sempre são divididos em duas partes: 
 * o conjunto de dados e a sua representação visual. No exemplo apresentado, 
 * o atributo dataset da classe DefaultCategoryDataset representa o conjunto de dados 
 * e a variável local chart representa a parte visual. No caso, com a alteração do 
 * conjunto de dados associado ao gráfico, a representação também é atualizada.
 */
public class GraficoBarras implements Observador {
    private DefaultCategoryDataset dataset;
    private JFrame frame = new JFrame();
    
    public GraficoBarras() {
        dataset = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createBarChart("Carteira de Ações","Siglas","Quantidade", 
                                dataset, PlotOrientation.VERTICAL,false, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        
        frame.setContentPane(chartPanel);
        frame.setSize(500, 270);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void mudancaQuantidade(String acao, Integer qtd) {
        dataset.setValue(qtd, "Quantidade", acao);
    }
    
}