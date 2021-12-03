package com.lab.application.models.dtos;

import com.lab.application.models.enums.MoneyManipulationColorEnum;
import com.lab.application.models.enums.MoneyManipulationTypeEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
public class MoneyManipulationDTO extends BaseEntityDTO
{
    private String entityUUID;
    private Date createDate;
    private BigDecimal moneyAmount;
    private MoneyManipulationTypeEnum type;
    private MoneyManipulationColorEnum color;
    private String description;
}
