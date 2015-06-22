package com.rafalkalita.users;

/**
 * A stub for userService
 */
public class StubUsersService implements UserService{
    @Override
    public long getId(String username) {

        switch (username) {
            case "John":
                return 5L;
            case "Maria":
                return 2L;
            default: return 0;
        }
    }
}
