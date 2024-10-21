package org.sensibilisation.repositories;

import org.sensibilisation.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import java.util.Optional;
import java.util.UUID;

@Repository
@Validated
public interface ActivityRepository extends JpaRepository<Activity, Long> {
    Optional<Activity> findByUuid(UUID activityUuid);

//    @Query() TODO add query and db
    void deleteActivity(UUID activityUuid);
}
