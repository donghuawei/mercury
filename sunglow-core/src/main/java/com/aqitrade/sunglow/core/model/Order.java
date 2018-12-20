package com.aqitrade.sunglow.core.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Huawei
 * @since 2018-12-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Long orderId;

    private Double limitPrice;

    private LocalDateTime createDate;

    private Integer qty;

    private String direction;

    private Integer accountId;

    private Integer subAccountId;

    private Integer instrumentId;

    private String statusMessage;

    private LocalDateTime expirationDate;

    private String exchangeOrderId;

    private Integer tradedQty;

    private String status;

    private Integer appId;

    private String secType;

    private String orderType;

    private String tif;

    private Boolean closeToday;

    private Boolean external;

    private Integer pairTradingId;

    private String tradingDay;


}
