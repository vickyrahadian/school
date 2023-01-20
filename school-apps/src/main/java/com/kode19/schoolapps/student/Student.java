package com.kode19.schoolapps.student;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Student {
    private Long id;
    private String name;
    private String email;
    private Gender gender;
}
