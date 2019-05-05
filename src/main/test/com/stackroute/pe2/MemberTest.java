package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    Member member;
    Member.MemberVariable member1;

    @Before
    public void setUp() throws Exception {
        member = new Member();
        member1 = member.new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {

        member = null;
    }

    @Test
    public void testMemberVariablesCheck()
    {
        String [] expectedValue = {"Harry Potter", "30", "2500.3"};

        String [] actualValue = member1.isMember("Harry Potter",30,2500.3);

        assertArrayEquals(expectedValue, actualValue);

        assertNotNull(actualValue);
    }
}