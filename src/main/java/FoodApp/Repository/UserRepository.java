package FoodApp.Repository;

import FoodApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{
    @Query("FROM users WHERE name = :name")
    Optional<User> getUserByName(@Param("name") String name);
}


