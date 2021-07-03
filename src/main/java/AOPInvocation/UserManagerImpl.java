package AOPInvocation;

public class UserManagerImpl implements UserManager{
    @Override
    public void addUser(String userName, String password) {
        System.out.println("正在执行添加用户方法");
        System.out.println("用户名称："+userName+" 密码："+password);
    }

    @Override
    public void delUser(String userName) {
        System.out.println("正在执行删除用户方法");
        System.out.println("用户名称："+userName);
    }
}
