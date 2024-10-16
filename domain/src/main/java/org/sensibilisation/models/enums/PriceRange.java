package org.sensibilisation.models.enums;

import lombok.Getter;

@Getter
public enum PriceRange implements EnumWithDescription {

    CHEAP("Gamme de prix abordable"),
    MIDDLE("Gamme de prix moyenne"),
    EXPENSIVE("Gamme de prix élevée");

    private final String description;

    PriceRange(String description) { this.description = description; }
}
