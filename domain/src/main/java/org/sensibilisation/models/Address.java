package org.sensibilisation.models;

import lombok.*;

@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@Setter
public class Address {

    private String country;
    private String province;
    private String street;
    private String streetNumber;
    private String boxNumber;
}
