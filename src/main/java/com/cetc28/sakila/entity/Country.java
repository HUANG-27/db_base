package com.cetc28.sakila.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author cetc28
 * @since 2021-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "country_id", type = IdType.AUTO)
    private Integer countryId;

    private String country;

    private LocalDateTime lastUpdate;


}
