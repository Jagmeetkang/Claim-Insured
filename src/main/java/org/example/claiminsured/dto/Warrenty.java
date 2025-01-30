package org.example.claiminsured.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class Warrenty {

    private Integer id;
    private String warrentyDuretion;
    private Integer months;
    private Integer price;
}
