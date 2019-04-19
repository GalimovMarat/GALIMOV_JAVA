package ru.galimovmr.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
//@Entity
@Table(name = "user_service")
public class User {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String first_name;
    private String last_name;
    private String login;
    private String pc_number;
}

