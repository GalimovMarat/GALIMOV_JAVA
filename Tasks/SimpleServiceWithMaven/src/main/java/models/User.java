package models;

import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString

public class User {
    private long id;
    private String first_name;
    private String last_name;
    private String login;
    private String pc_number;



//    public User(String firstName, String lastName, String login, String pcNumber) {
//        this.first_name = firstName;
//        this.last_name = lastName;
//        this.login = login;
//        this.pc_number = pcNumber;
//    }
//
//    // ВОЗМОЖНОСТЬЮ ПОЛОЖИТЬ ID
//    // Для того чотбы в  UserRepositoryJdbcImpl реализовать метод FindById (который возвращает
//    // новый объект класса User) для USERа нужно сделать новый конструктор с ID.
//    public User(long id, String firstName, String lastName, String login, String pcNumber) {
//        this.id = id;
//        this.first_name = firstName;
//        this.last_name = lastName;
//        this.login = login;
//        this.pc_number = pcNumber;
//    }
//
//    public void setId(long id) {
//
//        this.id = id;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getFirstName (){
//
//        return this.first_name;
//    }
//
//    public String getLastName (){
//        return this.last_name;
//    }
//
//    public String getLogin ()
//    {
//        return this.login;
//    }
//
//    public String getPcNumber (){
//
//        return this.pc_number;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", first_name='" + first_name + '\'' +
//                ", last_name='" + last_name + '\'' +
//                ", login='" + login + '\'' +
//                ", pc_number='" + pc_number + '\'' +
//                '}';
//    }
}
