package com.rafalkalita.users;

import javax.inject.Singleton;

/**
 * A stub for userService
 */
@Singleton
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
