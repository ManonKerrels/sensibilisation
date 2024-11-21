package org.sensibilisation.usecases.activity;

import lombok.RequiredArgsConstructor;
import org.sensibilisation.dtos.request.CreateActivityRequestDto;
import org.sensibilisation.mappers.ActivityMapper;
import org.sensibilisation.models.Activity;
import org.sensibilisation.repositories.ActivityRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlanActivity {

    private final ActivityRepository activityRepository;
    private final ActivityMapper activityMapper;

    public void createActivity(CreateActivityRequestDto createActivityRequestDto) {
        Activity activity = activityMapper.map(createActivityRequestDto);
//        activityRepository.save(activity);
    }
}
