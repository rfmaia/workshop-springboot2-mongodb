package io.github.rfmaia.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.github.rfmaia.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
