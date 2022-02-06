package community;

import community.mapper.UserMapper;
import community.model.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class CommunityApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testMybatis(){
        User user = new User();
        user.setToken("1");
        user.setName("1");
        user.setAccountId(String.valueOf(123));
        user.setGmtCreate(Long.valueOf(123));
        user.setGmtModified(Long.valueOf(123));
        userMapper.insert(user);
    }


}
