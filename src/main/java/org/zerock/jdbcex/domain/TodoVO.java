package org.zerock.jdbcex.domain;

import lombok.*;

import javax.servlet.annotation.WebServlet;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class TodoVO {

    private Long tno;

    private String title;

    private LocalDate dueDate;

    private boolean finished;


}
