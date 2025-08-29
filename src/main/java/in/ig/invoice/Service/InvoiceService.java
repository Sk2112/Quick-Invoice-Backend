package in.ig.invoice.Service;

import in.ig.invoice.Entity.Invoice;
import in.ig.invoice.Repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceService {

    @Autowired
    private final InvoiceRepository invoiceRepository;
// new invoice
    public Invoice saveInvoice(Invoice invoice){
        return  invoiceRepository.save(invoice);
    }
// fetch invoices
    public List<Invoice> fetchInvoices(String clerkId){
       return invoiceRepository.findByClerkId(clerkId);
    }

    // deleting invoice

    public void removeInvoice(String clerkId,String invoiceId){
       Invoice existingInvoice= invoiceRepository.findByClerkIdAndId(clerkId,invoiceId).orElseThrow(()->new RuntimeException("Invoice Not Found"+invoiceId));
       invoiceRepository.delete(existingInvoice);
    }


}
