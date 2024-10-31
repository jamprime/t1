package org.ja.t1_club_cardmaven.dto.card;

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
public class CardUpdateDto {

    @NotNull(message = "Privilege must not be blank")
    @NotBlank(message = "Privilege must not be blank")
    @Length(min = 2, max = 128, message = "Privilege must be between 2 and 128 characters length")
    private String privilege;

    @NotNull(message = "Template must not be blank")
    @NotBlank(message = "Template must not be blank")
    @Length(min = 2, max = 128, message = "Template must be between 2 and 128 characters length")
    private String template;

}
