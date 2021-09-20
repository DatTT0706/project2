package com.dattran.project2.entity.testlb;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Teacher {

    @NonNull
    private int id;

    private String name;


}
