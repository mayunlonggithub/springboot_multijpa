package org.sang.dao2;

import org.sang.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ma on 20190924
 */
public interface UserDao2 extends JpaRepository<User,Integer>{
}
