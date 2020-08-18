package cn.leolam10.gmall.cms;

import cn.leolam10.gmall.cms.entity.SubjectCategory;
import cn.leolam10.gmall.cms.service.SubjectCategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallCmsApplicationTests {

    @Autowired
    SubjectCategoryService subjectCategoryService;

    @Test
    public void contextLoads() {
        SubjectCategory subjectCategory=subjectCategoryService.getById(1);

        System.out.println(subjectCategory.getName());
    }

}

