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
    private Long creatorId;
    private Long parentCommentId;

    private String content;

    private Long likes;
    private Long hates;

    private Long createdAt;
    private Long updatedAt;
    private Long deletedAt;

    public CommunityComment() {
        super();
    }
}
