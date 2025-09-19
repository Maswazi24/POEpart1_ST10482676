/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthServiceTest {

    private AuthService authService;

    @BeforeEach
    void setUp() {
        authService = new AuthService();
    }

    @Test
    void testValidLogin() {
        assertTrue(authService.login("user", "pass"),
                "Login should succeed with correct credentials");
    }

    @Test
    void testInvalidLoginWrongPassword() {
        assertFalse(authService.login("user", "wrong"),
                "Login should fail with wrong password");
    }

    @Test
    void testInvalidLoginUnknownUser() {
        assertFalse(authService.login("unknown", "pass"),
                "Login should fail for unknown user");
    }

    @Test
    void testSignupWithValidDetails() {
        assertTrue(authService.signup("newUser", "secret123"),
                "Signup should succeed with valid details");
    }

    @Test
    void testSignupWithEmptyUsername() {
        assertFalse(authService.signup("", "secret123"),
                "Signup should fail if username is empty");
    }

    @Test
    void testSignupWithShortPassword() {
        assertFalse(authService.signup("newUser", "123"),
                "Signup should fail if password is too short");
    }
}


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

