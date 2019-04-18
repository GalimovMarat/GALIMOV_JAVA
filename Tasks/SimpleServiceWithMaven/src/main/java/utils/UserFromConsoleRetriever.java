package utils;

import models.User;

import java.util.Scanner;

public class UserFromConsoleRetriever {

    private Scanner scanner;

    public UserFromConsoleRetriever() {
        this.scanner = new Scanner(System.in);
    }

    public User retrieveUser() {
      User user = User.builder()
              .first_name(scanner.nextLine())
              .last_name(scanner.nextLine())
              .login(scanner.nextLine())
              .pc_number(scanner.nextLine())
              .build();


        return user;
    }
}

