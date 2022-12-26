package com.tech.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER_ENTITY")
public class UserEntity {

    @Id
    @SequenceGenerator(name = "USER_ENTITY_SEQ", sequenceName = "USER_ENTITY_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_ENTITY_SEQ")
    @Column(name = "USER_ID", insertable = false, updatable = false)
    private Long id;

    @Column(name = "USER_NAME", nullable = false, unique = true)
    private String username;

    @Column(name = "USER_EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "USER_PASSWORD", nullable = false)
    private String password;

    @Column(name = "USER_CREATED_BY", nullable = false)
    private String createdBy = "demo";

    @Column(name = "USER_UPDATED_BY", nullable = false)
    private String updatedBy = "demo";

    @CreationTimestamp
    @Column(name = "USER_CREATED_DATE_TIME", nullable = false)
    private Date createdDateTime;

    @UpdateTimestamp
    @Column(name = "USER_MODIFIED_DATE_TIME", nullable = false)
    private Date modifiedDateTime;

}

