package org.sensibilisation.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.sensibilisation.models.enums.ActivityType;
import org.sensibilisation.models.enums.PriceRange;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder(toBuilder = true)
@Getter
@Setter
public class Activity {
    private UUID uuid;
    private BigDecimal price;
    private String name;
    private List<ActivityType> activityTypes = new ArrayList<>();
    private PriceRange priceRange;
    private Address address;
}
