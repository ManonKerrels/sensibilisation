package org.sensibilisation.controllers;

import lombok.RequiredArgsConstructor;
import org.sensibilisation.models.Activity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/activity")
public class ActivityController {

    @GetMapping("/{activityUuid}")
    private ResponseEntity<Activity> getActivityByUuid(@PathVariable UUID activityUuid) {
        return null;
    }

    @DeleteMapping("/{activityUuid}")
    private ResponseEntity<UUID> cancelActivity(@PathVariable UUID activityUuid) {
        return null;
    }

    @PostMapping()
    private ResponseEntity<Activity> planActivity() {
        return null;
    }

    @PutMapping("/{activityUuid}")
    private ResponseEntity<Activity> modifyActivity() {
        return null;
    }
}
