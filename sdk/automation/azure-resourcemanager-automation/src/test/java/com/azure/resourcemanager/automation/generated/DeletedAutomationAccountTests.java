// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.models.DeletedAutomationAccount;
import org.junit.jupiter.api.Assertions;

public final class DeletedAutomationAccountTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeletedAutomationAccount model = BinaryData.fromString(
            "{\"properties\":{\"automationAccountResourceId\":\"xkxbhxvu\",\"automationAccountId\":\"ulgm\",\"location\":\"jevdyznf\",\"deletionTime\":\"2021-08-18T04:35:35Z\"},\"id\":\"kskmqozzkivyhjrl\",\"name\":\"zji\",\"type\":\"qfhefkwabsol\",\"location\":\"nqqlmgnl\"}")
            .toObject(DeletedAutomationAccount.class);
        Assertions.assertEquals("kskmqozzkivyhjrl", model.id());
        Assertions.assertEquals("zji", model.name());
        Assertions.assertEquals("qfhefkwabsol", model.type());
        Assertions.assertEquals("nqqlmgnl", model.location());
        Assertions.assertEquals("xkxbhxvu", model.automationAccountResourceId());
        Assertions.assertEquals("ulgm", model.automationAccountId());
        Assertions.assertEquals("jevdyznf", model.locationPropertiesLocation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeletedAutomationAccount model = new DeletedAutomationAccount().withId("kskmqozzkivyhjrl")
            .withName("zji")
            .withType("qfhefkwabsol")
            .withLocation("nqqlmgnl")
            .withAutomationAccountResourceId("xkxbhxvu")
            .withAutomationAccountId("ulgm")
            .withLocationPropertiesLocation("jevdyznf");
        model = BinaryData.fromObject(model).toObject(DeletedAutomationAccount.class);
        Assertions.assertEquals("kskmqozzkivyhjrl", model.id());
        Assertions.assertEquals("zji", model.name());
        Assertions.assertEquals("qfhefkwabsol", model.type());
        Assertions.assertEquals("nqqlmgnl", model.location());
        Assertions.assertEquals("xkxbhxvu", model.automationAccountResourceId());
        Assertions.assertEquals("ulgm", model.automationAccountId());
        Assertions.assertEquals("jevdyznf", model.locationPropertiesLocation());
    }
}
