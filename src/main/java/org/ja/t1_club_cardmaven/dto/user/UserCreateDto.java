package org.ja.t1_club_cardmaven.dto.user;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDto {

    @NotNull(message = "ID must not be null")
    @NotBlank(message = "ID must not be blank")
    @Length(min = 36, max = 36, message = "ID must be 36 characters length")
    private UUID id;

    @NotNull(message = "Username must not be null")
    @NotBlank(message = "Username must not be blank")
    @Length(min = 5, max = 128, message = "Username must be between 5 and 128 characters length")
    private String username;

    @NotNull(message = "Password must not be null")
    @NotBlank(message = "Password must not be blank")
    @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,128}$", message = "Password must contain at least one uppercase and lowercase characters and a digit")
    private String password;

    @NotNull(message = "Firstname must not be null")
    @NotBlank(message = "Firstname must not be blank")
    private String firstName;

    @NotNull(message = "Lastname must not be null")
    @NotBlank(message = "Lastname must not be blank")
    private String lastName;

    @NotNull(message = "Email must not be null")
    @NotBlank(message = "Email must not be blank")
    @Email(message = "Email must be valid")
    private String email;

    @NotNull(message = "Birthday must not be null")
    @NotBlank(message = "Birthday must not be blank")
    private Date birthday;

    private String phoneNumber;

}