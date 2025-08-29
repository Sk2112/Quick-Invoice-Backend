package in.ig.invoice.Service;

import in.ig.invoice.Entity.User;
import in.ig.invoice.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    @Autowired
    private  final UserRepository userRepository;


public User saveOrUpdateUser(User user){
   Optional<User> optionalUser = userRepository.findByClerkId(user.getClerkId());
   if(optionalUser.isPresent()){
       User existingUser =optionalUser.get();
       existingUser.setEmail(user.getEmail());
       existingUser.setFirstName(user.getFirstName());
       existingUser.setLastName(user.getLastName());
       existingUser.setPhotoUrl(user.getPhotoUrl());
     existingUser=  userRepository.save(existingUser);
       System.out.println("Inside createOrUpdateUser");
       System.out.println("Received user: " + user);
       return existingUser;
   }
   return  userRepository.save(user);
}

public void deleteAccount(String clerkId){
User existingUser= userRepository.findByClerkId(clerkId).orElseThrow( () ->new RuntimeException("User Not Found"));
userRepository.delete(existingUser);
}

public User  getAccountByClerkId(String clerkId){
    return userRepository.findByClerkId(clerkId).orElseThrow( () ->new RuntimeException("User Not Found"));
}

}
