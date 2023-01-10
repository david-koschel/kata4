package kata4.main;

import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        Control control = new Control();
        String fileName = args.length > 0 ? args[0] : "email.txt";
        control.input(fileName);
        control.process();
        control.output();
        control.execute();
    }

    static class Control {
        private List<Mail> mailList;
        private Histogram<String> histogram;
        private HistogramDisplay histogramDisplay;

        public void input(String fileName) {
            mailList = new MailListReader().read(fileName);
        }

        public void process() {
            histogram = new MailHistogramBuilder().build(mailList);
        }

        public void output() {
            histogramDisplay = new HistogramDisplay("Histograma de Dominios", histogram);
        }

        public void execute() {
            histogramDisplay.execute();
        }
    }
}
