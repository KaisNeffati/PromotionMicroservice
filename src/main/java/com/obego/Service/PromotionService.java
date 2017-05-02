package com.obego.Service;

import com.obego.Dao.PromotionDao;
import com.obego.Entity.Promotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 1/27/2017.
 */
@Service
public class PromotionService {

    @Autowired
    @Qualifier("mongodb")
    private PromotionDao promotionDao;
    public Collection<Promotion> getAllPromotions(){
        return promotionDao.getAllPromotions();
    }
    public Promotion getPromotionById(String id){
        return promotionDao.getPromotionById(id);
    }
    public void removePromotionById(String id){
        promotionDao.removePromotionById(id);
    }
    public void updatePromotion(Promotion promotion){
        promotionDao.updatePromotion(promotion);
    }
    public void insertPromotion(Promotion promotion){
        promotionDao.insertPromotion(promotion);
    }
    public void removeAll(){
        promotionDao.removeAll();
    }
}
