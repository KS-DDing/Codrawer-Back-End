package com.codrawer.codrawer_back_end.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author: kbs
 */


@Getter
@NoArgsConstructor
@Entity(name = "likes")
public class Recommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @Setter
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post postId;

}
