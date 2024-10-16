package org.sensibilisation.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.sensibilisation.models.enums.PriceRange;
import org.sensibilisation.models.enums.TripType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder(toBuilder = true)
@Getter
@Setter
public class Trip {
    private UUID uuid;
    private LocalDate startDate;
    private LocalDate endDate;
    private String name;
    private TripType tripType;
    private List<Traveler> travelers = new ArrayList<>();
    private PriceRange priceRange;
}
