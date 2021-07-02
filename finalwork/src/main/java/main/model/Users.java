package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Users {
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
    private String text;


}
