package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @Column (nullable = false)
    private boolean is_active;

    @Column(name = "moderation_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private ModerationStatus moderationStatus = ModerationStatus.NEW;

    @ManyToOne (fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn (name="moderator_id")
    private User moderator_id;


    @ManyToOne (fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn (name="user_id", nullable = false)
    private User user;

    @Column (nullable = false)
    private Date time;

    @Column (nullable = false)
    private String title;

    @Column(nullable = false, length = 65535, columnDefinition = "text")
    private String text;

    @Column (nullable = false)
    private int view_count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public ModerationStatus getModerationStatus() {
        return moderationStatus;
    }

    public void setModerationStatus(ModerationStatus moderationStatus) {
        this.moderationStatus = moderationStatus;
    }

    public User getModerator_id() {
        return moderator_id;
    }

    public void setModerator_id(User moderator_id) {
        this.moderator_id = moderator_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getView_count() {
        return view_count;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }
}
