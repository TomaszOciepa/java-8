package java8Optional;

import java.util.Optional;

// remove all nulls from the code
public class UserService {

    // should return Optional object
    public Optional<User> findUser(String lastName) {
        if ("kowalski".equalsIgnoreCase(lastName)) {
            User user = new User("Jan", "Kowalski", 32);
            return Optional.of(user);
        } else if ("nowak".equalsIgnoreCase(lastName)) {
            return Optional.of(new User("Andrzej", "Nowak", 45));
        }

        return Optional.empty();
    }

    // avoid throwing NullPointerException when no user found
    public String getUserDetails(String lastName) {
        Optional<User> userOpt = findUser(lastName);

        if (userOpt.isPresent()) {
            User user = userOpt.get();
            return user.toString();
        }

        return "";
    }

    // should throw AccessDeniedException if no user found
    public void authorizeUser(String lastName) {
        Optional<User> user = findUser(lastName);
//        if (!user.isPresent()) {
//            throw new AccessDeniedException("User not authorized");
//        }

        user.orElseThrow(() -> new AccessDeniedException("User not authorized"));
    }
}