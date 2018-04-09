package spring.framework.tool;

import gsonutils.GsonUtils;
import kakashi.bean.RSTGood;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

import java.beans.PropertyDescriptor;
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
        System.out.println("source before copy" + GsonUtils.bean2Json(source));
        System.out.println("target before copy" + GsonUtils.bean2Json(target));
        BeanUtils.copyProperties(source, target);
        System.out.println("source after copy" + GsonUtils.bean2Json(source));
        System.out.println("target after copy" + GsonUtils.bean2Json(target));
    }

    public static void copyPropertiesCopy(Object source, Object target) throws BeansException {
        copyPropertiesCopy(source, target, (Class) null, (String[]) null);
    }

    public static void copyPropertiesCopy(Object source, Object target, @Nullable Class<?> editable, @Nullable String... ignoreProperties) throws BeansException {
        Assert.notNull(source, "Source must not be null");
        Assert.notNull(target, "target must not be null");

        Class<?> actualEditable = target.getClass();
        //judge the target object class and specified editable class
        if (editable != null) {
            if (!editable.isInstance(target)) {
                throw new IllegalArgumentException("Target class[" + target.getClass().getName() + "] not assignable to Editable class [" + editable.getName() + "]");
            }

            actualEditable = editable;
        }




    }

    /**
     * 坑爹啊，还有个包内类，不对完开放，哭
     * @param clazz
     * @return
     * @throws BeansException
     */
    public static PropertyDescriptor[] getPropertyDescriptors(Class<?> clazz) throws BeansException{
//        CachedIntrospectionResults cr = CachedIntrospectionResults.forClass(clazz);
//        return cr.getPropertyDescriptors();
        return null;
    }




}
