package kz.bitlab.academy.springfirstsprint.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private String name = "";
    private String surname = "";
    private int exam = 0;
    private String mark = "";
}
