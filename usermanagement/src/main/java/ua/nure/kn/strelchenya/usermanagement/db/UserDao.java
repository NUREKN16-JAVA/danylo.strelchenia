package ua.nure.kn.strelchenya.usermanagement.db;

import ua.nure.kn.strelchenya.usermanagement.User;

import java.util.Collection;

public interface UserDao {
    User create(User user) throws DatabaseException;

    void update(User user) throws DatabaseException;

    void delete(User user) throws DatabaseException;

    User find(Long id) throws DatabaseException;

    Collection<User> findAll() throws DatabaseException;

    void setConnectionFactory(ConnectionFactory connectionFactory);
}