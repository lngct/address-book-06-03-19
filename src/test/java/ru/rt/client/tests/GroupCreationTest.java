package ru.rt.client.tests;

import org.testng.annotations.Test;
import ru.rt.client.model.GroupDate;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroup() throws Exception {
        app.navToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupDate("GroupName", "Group Header", "Group Footer"));
        app.submitGroupCreation();
    }


}
