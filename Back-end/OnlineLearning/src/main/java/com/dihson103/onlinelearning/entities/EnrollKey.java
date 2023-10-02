package com.dihson103.onlinelearning.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class EnrollKey implements Serializable {

    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "course_id")
    private Integer courseId;

}
