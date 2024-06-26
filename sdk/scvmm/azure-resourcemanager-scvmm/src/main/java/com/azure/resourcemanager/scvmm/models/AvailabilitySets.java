// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AvailabilitySets. */
public interface AvailabilitySets {
    /**
     * Implements AvailabilitySet GET method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName Name of the AvailabilitySet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AvailabilitySets resource definition.
     */
    AvailabilitySet getByResourceGroup(String resourceGroupName, String availabilitySetName);

    /**
     * Implements AvailabilitySet GET method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName Name of the AvailabilitySet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AvailabilitySets resource definition along with {@link Response}.
     */
    Response<AvailabilitySet> getByResourceGroupWithResponse(
        String resourceGroupName, String availabilitySetName, Context context);

    /**
     * Deregisters the ScVmm availability set from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName Name of the AvailabilitySet.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String availabilitySetName, Boolean force);

    /**
     * Deregisters the ScVmm availability set from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName Name of the AvailabilitySet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String availabilitySetName);

    /**
     * Deregisters the ScVmm availability set from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName Name of the AvailabilitySet.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String availabilitySetName, Boolean force, Context context);

    /**
     * List of AvailabilitySets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AvailabilitySets as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailabilitySet> listByResourceGroup(String resourceGroupName);

    /**
     * List of AvailabilitySets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AvailabilitySets as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailabilitySet> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List of AvailabilitySets in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AvailabilitySets as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailabilitySet> list();

    /**
     * List of AvailabilitySets in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of AvailabilitySets as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailabilitySet> list(Context context);

    /**
     * Implements AvailabilitySet GET method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AvailabilitySets resource definition along with {@link Response}.
     */
    AvailabilitySet getById(String id);

    /**
     * Implements AvailabilitySet GET method.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AvailabilitySets resource definition along with {@link Response}.
     */
    Response<AvailabilitySet> getByIdWithResponse(String id, Context context);

    /**
     * Deregisters the ScVmm availability set from Azure.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deregisters the ScVmm availability set from Azure.
     *
     * @param id the resource ID.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Boolean force, Context context);

    /**
     * Begins definition for a new AvailabilitySet resource.
     *
     * @param name resource name.
     * @return the first stage of the new AvailabilitySet definition.
     */
    AvailabilitySet.DefinitionStages.Blank define(String name);
}
