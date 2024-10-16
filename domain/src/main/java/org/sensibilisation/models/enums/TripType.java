package org.sensibilisation.models.enums;

import lombok.Getter;

@Getter
public enum TripType implements EnumWithDescription {

    LONG("2 jours ou moins"),
    SHORT("3 jours ou plus");

    private final String description;

    TripType(String description) { this.description = description; }
}
