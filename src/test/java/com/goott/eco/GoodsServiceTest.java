package com.goott.eco;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.goott.eco.config.RootConfig;
import com.goott.eco.config.ServletConfig;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {RootConfig.class, ServletConfig.class})
@Log4j
public class GoodsServiceTest {
//	@Autowired private GoodsService service;
//	
//	@Test(expected=Exception.class)
//	public void txTest() {
//		service.txTest();
//	}
}
