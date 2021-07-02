package main.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Post_comments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private int parent_id;

    @Column(nullable = false)
    private int post_id;

    @Column(nullable = false)
    private int user_id;

    @Column(nullable = false)
    private Date time;

    @Column(nullable = false, length = 65535, columnDefinition = "text")
    private String text;
}
