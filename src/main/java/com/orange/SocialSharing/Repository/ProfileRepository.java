package com.orange.SocialSharing.Repository;

import com.orange.SocialSharing.models.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, Integer> {
}
