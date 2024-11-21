package org.sensibilisation.usecases.activity;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.sensibilisation.models.Activity;
import org.sensibilisation.repositories.ActivityRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FindActivity {

    private final ActivityRepository activityRepository;

    public Activity findActivityByUuid(@NonNull UUID activityUuid) {
        return null;
//        return activityRepository.findByUuid(activityUuid).orElse(null);
    }
}
