package org.ja.t1_club_cardmaven.entities.user;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.UuidGenerator;

import java.util.Date;
import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users", indexes = {
        @Index(name = "users_username", columnList = "username", unique = true)
})
public class User /* без UserDetails */ {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(name = "username", length = 128, unique = true, nullable = false)
    private String username;

    @Column(name = "first_name", length = 64, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 64, nullable = false)
    private String lastName;

    @Column(name = "email", length = 64, nullable = false)
    private String email;

    @Column(name = "password", length = 64, nullable = false)
    private String password;

    @Column(name = "phone_number", length = 128, nullable = false)
    private String phoneNumber;

    @Column(name = "birthday", length = 128, nullable = false)
    private Date birthday;

    @Column(name = "role", length = 128, nullable = false)
    @ColumnDefault(value = "NOT_ASSIGNED")
    private String role;

    @Column(name = "privilege", length = 128, nullable = false)
    @ColumnDefault(value = "NOT_ASSIGNED")
    private String privilege;

    @Column(name = "is_locked", length = 128, nullable = false)
    @ColumnDefault(value = "False")
    private Boolean isLocked;

    @Column(name = "template", length = 128, nullable = false)
    private String template;

}