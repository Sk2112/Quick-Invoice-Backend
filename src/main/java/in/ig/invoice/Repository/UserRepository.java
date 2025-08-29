package in.ig.invoice.Repository;

import in.ig.invoice.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;
@Repository
public interface UserRepository extends MongoRepository<User,String> {

    Optional<User> findByClerkId(String clerkId);

//    boolean existsByClerkId(String clerkId);


}
