package org.ja.t1_club_cardmaven.dto.card;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardDto {
    private UUID id;
    private String template;
    private String privilege;
}
