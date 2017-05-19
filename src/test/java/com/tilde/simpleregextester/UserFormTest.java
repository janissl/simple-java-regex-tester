/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tilde.simpleregextester;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author janis.slapins
 */
public class UserFormTest {
    @Test
    public void testHasEscapeSequence(){
        UserForm f = new UserForm();
        Assert.assertFalse(f.HasEscapeSequence(""));
        Assert.assertFalse(f.HasEscapeSequence("\\s"));
        Assert.assertTrue(f.HasEscapeSequence("\\"));
        Assert.assertFalse(f.HasEscapeSequence("\\\\"));
        Assert.assertFalse(f.HasEscapeSequence("\\ "));
        Assert.assertTrue(f.HasEscapeSequence("abc\\\\\\"));
    }
}
