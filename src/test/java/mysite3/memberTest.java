package mysite3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.mysite.repository.UserDao;
import com.example.mysite.vo.UserVo;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"file:src/main/resources/applicationContext.xml", "file:src/main/resources/mybatis/configuration.xml"})
public class memberTest {

	@Autowired
	UserDao dao;
	
	
	@Ignore
	@Test
	public void testMemberInsert() {
		UserVo vo = new UserVo();
		vo.setName("김기덕");
		vo.setGender("MALE");
		vo.setEmail("gdtbgl93@gmail.com");
		vo.setPassword("kim1234");
		dao.insert(vo);
	}

	@Ignore
	@Test
	public void testMemberSelect() {
		
		Assert.assertNotNull(dao.get("gdtbgl93@gmail.com"));
		Assert.assertNotNull(dao.get("gdtbgl93@gmail.com","kim1234"));

	}

	@Test
	public void testMemberModify() {
		UserVo vo = new UserVo();
		vo.setNo(1L);
		vo.setName("김철수");
		vo.setEmail("gdtbgl93@gmail.com");
		vo.setGender("FEMALE");
		vo.setPassword("godqhrgkek93@");
		dao.update(vo);
	
	
	
	}
	
	
	
	

}
