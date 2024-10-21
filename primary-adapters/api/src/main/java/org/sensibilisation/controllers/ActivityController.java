package org.sensibilisation.controllers;

import lombok.RequiredArgsConstructor;
import org.sensibilisation.dtos.request.CreateActivityRequestDto;
import org.sensibilisation.models.Activity;
import org.sensibilisation.usecases.activity.CancelActivity;
import org.sensibilisation.usecases.activity.FindActivity;
import org.sensibilisation.usecases.activity.PlanActivity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/activity")
public class ActivityController {
    private final FindActivity findActivity;
    private final CancelActivity cancelActivity;
    private final PlanActivity planActivity;

    @GetMapping("/{activityUuid}")
    private ResponseEntity<Activity> getActivityByUuid(@PathVariable UUID activityUuid) {
        return ResponseEntity.ok(findActivity.findActivityByUuid(activityUuid));
    }

    @DeleteMapping("/{activityUuid}")
    private ResponseEntity<UUID> cancelActivity(@PathVariable UUID activityUuid) {
        cancelActivity.removeActivity(activityUuid);
        return ResponseEntity.noContent().build();
    }

    @PostMapping()
    private ResponseEntity<Activity> planActivity(@RequestBody CreateActivityRequestDto createActivityRequestDto) {
        planActivity.createActivity(createActivityRequestDto);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{activityUuid}")
    private ResponseEntity<Activity> modifyActivity(@PathVariable UUID activityUuid, @RequestBody CreateActivityRequestDto createActivityRequestDto) {
        return null;
    }
}
