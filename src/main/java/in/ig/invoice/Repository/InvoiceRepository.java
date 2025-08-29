package in.ig.invoice.Repository;

import in.ig.invoice.Entity.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface InvoiceRepository extends MongoRepository<Invoice,String> {


       List<Invoice> findByClerkId(String id);

      Optional<Invoice> findByClerkIdAndId(String clerkId, String id);

}
