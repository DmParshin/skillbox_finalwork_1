package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @Column (nullable = false)
    private boolean is_active;


    @Column (nullable = false)
    @Enumerated(EnumType.STRING)
    private Moderation moderation_status = Moderation.NEW;
    public enum Moderation{
        NEW,
        ACCEPTED,
        DECLINED
    }

    private int moderator_id;

    @Column (nullable = false)
    private int user_id;

    @Column (nullable = false)
    private Date time;

    @Column (nullable = false)
    private String title;

    @Column(nullable = false, length = 65535, columnDefinition = "text")
    private String text;

    @Column (nullable = false)
    private int view_count;

}
