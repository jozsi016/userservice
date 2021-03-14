package hu.jnagy.userservice.repository;

import hu.jnagy.userservice.model.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserRepository {
    private final Map<Long, User> users = new HashMap<>();

    public Map<Long, User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

}
