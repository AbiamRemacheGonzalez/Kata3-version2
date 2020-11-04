package kata3;

import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay(String title) {
        super(title);
        this.setContentPane(createPanel());
        this.pack();
    }

    private JPanel createPanel() {
        ChartPanel charPanel = new ChartPanel(createChart(createDataset()));
        return charPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("histogram", "emails", "numero de emails", dataSet, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(23, "", "ulpgc.es");
        dataSet.addValue(32, "", "dis.ulpgc.es");
        dataSet.addValue(2, "", "ull.es");
        dataSet.addValue(6, "", "gmail.com");
        dataSet.addValue(6, "", "hotmail.com");
        return dataSet;


    }
    public void execute(){
        this.setVisible(true);
    }
}
