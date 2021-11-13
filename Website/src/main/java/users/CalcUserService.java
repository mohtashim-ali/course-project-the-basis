package users;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CalcUserService implements UserDetailsService {

    private final static String user_not_found_error_message = "user with %s not found";
    private final CalcUserRepository calcUserRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return calcUserRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(String.format(user_not_found_error_message, email)));

    }
}
