// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.resourcemanager.datalakeanalytics.models.AddDataLakeStoreParameters;

/**
 * Samples for DataLakeStoreAccounts Add.
 */
public final class DataLakeStoreAccountsAddSamples {
    /*
     * x-ms-original-file:
     * specification/datalake-analytics/resource-manager/Microsoft.DataLakeAnalytics/stable/2016-11-01/examples/
     * DataLakeStoreAccounts_Add.json
     */
    /**
     * Sample code: Adds a Data Lake Store account.
     * 
     * @param manager Entry point to DataLakeAnalyticsManager.
     */
    public static void
        addsADataLakeStoreAccount(com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager) {
        manager.dataLakeStoreAccounts()
            .addWithResponse("contosorg", "contosoadla", "test_adls_account",
                new AddDataLakeStoreParameters().withSuffix("test_suffix"), com.azure.core.util.Context.NONE);
    }
}
