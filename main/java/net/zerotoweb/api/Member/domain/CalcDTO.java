package net.zerotoweb.api.Member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CalcDTO {
    private int num1;
    private int num2;
    private String opcode;
}
