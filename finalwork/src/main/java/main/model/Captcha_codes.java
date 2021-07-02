package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Captcha_codes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private Date time;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String secret_code;
}
