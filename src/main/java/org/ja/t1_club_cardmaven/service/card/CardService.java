package org.ja.t1_club_cardmaven.service.card;

import org.ja.t1_club_cardmaven.dto.card.CardCreateDto;
import org.ja.t1_club_cardmaven.dto.card.CardDto;
import org.ja.t1_club_cardmaven.dto.card.CardUpdateDto;

public interface CardService {

    CardDto createCard(CardCreateDto cardCreateDto);

    CardDto getCardById(String id);

    CardDto updateCard(String id, CardUpdateDto cardUpdateDto);


}
