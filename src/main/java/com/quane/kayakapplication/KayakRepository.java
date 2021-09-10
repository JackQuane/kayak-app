package com.quane.kayakapplication;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KayakRepository extends ReactiveMongoRepository<Kayak, Long> {

}
