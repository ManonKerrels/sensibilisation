package org.sensibilisation.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder(toBuilder = true)
@Getter
@Setter
public class Address {
    private String country;
    private String province;
    private String street;
    private String streetNumber;
    private String boxNumber;
}
