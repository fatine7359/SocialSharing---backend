package com.orange.SocialSharing.Repository;

import com.orange.SocialSharing.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, Integer> {
}
