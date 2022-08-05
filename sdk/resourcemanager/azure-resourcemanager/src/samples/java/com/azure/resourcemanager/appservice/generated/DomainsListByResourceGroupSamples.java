// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for Domains ListByResourceGroup. */
public final class DomainsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.DomainRegistration/stable/2022-03-01/examples/ListDomainsByResourceGroup.json
     */
    /**
     * Sample code: List domains by resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listDomainsByResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getDomains().listByResourceGroup("testrg123", Context.NONE);
    }
}