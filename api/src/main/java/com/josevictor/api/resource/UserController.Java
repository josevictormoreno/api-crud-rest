import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/user")
    public User create( @RequestBody @Valid User user ){
                
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable Long id){
    }

    @PutMapping("/user/{id}")
    public User update( @PathVariable Long id){
    }

    @GetMapping("/user/{id}")
    public User find( BookDTO dto, Pageable pageRequest ){
    }
}