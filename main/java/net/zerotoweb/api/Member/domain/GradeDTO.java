package net.zerotoweb.api.Member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class GradeDTO {
    private String name;
    private int kor;
    private int eng;
    private int math;
}
