package com.obego.Dao;


import com.obego.Entity.Promotion;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 1/27/2017.
 */
public interface PromotionDao {
    Collection<Promotion> getAllPromotions();

    Promotion getPromotionById(String id);

    void removePromotionById(String id);

    void updatePromotion(Promotion promotion);

    void insertPromotion(Promotion promotion);
    void removeAll();
}
