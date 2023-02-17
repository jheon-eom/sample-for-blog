package com.sample.blog.transactionaldup;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Member {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String deleteYn = "N";
}
