package com.backslashn.newmethodreferences;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.assertTrue;

public class ReferenceToStaticMethodTest {

    @Test
    public void givenICallReferenceToStaticMethodSameResultIsObtained() {

        User user1 = new User();
        User user2 = new User();
        User[] userArray = {user1, user2};
        List<User> userList = Arrays.asList(userArray);

        boolean isRealUserUsingClassicPredicateInterfaceImpl = userList.stream().anyMatch(new Predicate<User>() {
            @Override
            public boolean test(User user) {
                return User.isRealUser(user);
            }
        });
        boolean isRealUser = userList.stream().anyMatch(u -> User.isRealUser(u));
//        ContainingClass::methodName.
        boolean isRealUserUsingRefernceToStaticMethod = userList.stream().anyMatch(User::isRealUser);

        assertTrue(isRealUserUsingClassicPredicateInterfaceImpl);
        assertTrue(isRealUser);
        assertTrue(isRealUserUsingRefernceToStaticMethod);

    }
}
