package ru.galimovmr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.galimovmr.models.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersControllers {
    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {
        User marat = User.builder()
                .first_name("Марат")
                .last_name("Галимов")
                .login("Galimov_MR")
                .pc_number("Dominant-PC7")
                .build();
        User andrey = User.builder()
                .first_name("Андрей")
                .last_name("Шишкин")
                .login("Shishkin_AV")
                .pc_number("Dominant-PC2")
                .build();
        List<User> users = new ArrayList<>();
        users.add(marat);
        users.add(andrey);
        model.addAttribute("users", users);
        return "users";
    }


}
