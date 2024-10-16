package org.sensibilisation.controllers;

import lombok.RequiredArgsConstructor;
import org.sensibilisation.models.Traveler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/traveler")
public class TravelerController {

    @GetMapping("/{travelerUuid}")
    private ResponseEntity<Traveler> getTravelerByUuid(@PathVariable UUID travelerUuid) {
        return null;
    }

    @DeleteMapping("/{travelerUuid}")
    private ResponseEntity<UUID> deleteTraveler(@PathVariable UUID travelerUuid) {
        return null;
    }

    @PostMapping()
    private ResponseEntity<Traveler> createTraveler() {
        return null;
    }

    @PutMapping("/{travelerUuid}")
    private ResponseEntity<Traveler> modifyTraveler(@PathVariable UUID travelerUuid) {
        return null;
    }
}
