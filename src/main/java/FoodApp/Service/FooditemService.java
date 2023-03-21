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


    public List<Fooditem> getAllFoodItem(){
    List<Fooditem> fooditemList= fooditemRepository.findAll();
    return fooditemList;
    }

    public Fooditem addFoodItem(Fooditem fooditem){
    Fooditem addedFooditem= fooditemRepository.save(fooditem);

        return addedFooditem;
    }

    public Fooditem getFoodItemByFoodId(long foodId){

      Optional<Fooditem> fooditemOptional = fooditemRepository.findById( foodId);
      Fooditem fooditem = fooditemOptional.get();
      return fooditem;
    }

    public Fooditem getFoodItemByCategoryId(long categoryId){

        Optional<Fooditem> fooditemOptional = fooditemRepository.findById( categoryId);
        Fooditem fooditem = fooditemOptional.get();
        return fooditem;
    }

    public Fooditem getFoodItemByPrice(long priceOfItem){

        Optional<Fooditem> fooditemOptional = fooditemRepository.findById( priceOfItem);
        Fooditem fooditem = fooditemOptional.get();
        return fooditem;
    }

    public List<Fooditem> getFooditemByFoodName(String foodName){
        List<Fooditem> fooditems=fooditemRepository.findFooditemByName(foodName);
        return fooditems;
    }

    public List<Fooditem> getFooditemByCategoryName(String categoryName){
        List<Fooditem> fooditems=fooditemRepository.findFooditemByCategory(categoryName);
        return fooditems;
    }

    public List<Fooditem> getFooditemByDescription(String description){
        List<Fooditem> fooditems=fooditemRepository.findFooditemByCategory(description);
        return fooditems;
    }

    public List<Fooditem> getFooditemByFoodTag(String foodTag){
        List<Fooditem> fooditems=fooditemRepository.findFooditemByCategory(foodTag);
        return fooditems;
    }
}
