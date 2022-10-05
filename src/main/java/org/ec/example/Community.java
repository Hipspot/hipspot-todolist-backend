package org.ec.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Community {

    @OneToMany(mappedBy = "community")
    private List<CommunityComment> comments;

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long creatorId;

    private String title;
    private String content;

    @ElementCollection
    @CollectionTable
    private List<String> tags;

    private Long views;
    private Long likes;
    private Long hates;

    private Long createdAt;
    private Long updatedAt;
    private Long deletedAt;

    public Community() {
        super();
    }
}
