package spring.framework.tool;

import gsonutils.GsonUtils;
import kakashi.bean.RSTGood;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 17:15 2018/4/9.
 */
public class BeanUtilsCopy {
    public static void main(String[] args) {
        RSTGood source = new RSTGood();
        source.setSubTrackingNo("test")
                .setWeight(new BigDecimal(2.3))
                .setProductName("productName")
                .setPrice(new BigDecimal(12.3))
                .setSubTrackingNo("subTrackingNo")
                .setGoodQty(2)
                .setIndex(1);
        RSTGood target = new RSTGood();
        System.out.println("source before copy"+ GsonUtils.bean2Json(source));
        System.out.println("target before copy" + GsonUtils.bean2Json(target));
        BeanUtils.copyProperties(source,target);
        System.out.println("source after copy" + GsonUtils.bean2Json(source));
        System.out.println("target after copy" + GsonUtils.bean2Json(target));
    }
}
