package vBoard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.livingoncodes.vboard.VBoardApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = VBoardApplication.class)
@WebAppConfiguration
public class VBoardApplicationTests {

	@Test
	public void contextLoads() {
	}

}
