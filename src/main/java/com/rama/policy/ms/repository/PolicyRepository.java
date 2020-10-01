package com.rama.policy.ms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rama.policy.ms.model.Policy;

@Repository
public interface PolicyRepository extends MongoRepository<Policy, String>{

}
