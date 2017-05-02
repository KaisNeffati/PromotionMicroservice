package com.obego.Dao;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.obego.Entity.Promotion;
import com.obego.Entity.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.Collection;

/**
 * Created by Kais NEFFATI on 1/27/2017.
 */
@Repository
@Qualifier("mongodb")
public class MongoPromotionDaoImpl implements PromotionDao {

    @Autowired
    PromotionRepository promotionRepository;


    @Override
    public Collection<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    @Override
    public Promotion getPromotionById(String id) {
       return promotionRepository.findById(id);
    }

    @Override
    public void removeAll(){
        promotionRepository.deleteAll();
    }

    @Override
    public void removePromotionById(String id) {

        promotionRepository.delete(id);
    }

    @Override
    public void updatePromotion(Promotion promotion) {
        Promotion userAccount=promotionRepository.findById(promotion.getId());
        promotion.setId(userAccount.getId());
        promotionRepository.save(promotion);
    }

    @Override
    public void insertPromotion(Promotion promotion) {
        promotionRepository.insert(promotion);
    }
}
