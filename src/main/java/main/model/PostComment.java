package main.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post_comments")
public class PostComment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    private int parent_id;

    @ManyToOne (fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn (name="post_id", nullable = false)
    private Post post_id;

    @ManyToOne (fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn (name="user_id", nullable = false)
    private User user_id;

    @Column(nullable = false)
    private Date time;

    @Column(nullable = false, length = 65535, columnDefinition = "text")
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public Post getPost_id() {
        return post_id;
    }

    public void setPost_id(Post post_id) {
        this.post_id = post_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
