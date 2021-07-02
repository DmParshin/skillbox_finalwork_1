package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post_votes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private int user_id;

    @Column(nullable = false)
    private int post_id;

    @Column(nullable = false)
    private Date time;

    @Column(nullable = false)
    private boolean value;
}
