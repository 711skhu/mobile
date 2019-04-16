package com.shouwn.oj.model.entity.user;

import com.shouwn.oj.model.entity.building.Building;
import com.shouwn.oj.model.enums.RentDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest extends User{

    /*String buildingName;
    String code; //시설 코드*/

    Building building;

    RentDate rentDate;
    private String reason; //대여 이유
    private int number; //대여 인원
    private String  phone;
}
