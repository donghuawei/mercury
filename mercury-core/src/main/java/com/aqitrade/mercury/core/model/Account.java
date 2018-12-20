package com.aqitrade.mercury.core.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2018-11-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("account")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "account_id", type = IdType.AUTO)
    private Integer accountId;

    private String name;

    private String authenticationId;

    private String password;

    private Integer brokerId;

    private String status;

    private Double cashQty;

    private String accountType;

    private Double value;

    private String brokerParams;

    private Double principle;

    private Double highestValue;


}
