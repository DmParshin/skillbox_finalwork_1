package main.model;

import javax.persistence.*;

@Entity
@Table(name = "tag2posts")
public class Tag2Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @ManyToOne (fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn (name="post_id", nullable = false)
    private Post post_id;

    @ManyToOne (fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn (name="tag_id", nullable = false)
    private Tag tag_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
