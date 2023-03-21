package FoodApp.Repository;

import FoodApp.Model.Fooditem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FooditemRepository extends JpaRepository<Fooditem, Long> {


    @Query("FROM Fooditem WHERE foodName= :foodName")
    List<Fooditem> findFooditemByName(@Param("foodName") String foodName);


    @Query("FROM Fooditem WHERE category= :foodName")
    List<Fooditem> findFooditemByCategory(@Param("categoryName") String categoryName);

    @Query("FROM Fooditem WHERE foodId = :foodId")
    List<Fooditem> findFooditemByFoodId(@Param("foodId")Long foodId );

    @Query("FROM Fooditem WHERE categoryId = :categoryId")
    List<Fooditem> findFooditemByCategoryId(@Param("categoryId")Long categoryId );

    @Query("FROM Fooditem WHERE priceOfItem = :priceOfItem")
    List<Fooditem> findFooditemByPrice(@Param("foodId")Long priceOfItem );

    @Query("FROM Fooditem WHERE description= :description")
    List<Fooditem> findFooditemByDescription(@Param("description")String description);

    @Query("FROM Fooditem WHERE foodTag= :foodTag")
    List<Fooditem> findFooditemByFoodTag(@Param("foodId")String foodTag );

}
