package FoodApp.Repository;

import FoodApp.Model.FoodAppUser;
import FoodApp.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FoodAppUserRepository extends JpaRepository<FoodAppUser, Long>{
  /*  @Query("FROM users WHERE name = :name")
   Optional<FoodAppUser> getUserByName(@Param("name") String name);
  @Query("FROM users WHERE name= :name")*/
  List<FoodAppUser> findUserByUserName( String userName);


}


