package org.ec.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Community {

    @OneToMany(mappedBy = "community")
    private List<CommunityComment> comments;

    @Id @GeneratedValue(strategy = GenerationType.AUTO) // 기본키인지 확인
    private Long id;
    @Column(nullable = false)
    private Long creatorId;

    @Column(length = 64)
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;

    @ElementCollection
    @CollectionTable
    private List<String> tags;

    @Column(nullable = false)
    private Long views;
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

    public Community() {
        super();
    }
}
