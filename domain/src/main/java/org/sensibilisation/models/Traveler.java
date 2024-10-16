package org.sensibilisation.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Builder(toBuilder = true)
@Getter
@Setter
public class Traveler {
    private UUID uuid;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
}
