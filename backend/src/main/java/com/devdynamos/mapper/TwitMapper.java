package com.devdynamos.mapper;

import com.devdynamos.dto.TwitDto;
import com.devdynamos.entity.Twit;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface TwitMapper {
    Twit twitDtoToTwit(TwitDto twitDto);

    TwitDto twitToTwitDto(Twit twit);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Twit updateTwitFromTwitDto(TwitDto twitDto, @MappingTarget Twit twit);
}
