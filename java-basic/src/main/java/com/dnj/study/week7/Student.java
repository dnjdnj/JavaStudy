
package com.dnj.study.week7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/16
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student implements Comparable<Student>  {
    private String name;
    private Integer age;

    @Override
    public int compareTo(Student o) {
        return o.getAge().compareTo(this.getAge());


    }
}
