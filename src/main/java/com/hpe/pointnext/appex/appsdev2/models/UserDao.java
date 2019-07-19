package com.hpe.pointnext.appex.appsdev2.models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

/**
 * @author kumaindr
 *
 */
@Transactional
public interface UserDao extends CrudRepository<User, Long> {

	/**
	 * @param email
	 * @return
	 */
	public User findByEmail(String email);

}