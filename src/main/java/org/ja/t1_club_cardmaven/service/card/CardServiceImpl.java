package org.ja.t1_club_cardmaven.service.card;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ja.t1_club_cardmaven.entities.EntityNotFoundException;
import org.ja.t1_club_cardmaven.dto.card.CardCreateDto;
import org.ja.t1_club_cardmaven.dto.card.CardDto;
import org.ja.t1_club_cardmaven.dto.card.CardUpdateDto;
import org.ja.t1_club_cardmaven.entities.card.Card;
import org.ja.t1_club_cardmaven.mappers.CardMapper;
import org.ja.t1_club_cardmaven.repository.CardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService{

    private final CardRepository cardRepository;
    private final CardMapper cardMapper;

    @Transactional
    @Override
    public CardDto createCard(CardCreateDto cardCreateDto) {

        Card card = cardMapper.toEntity(cardCreateDto);

        cardRepository.save(card);
        log.info("Card created: {}", card);

        return cardMapper.toDto(card);
    }

    @Transactional
    @Override
    public CardDto getCardById(String id) {

        Card card = findById(id);

        return cardMapper.toDto(card);
    }

    @Transactional
    @Override
    public CardDto updateCard(String id, CardUpdateDto cardUpdateDto) {

        Card card = findById(id);

        card = cardMapper.updateEntity(cardUpdateDto);
        card = cardRepository.save(card);

        return cardMapper.toDto(card);
    }

    private Card findById(String id) {

        UUID uuid = UUID.fromString(id);

        return cardRepository.findById(uuid)
                .orElseThrow(() -> new EntityNotFoundException("Card", "id", id));
    }

}
