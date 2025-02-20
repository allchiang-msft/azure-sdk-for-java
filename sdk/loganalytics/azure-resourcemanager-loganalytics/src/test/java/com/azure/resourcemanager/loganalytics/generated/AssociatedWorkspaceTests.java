// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.loganalytics.models.AssociatedWorkspace;

public final class AssociatedWorkspaceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AssociatedWorkspace model = BinaryData.fromString(
            "{\"workspaceId\":\"pagao\",\"workspaceName\":\"ulpqblylsyxkqjn\",\"resourceId\":\"ervtiagxs\",\"associateDate\":\"zuempsbzkf\"}")
            .toObject(AssociatedWorkspace.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AssociatedWorkspace model = new AssociatedWorkspace();
        model = BinaryData.fromObject(model).toObject(AssociatedWorkspace.class);
    }
}
