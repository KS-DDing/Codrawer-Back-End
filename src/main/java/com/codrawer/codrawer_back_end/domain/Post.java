package com.codrawer.codrawer_back_end.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author: kbs
 */
@Getter
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @CreatedDate
    private LocalDateTime createdTime;

    @LastModifiedDate
    private LocalDateTime modifiedTime;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User userId;

    @Setter
    @OneToMany(mappedBy = "postId")
    private Set<Comment> comments = new LinkedHashSet<>();

    @Setter
    @OneToMany(mappedBy = "postId")
    private Set<Recommendation> peopleRecommendation = new LinkedHashSet<>();

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category categoryId;

}
