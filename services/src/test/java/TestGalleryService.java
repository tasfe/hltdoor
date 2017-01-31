import com.github.pagehelper.PageInfo;
import com.hltdoor.model.HGallery;
import com.hltdoor.service.GalleryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by linwei on 2016/12/25.
 * 测试案例service
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring/applicationContext.xml",
        "classpath:META-INF/spring/spring-mybatis.xml"})
public class TestGalleryService  {
    @Resource
    private GalleryService galleryService;
    @Test
    public void testCreate() {
        HGallery hGallery = new HGallery();
        hGallery.sethTitle("中房瑞致国际");
        hGallery.sethSubTitle("中房瑞致");
        hGallery.sethTypeId(null);
        hGallery.sethContent("详情");
        hGallery.sethCoverImg("http://zyzs.zlinwei.com/userfiles/images/case/20160925_201531.jpg");
        hGallery.sethVr("http://localhost/h5vr/1_1.html");
        hGallery.sethBuilding("中房瑞致");
        hGallery.sethHouseType("三房两厅");
        hGallery.sethHouseSize("128");
        hGallery.sethHouseStyle("现代简约");

        galleryService.create(hGallery);

    }
    @Test
    public void testDelete() {
        HGallery hGallery = galleryService.find(2);
        System.out.println("find" + hGallery.gethTitle());

        galleryService.destroy(2);

    }

    @Test
    public void testUpdate() {
        HGallery hGallery = galleryService.find(1);
        System.out.println("subTitle" + hGallery.gethSubTitle());
        hGallery.sethSubTitle(hGallery.gethSubTitle() + "1");
        galleryService.update(hGallery);
    }

    @Test
    public void testGet() {
        PageInfo<HGallery> pageInfo = galleryService.get(1, null, null);
        for (HGallery tmp : pageInfo.getList()) {
            System.out.println("get:" + tmp.getId());
        }
    }


}
