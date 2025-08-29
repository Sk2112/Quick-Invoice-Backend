package in.ig.invoice.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class EmailService {

    @Autowired
    private  JavaMailSender javaMailSender;

    @Value("${spring.mail.properties.mail.smtp.from}")
    private String fromEmail;

    public void sendInvoiceEmail(String toEmail, MultipartFile file) throws MessagingException, IOException {
   MimeMessage message=javaMailSender.createMimeMessage();
  MimeMessageHelper helper= new MimeMessageHelper(message,true);

  helper.setFrom(fromEmail);
  helper.setTo(toEmail);
  helper.setSubject("Your Invoice");
  helper.setText("Dear Customer ,\n\n Please find the attached Invoice.\n\n Thank You");
String fileName="invoice_"+System.currentTimeMillis()+".pdf";
  helper.addAttachment(fileName,new ByteArrayResource(file.getBytes()));

  javaMailSender.send(message);
    }
}
