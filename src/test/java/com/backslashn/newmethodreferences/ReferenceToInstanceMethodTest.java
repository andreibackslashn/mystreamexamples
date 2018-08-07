package com.backslashn.newmethodreferences;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ReferenceToInstanceMethodTest {

    @Test
    public void givenICallReferenceToInstanceMethodSameResultIsObtained() {

        User user1 = new User();
        User user2 = new User();
        User[] userArray = {user1};
        List<User> userList = Arrays.asList(userArray);

        user1.setName("Andrei1");
        user2.setName("Andrei2");

        boolean isLegalNameUsingFull = userList.stream().anyMatch(u -> u.isLegalName(u));
        //containingInstance::methodName
        User user = new User();
        boolean isLegalNameUsingReferenceToInstanceMethod = userList.stream().anyMatch(user::isLegalName);

        assertTrue(isLegalNameUsingFull);
        assertTrue(isLegalNameUsingReferenceToInstanceMethod);
    }
}
