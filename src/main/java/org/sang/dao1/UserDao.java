package org.sang.dao1;

import org.sang.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ma on 20190924
 */
public interface UserDao extends JpaRepository<User,Integer>{
}
