package org.ja.t1_club_cardmaven.entities.card;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "template", length = 128, nullable = false)
    private String template;

    @Column(name = "privilege", length = 128, nullable = false)
    private String privilege;


}