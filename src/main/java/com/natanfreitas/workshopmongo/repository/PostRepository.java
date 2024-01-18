package com.natanfreitas.workshopmongo.repository;

import com.natanfreitas.workshopmongo.domain.Post;
import com.natanfreitas.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
