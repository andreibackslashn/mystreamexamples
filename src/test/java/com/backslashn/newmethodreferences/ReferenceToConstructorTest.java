package com.backslashn.newmethodreferences;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReferenceToConstructorTest {


    @Test
    public void givenICallReferenceToConstructor() {
        List<String> nameList = Arrays.asList("user1Name", "user2Name", "user3Name");

        Stream<User> stream = nameList.stream().map(name -> new User(name));
        Stream<User> streamUsingReferenceToConstructor = nameList.stream().map(User::new);

        stream.forEach(user -> System.out.println(user));
        streamUsingReferenceToConstructor.forEach(user -> System.out.println(user));


    }
}
