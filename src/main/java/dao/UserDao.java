package dao;

import entity.User;

/*
 *创建日期：2020/10/17/21:37
 *创建人：dxf
 */
public interface UserDao {
    public User login();
    public List<User> queryByList();
    public void insert(User user);
    public void delete(String id);
    public void update(User user);
}
