package org.ja.t1_club_cardmaven.mappers;

import org.ja.t1_club_cardmaven.dto.card.CardCreateDto;
import org.ja.t1_club_cardmaven.dto.card.CardDto;
import org.ja.t1_club_cardmaven.dto.card.CardUpdateDto;
import org.ja.t1_club_cardmaven.entities.card.Card;
import org.mapstruct.*;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CardMapper {

    CardDto toDto(Card card);

    @BeanMapping(qualifiedByName = "toEntity")
    Card toEntity(CardCreateDto cardCreateDto);

    Card updateEntity(CardUpdateDto cardUpdateDto);

    @AfterMapping
    @Named("toEntity")
    default void setPrivelege(@MappingTarget Card card) {
        card.setPrivilege("BASIC");
    }
}
