package com.obego.Entity;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Kais NEFFATI on 1/29/2017.
 */
public interface PromotionRepository extends MongoRepository<Promotion, String> {
    Promotion findById(String id);
}
