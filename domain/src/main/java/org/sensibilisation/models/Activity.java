package org.sensibilisation.models;

import jakarta.persistence.*;
import lombok.*;
import org.sensibilisation.models.enums.ActivityType;
import org.sensibilisation.models.enums.PriceRange;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder(toBuilder = true)
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Entity
@Table(name = "activity")
public class Activity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid")
    private UUID uuid;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "activity_name")
    private String name;

    @Column(name = "activity_types")
    @Builder.Default
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "address_activity")
    @ElementCollection
    private List<ActivityType> activityTypes = new ArrayList<>();

    @Column(name = "price_range")
    @Enumerated(EnumType.STRING)
    private PriceRange priceRange;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "country", column = @Column(name = "country_activity")),
            @AttributeOverride(name = "province", column = @Column(name = "province_activity")),
            @AttributeOverride(name = "street", column = @Column(name = "street_activity")),
            @AttributeOverride(name = "box_number", column = @Column(name = "box_number_activity")),
    })
    private Address address;
}
