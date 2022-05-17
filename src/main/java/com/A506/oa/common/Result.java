package com.A506.oa.common;

import lombok.Data;

/**
 * @author 凉风
 * @create 2022-05-03 19:15
 */
@Data
public class Result {
    private String problem;
    private String user;
    private String comment;
    private String comment_user;
    private String object;
    private Integer problem_id;
}
