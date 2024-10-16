package org.sensibilisation.models.enums;

import lombok.Getter;

@Getter
public enum ActivityType implements EnumWithDescription {

    OUTSIDE("Activité en plein air"),
    CULTURAL("Activité culturelle"),
    MANUAL("Activité manuelle");

    private final String description;
    ActivityType(String description) {this.description = description;}
}
