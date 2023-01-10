package kata4.main;

import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = args.length > 0 ? args[0] : "email.txt";
        MailListReader mailListReader = new MailListReader();
        List<Mail> mailList = mailListReader.read(fileName);

        MailHistogramBuilder mailHistogramBuilder = new MailHistogramBuilder();
        Histogram<String> histogram = mailHistogramBuilder.build(mailList);

        HistogramDisplay histoDisplay = new HistogramDisplay("Histograma de Dominios", histogram);
        histoDisplay.execute();
    }
}
