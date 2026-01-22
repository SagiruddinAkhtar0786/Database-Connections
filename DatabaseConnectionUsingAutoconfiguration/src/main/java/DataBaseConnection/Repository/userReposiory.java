package DataBaseConnection.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import DataBaseConnection.Entity.User;

public interface userReposiory extends JpaRepository<User,Integer> {

}
