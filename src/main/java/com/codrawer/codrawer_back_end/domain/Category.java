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
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(length = 50, nullable = false)
    private String categoryName;


    @ManyToOne
    @JoinColumn(name="user_id")
    private User userId;

    @Setter
    @OneToMany(mappedBy = "categoryId")
    private Set<Post> posts = new LinkedHashSet<>();
}
