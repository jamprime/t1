

package org.ja.t1_club_cardmaven.dto.card;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardCreateDto {
    @NotNull(message = "Template must not be blank")
    private String template;
}

