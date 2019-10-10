package java.com.immco.o2o.dao;

import com.immco.o2o.dao.AreaDao;
import com.immco.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    public void testArea(){
        List<Area> list = areaDao.queryArea();
        assertEquals(2, list.size());
    }
}
