package com.aqitrade.mercury.core.model;

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
@TableName("fund")
public class Fund implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "fund_id", type = IdType.AUTO)
    private Integer fundId;

    private LocalDateTime createDate;

    private String name;

    private Double amount;

    private String description;

    private Integer policyId;


}
