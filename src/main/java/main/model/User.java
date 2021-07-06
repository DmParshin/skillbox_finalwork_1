package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @Column (nullable = false)
    private boolean is_moderator;

    @Column (nullable = false)
    private Date reg_time;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private String email;

    @Column (nullable = false)
    private String password;

    private String code;

    @Column(length = 65535, columnDefinition = "text")
    private String photo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_moderator() {
        return is_moderator;
    }

    public void setIs_moderator(boolean is_moderator) {
        this.is_moderator = is_moderator;
    }

    public Date getReg_time() {
        return reg_time;
    }

    public void setReg_time(Date reg_time) {
        this.reg_time = reg_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
