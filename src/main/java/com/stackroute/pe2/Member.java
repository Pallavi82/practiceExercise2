package com.stackroute.pe2;

public class Member {

        class  MemberVariable {
            String name;

            public String[] isMember(String name, int age, double salary) {
                String [] arr={name,String.valueOf(age),String.valueOf(salary)};
                return arr;
            }
        }
}
