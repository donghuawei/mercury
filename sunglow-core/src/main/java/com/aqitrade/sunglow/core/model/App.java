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
@TableName("app")
public class App implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "app_id", type = IdType.AUTO)
    private Integer appId;

    private Integer userId;

    private Integer accountId;

    private String symbols;

    private String status;

    private String config;

    private String result;

    private String appType;

    private String appName;

    private LocalDateTime createDate;

    private LocalDateTime startDate;

    private Double initialFund;

    private Double value;

    private Double gain;

    private Boolean riskControl;

    private Double stopWin;

    private Double stopLoss;

    private Double stopWinAlert;

    private Double stopLossAlert;

    private Integer containerId;


}
