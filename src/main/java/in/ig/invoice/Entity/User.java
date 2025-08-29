package in.ig.invoice.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Data
@Document(collection = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private  String id;
    private  String clerkId;
    private String email;
    private String firstName;
    private  String lastName;
    private String photoUrl;

    @CreatedDate
    @Field("createdAt")
    private Instant createdAt;

}
