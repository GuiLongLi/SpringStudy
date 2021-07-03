package BeanAnnotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void outContent() {
        System.out.println("Annotation注释装配bean");
    }
}
