package TravelGuide;

import TravelGuide.mapper.CityMapper;
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
	@Autowired
	private CityMapper tagert2;

	@Test
	public void contextLoads() {
		System.out.print(tagert2.getAll().size());
	}

}
