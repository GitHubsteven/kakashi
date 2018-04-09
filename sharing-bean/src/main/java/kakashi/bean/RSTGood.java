package kakashi.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description: RST 保健品物品
 * @Date: Created at 15:58 2018/4/9.
 */
public class RSTGood implements Serializable {
    private Integer index;
    private String subTrackingNo;
    private String productName;
    private Integer goodQty;
    private BigDecimal weight;
    private BigDecimal price;
    /**
     * 订单总重量大于等于1kg的话就是B20
     总重量小于1kg的话就是B10
     */
    private String cartonSize;

    public Integer getIndex() {
        return index;
    }

    public RSTGood setIndex(Integer index) {
        this.index = index;
        return this;
    }

    public String getSubTrackingNo() {
        return subTrackingNo;
    }

    public RSTGood setSubTrackingNo(String subTrackingNo) {
        this.subTrackingNo = subTrackingNo;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public RSTGood setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public Integer getGoodQty() {
        return goodQty;
    }

    public RSTGood setGoodQty(Integer goodQty) {
        this.goodQty = goodQty;
        return this;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public RSTGood setWeight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public RSTGood setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public String getCartonSize() {
        return cartonSize;
    }

    public RSTGood setCartonSize(String cartonSize) {
        this.cartonSize = cartonSize;
        return this;
    }
}
