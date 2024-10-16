package org.sensibilisation.controllers;

import lombok.RequiredArgsConstructor;
import org.sensibilisation.models.Trip;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/trip")
public class TripController {

    @GetMapping("/{tripUuid}")
    public ResponseEntity<Trip> getTripByUuid(@PathVariable UUID tripUuid) {
        return null;
    }

    @DeleteMapping("/cancel/{tripUuid}")
    private ResponseEntity<UUID> cancelTrip(@PathVariable UUID tripUuid) {
        return null;
    }

    @PostMapping()
    private ResponseEntity<Trip> planTrip() {
        return null;
    }

    @PutMapping("/{tripUuid}")
    private ResponseEntity<Trip> modifyTrip(@PathVariable UUID tripUuid) {
        return null;
    }
}
