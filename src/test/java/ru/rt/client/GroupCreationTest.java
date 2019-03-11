package ru.rt.client;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroup() throws Exception {
        navToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupDate("GroupName", "Group Header", "Group Footer"));
        submitGroupCreation();
    }


}
