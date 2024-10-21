package org.sensibilisation.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.sensibilisation.dtos.request.CreateActivityRequestDto;
import org.sensibilisation.models.Activity;

@Mapper(componentModel = "spring")
public abstract class ActivityMapper {

    @Mapping(target = "uuid", ignore = true)
    public abstract Activity map(CreateActivityRequestDto requestDto);
}
