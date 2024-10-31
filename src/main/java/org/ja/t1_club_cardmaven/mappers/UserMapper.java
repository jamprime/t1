package org.ja.t1_club_cardmaven.mappers;

import org.ja.t1_club_cardmaven.dto.user.UserCreateDto;
import org.ja.t1_club_cardmaven.dto.user.UserDto;
import org.ja.t1_club_cardmaven.dto.user.UserUpdateDto;
import org.ja.t1_club_cardmaven.entities.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    User toEntity(UserCreateDto userCreateDto);

    User updateEntity(UserUpdateDto userUpdateDto);

    UserDto toDto(User user);


}
