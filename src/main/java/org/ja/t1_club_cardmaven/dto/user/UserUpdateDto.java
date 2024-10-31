package org.ja.t1_club_cardmaven.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateDto {

    @NotNull(message = "Username must not be null")
    @NotBlank(message = "Username must not be blank")
    @Length(min = 5, max = 128, message = "Username must be between 5 and 128 characters length")
    private String username;

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

    @NotNull(message = "Role must not be blank")
    @NotBlank(message = "Role must not be blank")
    private String role;

    private String phoneNumber;

}