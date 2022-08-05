// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for WorkflowTriggerHistories Get. */
public final class WorkflowTriggerHistoriesGetSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/WorkflowTriggerHistories_Get.json
     */
    /**
     * Sample code: Get a workflow trigger history.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAWorkflowTriggerHistory(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWorkflowTriggerHistories()
            .getWithResponse(
                "testResourceGroup",
                "test-name",
                "testWorkflowName",
                "testTriggerName",
                "08586676746934337772206998657CU22",
                Context.NONE);
    }
}