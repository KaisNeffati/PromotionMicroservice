package com.obego.Controller;

import com.obego.Entity.Promotion;
import com.obego.Service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 1/27/2017.
 */
@CrossOrigin(origins = "http://localhost:4200",methods = {RequestMethod.POST,RequestMethod.DELETE,RequestMethod.GET})
@RestController
@RequestMapping("/promotion")
public class PromotionContorller {

    @Autowired
    private PromotionService promotionService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.GET, produces="application/json")
    public Collection<Promotion> getAllPromotions(){
        return promotionService.getAllPromotions();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Promotion getPromotionById(@PathVariable("id") String id){
        return promotionService.getPromotionById(id);
    }


    @RequestMapping(method = RequestMethod.DELETE)
    public void removeAll(){
        System.out.println("Element deleted");
        promotionService.removeAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void removePromotionById(@PathVariable("id") String id){
        promotionService.removePromotionById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePromotion(@RequestBody Promotion promotion){

        promotionService.updatePromotion(promotion);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertPromotion(@RequestBody Promotion promotion){

        promotionService.insertPromotion(promotion);
    }
}
