package kata4.view;

import kata4.model.Histogram;
import kata4.model.Mail;

import java.util.List;

public class MailHistogramBuilder {

    public Histogram<String> build(List<Mail> mailList) {
        Histogram<String> result = new Histogram<>();
        mailList.forEach(mail -> result.increment(mail.getDomain()));
        return result;
    }
}
