package AOPJDK;

public interface UserManager {
    /**
    新增用户抽象方法
    **/
    void addUser(String userName, String password);

    /**
    删除用户抽取方法
    **/
    void delUser(String userName);
}
