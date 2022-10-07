package org.ec.example;

import javax.persistence.*;

@Entity
public class CommunityComment {

    @ManyToOne
    @JoinColumn(name = "community_id")
    private Community community;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private Long creatorId;
    private Long parentCommentId;

    @Column(length = 256)
    private String content;

    @Column(nullable = false)
    private Long likes;
    @Column(nullable = false)
    private Long hates;

    @Column(nullable = false)
    private Long createdAt;
    @Column
    private Long updatedAt;
    @Column
    private Long deletedAt;

    public CommunityComment() {
        super();
    }
}
