// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.RunbookUpdateProperties;
import org.junit.jupiter.api.Assertions;

public final class RunbookUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RunbookUpdateProperties model = BinaryData
            .fromString(
                "{\"description\":\"h\",\"logVerbose\":true,\"logProgress\":true,\"logActivityTrace\":671944712}")
            .toObject(RunbookUpdateProperties.class);
        Assertions.assertEquals("h", model.description());
        Assertions.assertEquals(true, model.logVerbose());
        Assertions.assertEquals(true, model.logProgress());
        Assertions.assertEquals(671944712, model.logActivityTrace());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RunbookUpdateProperties model = new RunbookUpdateProperties().withDescription("h")
            .withLogVerbose(true)
            .withLogProgress(true)
            .withLogActivityTrace(671944712);
        model = BinaryData.fromObject(model).toObject(RunbookUpdateProperties.class);
        Assertions.assertEquals("h", model.description());
        Assertions.assertEquals(true, model.logVerbose());
        Assertions.assertEquals(true, model.logProgress());
        Assertions.assertEquals(671944712, model.logActivityTrace());
    }
}
