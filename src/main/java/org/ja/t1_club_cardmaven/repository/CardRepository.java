package org.ja.t1_club_cardmaven.repository;

import org.ja.t1_club_cardmaven.entities.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CardRepository extends JpaRepository<Card, UUID> {


    @Override
    Optional<Card> findById(UUID uuid);
}
