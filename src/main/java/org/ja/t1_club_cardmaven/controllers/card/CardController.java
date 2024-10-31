package org.ja.t1_club_cardmaven.controllers.card;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.ja.t1_club_cardmaven.dto.card.CardCreateDto;
import org.ja.t1_club_cardmaven.dto.card.CardDto;
import org.ja.t1_club_cardmaven.dto.card.CardUpdateDto;
import org.ja.t1_club_cardmaven.service.card.CardService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cards")
@Tag(name = "club-card endpoint", description = "Endpoint для управления виртуальными картами")
public class CardController {

    private final CardService cardService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create club-card")
    public CardDto createCard(@RequestBody CardCreateDto cardCreateDto) {

        return cardService.createCard(cardCreateDto);
    }

    @Operation(summary = "Customize club-card")
    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CardDto customizeCard(String id, CardUpdateDto cardUpdateDto) {

        return cardService.updateCard(id, cardUpdateDto);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get club-card by Id")
    @ResponseStatus(HttpStatus.OK)
    public CardDto getCardById(String id) {

        return cardService.getCardById(id);
    }

}
