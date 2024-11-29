package org.sensibilisation.models;

import jakarta.persistence.*;
import lombok.*;
import org.sensibilisation.models.enums.PriceRange;
import org.sensibilisation.models.enums.TripType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@Setter
public class Trip {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid")
    private UUID uuid;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "trip_name")
    private String name;

    @Column(name = "trip_type")
    @Enumerated(EnumType.STRING)
    private TripType tripType;

//    @Builder.Default
//    @Enumerated(EnumType.STRING)
//    @CollectionTable(name = "traveler_trip")
//    @ElementCollection
//    private List<Traveler> travelers = new ArrayList<>();

    @Column(name = "price_range")
    @Enumerated(EnumType.STRING)
    private PriceRange priceRange;
}
