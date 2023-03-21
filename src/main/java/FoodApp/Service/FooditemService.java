package FoodApp.Service;

import FoodApp.Model.Fooditem;
import FoodApp.Repository.FooditemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FooditemService {
    FooditemRepository fooditemRepository;
    @Autowired
    FooditemService(FooditemRepository fooditemRepository){
        this.fooditemRepository = fooditemRepository;
    }


    public List<Fooditem> getAllFoods(){
    List<Fooditem> list= fooditemRepository.findAll();
    return list;
    }

    public Fooditem addFooditem(Fooditem fooditem){
    Fooditem addedFooditem= fooditemRepository.save(fooditem);

        return addedFooditem;
    }

    public Fooditem getFooditemByFoodId(long foodId){

      Optional<Fooditem> fooditemOptional = fooditemRepository.findById( foodId);
      Fooditem fooditem = fooditemOptional.get();
      return fooditem;
    }

    public Fooditem getFooditemByCategory(long categoryId){

        Optional<Fooditem> fooditemOptional = fooditemRepository.findById( categoryId);
        Fooditem fooditem = fooditemOptional.get();
        return fooditem;
    }

    public Fooditem getFooditemByPrice(long priceOfItem){

        Optional<Fooditem> fooditemOptional = fooditemRepository.findById( priceOfItem);
        Fooditem fooditem = fooditemOptional.get();
        return fooditem;
    }

    public List<Fooditem> getFooditemByName(String foodName){
        List<Fooditem> fooditems=fooditemRepository.findFooditemByName(foodName);
        return fooditems;
    }

    public List<Fooditem> getFooditemByCategoryName(String categoryName){
        List<Fooditem> fooditems=fooditemRepository.findFooditemByCategory(categoryName);
        return fooditems;
    }

    public List<Fooditem> getFooditemByIngredient(String ingredient){
        List<Fooditem> fooditems=fooditemRepository.findFooditemByCategory(ingredient);
        return fooditems;
    }

    public List<Fooditem> getFooditemByTag(long foodTag){
        List<Fooditem> fooditems=fooditemRepository.findFooditemByTag(foodTag);
        return fooditems;
    }
}
