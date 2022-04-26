
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    String username;
    String name;
    String lastName;
    String profileImageUrl;
    String bio;
    String email;
    String gender;
}