package org.sensibilisation.usecases.activity;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.sensibilisation.repositories.ActivityRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CancelActivity {

    private final ActivityRepository activityRepository;

    public void removeActivity(@NonNull UUID activityUuid) {
//        activityRepository.deleteActivity(activityUuid);
    }
}
