package com.codrawer.codrawer_back_end.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author: kbs
 */
@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false)
    private String oauth;

    @Setter
    @Column(length = 500)
    private String introduction;

    @Setter
    @Column(length = 50, nullable = false)
    private String nickname;

    @Setter
    @Column
    private String profileImagePath;

    @Setter
    @OneToMany(mappedBy = "userId")
    private Set<Post> posts = new LinkedHashSet<>();

    @Setter
    @OneToMany(mappedBy = "userId")
    private Set<Comment> comments = new LinkedHashSet<>();

    @Setter
    @OneToMany(mappedBy = "userId")
    private Set<Recommendation> postsRecommendation = new LinkedHashSet<>();

    @Setter
    @OneToMany(mappedBy = "userId")
    private Set<Recommendation> categories = new LinkedHashSet<>();

    @Setter
    @Column(nullable = false)
    private String role;
}
