package com.samirovic.springswagger2;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder @ToString
public class Person {

    private Long id;
    private String firstName;
    private String lastName;

}
