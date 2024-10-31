package org.ja.t1_club_cardmaven.dto.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private UUID id;
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    private Date birthday;
    private String phone;
    private String privilege;
    private Boolean isLocked;
    private String role;
    private String template;

}
