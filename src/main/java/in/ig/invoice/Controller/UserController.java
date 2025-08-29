package in.ig.invoice.Controller;

import in.ig.invoice.Entity.User;
import in.ig.invoice.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private  final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public User createOrUpddateUser(@RequestBody User user, Authentication authentication){
  try{
      if(!authentication.getName().equals(user.getClerkId())){

          System.out.println("Inside createOrUpdateUser");
          System.out.println("Received user: " + user);
          System.out.println("Auth user: " + authentication.getName());
          System.out.println("Body user: " + user.getClerkId());
          throw  new ResponseStatusException(HttpStatus.FORBIDDEN,"User does not have permission to access the resource");
      }
      return  userService.saveOrUpdateUser(user);
  }
  catch (Exception e){
      throw  new RuntimeException(e);
    }
    }
}
