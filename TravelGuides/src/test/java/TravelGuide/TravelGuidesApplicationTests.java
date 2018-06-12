package TravelGuide;

import TravelGuide.mapper.ScenicMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TravelGuidesApplicationTests {

	@Autowired
	private ScenicMapper tagert;

	@Test
	public void contextLoads() {
		System.out.print(tagert.fetchByCityId(1).size());
	}

}
