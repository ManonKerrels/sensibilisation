package org.sensibilisation.dtos.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.SuperBuilder;
import org.sensibilisation.models.Address;
import org.sensibilisation.models.enums.ActivityType;
import org.sensibilisation.models.enums.PriceRange;

import java.math.BigDecimal;
import java.util.List;

@Value
@SuperBuilder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateActivityRequestDto {
    BigDecimal price;
    String name;
    List<ActivityType> activityTypes;
    PriceRange priceRange;
    Address address;
}
