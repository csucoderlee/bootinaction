package org.csu.coderlee.learning;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by csucoderlee on 2017 04 28 上午11:06.
 *
 * 集成测试，测试springmvc
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration  //开启web测试上下文
public class MockMvcWebTests {

    //注入webAppConfiguration
    @Autowired
    WebApplicationContext webAppConfiguration;

    private MockMvc mockMvc;

    @Before
    public void setupMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webAppConfiguration).build();
    }

//    @Test
//    public void testBookId(){
//        mockMvc.perform(get("/book/id")).a
//    }
}
