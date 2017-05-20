/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tilde.simpleregextester;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author janis.slapins
 */
public class UserFormTest {
    private static UserForm f;

    @BeforeClass
    public static void initUserForm() {
        f = new UserForm();
    }

    @Test
    public void testHasEscapeSequence(){
        Assert.assertFalse(f.HasEscapeSequence(""));
        Assert.assertFalse(f.HasEscapeSequence("\\s"));
        Assert.assertTrue(f.HasEscapeSequence("\\"));
        Assert.assertFalse(f.HasEscapeSequence("\\\\"));
        Assert.assertFalse(f.HasEscapeSequence("\\ "));
        Assert.assertTrue(f.HasEscapeSequence("abc\\\\\\"));
    }

    @Test
    public void testGetRegexGroups() {
        String rx = "a(bc)d(e)f";
        Assert.assertEquals(new ArrayList<>(Arrays.asList("a(bc)d(e)f", "(bc)", "(e)")), f.GetRegexGroups(rx));
        rx = "a(b(c)de)f";
        Assert.assertEquals(new ArrayList<>(Arrays.asList("a(b(c)de)f", "(b(c)de)", "(c)")), f.GetRegexGroups(rx));
    }
}
