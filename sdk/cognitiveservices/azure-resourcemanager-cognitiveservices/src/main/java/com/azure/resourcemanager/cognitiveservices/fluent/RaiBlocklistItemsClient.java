// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cognitiveservices.fluent.models.RaiBlocklistInner;
import com.azure.resourcemanager.cognitiveservices.fluent.models.RaiBlocklistItemInner;
import com.azure.resourcemanager.cognitiveservices.models.RaiBlocklistItemBulkRequest;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in RaiBlocklistItemsClient.
 */
public interface RaiBlocklistItemsClient {
    /**
     * Gets the blocklist items associated with the custom blocklist.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the blocklist items associated with the custom blocklist as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RaiBlocklistItemInner> list(String resourceGroupName, String accountName, String raiBlocklistName);

    /**
     * Gets the blocklist items associated with the custom blocklist.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the blocklist items associated with the custom blocklist as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RaiBlocklistItemInner> list(String resourceGroupName, String accountName, String raiBlocklistName,
        Context context);

    /**
     * Gets the specified custom blocklist Item associated with the custom blocklist.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param raiBlocklistItemName The name of the RaiBlocklist Item associated with the custom blocklist.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom blocklist Item associated with the custom blocklist along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RaiBlocklistItemInner> getWithResponse(String resourceGroupName, String accountName,
        String raiBlocklistName, String raiBlocklistItemName, Context context);

    /**
     * Gets the specified custom blocklist Item associated with the custom blocklist.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param raiBlocklistItemName The name of the RaiBlocklist Item associated with the custom blocklist.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom blocklist Item associated with the custom blocklist.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RaiBlocklistItemInner get(String resourceGroupName, String accountName, String raiBlocklistName,
        String raiBlocklistItemName);

    /**
     * Update the state of specified blocklist item associated with the Azure OpenAI account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param raiBlocklistItemName The name of the RaiBlocklist Item associated with the custom blocklist.
     * @param raiBlocklistItem Properties describing the custom blocklist.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services RaiBlocklist Item along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RaiBlocklistItemInner> createOrUpdateWithResponse(String resourceGroupName, String accountName,
        String raiBlocklistName, String raiBlocklistItemName, RaiBlocklistItemInner raiBlocklistItem, Context context);

    /**
     * Update the state of specified blocklist item associated with the Azure OpenAI account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param raiBlocklistItemName The name of the RaiBlocklist Item associated with the custom blocklist.
     * @param raiBlocklistItem Properties describing the custom blocklist.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services RaiBlocklist Item.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RaiBlocklistItemInner createOrUpdate(String resourceGroupName, String accountName, String raiBlocklistName,
        String raiBlocklistItemName, RaiBlocklistItemInner raiBlocklistItem);

    /**
     * Deletes the specified blocklist Item associated with the custom blocklist.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param raiBlocklistItemName The name of the RaiBlocklist Item associated with the custom blocklist.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName,
        String raiBlocklistName, String raiBlocklistItemName);

    /**
     * Deletes the specified blocklist Item associated with the custom blocklist.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param raiBlocklistItemName The name of the RaiBlocklist Item associated with the custom blocklist.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName,
        String raiBlocklistName, String raiBlocklistItemName, Context context);

    /**
     * Deletes the specified blocklist Item associated with the custom blocklist.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param raiBlocklistItemName The name of the RaiBlocklist Item associated with the custom blocklist.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String raiBlocklistName, String raiBlocklistItemName);

    /**
     * Deletes the specified blocklist Item associated with the custom blocklist.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param raiBlocklistItemName The name of the RaiBlocklist Item associated with the custom blocklist.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String raiBlocklistName, String raiBlocklistItemName,
        Context context);

    /**
     * Batch operation to add blocklist items.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param raiBlocklistItems Properties describing the custom blocklist items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services RaiBlocklist along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RaiBlocklistInner> batchAddWithResponse(String resourceGroupName, String accountName,
        String raiBlocklistName, List<RaiBlocklistItemBulkRequest> raiBlocklistItems, Context context);

    /**
     * Batch operation to add blocklist items.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param raiBlocklistItems Properties describing the custom blocklist items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services RaiBlocklist.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RaiBlocklistInner batchAdd(String resourceGroupName, String accountName, String raiBlocklistName,
        List<RaiBlocklistItemBulkRequest> raiBlocklistItems);

    /**
     * Batch operation to delete blocklist items.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param raiBlocklistItemsNames List of RAI Blocklist Items Names.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> batchDeleteWithResponse(String resourceGroupName, String accountName, String raiBlocklistName,
        Object raiBlocklistItemsNames, Context context);

    /**
     * Batch operation to delete blocklist items.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
     * @param raiBlocklistItemsNames List of RAI Blocklist Items Names.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void batchDelete(String resourceGroupName, String accountName, String raiBlocklistName,
        Object raiBlocklistItemsNames);
}
