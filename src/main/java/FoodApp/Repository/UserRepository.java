package FoodApp.Repository;

import FoodApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long>{
    @Query("FROM users WHERE name = :name")
    User getUserByName(@Param("name") String name);
}
