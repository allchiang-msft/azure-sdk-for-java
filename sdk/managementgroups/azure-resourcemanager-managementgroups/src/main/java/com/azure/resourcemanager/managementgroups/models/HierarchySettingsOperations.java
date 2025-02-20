// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of HierarchySettingsOperations.
 */
public interface HierarchySettingsOperations {
    /**
     * Gets all the hierarchy settings defined at the Management Group level. Settings can only be set on the root
     * Management Group of the hierarchy.
     * 
     * @param groupId Management Group ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the hierarchy settings defined at the Management Group level along with {@link Response}.
     */
    Response<HierarchySettingsList> listWithResponse(String groupId, Context context);

    /**
     * Gets all the hierarchy settings defined at the Management Group level. Settings can only be set on the root
     * Management Group of the hierarchy.
     * 
     * @param groupId Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the hierarchy settings defined at the Management Group level.
     */
    HierarchySettingsList list(String groupId);

    /**
     * Gets the hierarchy settings defined at the Management Group level. Settings can only be set on the root
     * Management Group of the hierarchy.
     * 
     * @param groupId Management Group ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the hierarchy settings defined at the Management Group level along with {@link Response}.
     */
    Response<HierarchySettings> getWithResponse(String groupId, Context context);

    /**
     * Gets the hierarchy settings defined at the Management Group level. Settings can only be set on the root
     * Management Group of the hierarchy.
     * 
     * @param groupId Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the hierarchy settings defined at the Management Group level.
     */
    HierarchySettings get(String groupId);

    /**
     * Creates or updates the hierarchy settings defined at the Management Group level.
     * 
     * @param groupId Management Group ID.
     * @param createTenantSettingsRequest Tenant level settings request parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return settings defined at the Management Group scope along with {@link Response}.
     */
    Response<HierarchySettings> createOrUpdateWithResponse(String groupId,
        CreateOrUpdateSettingsRequest createTenantSettingsRequest, Context context);

    /**
     * Creates or updates the hierarchy settings defined at the Management Group level.
     * 
     * @param groupId Management Group ID.
     * @param createTenantSettingsRequest Tenant level settings request parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return settings defined at the Management Group scope.
     */
    HierarchySettings createOrUpdate(String groupId, CreateOrUpdateSettingsRequest createTenantSettingsRequest);

    /**
     * Updates the hierarchy settings defined at the Management Group level.
     * 
     * @param groupId Management Group ID.
     * @param createTenantSettingsRequest Tenant level settings request parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return settings defined at the Management Group scope along with {@link Response}.
     */
    Response<HierarchySettings> updateWithResponse(String groupId,
        CreateOrUpdateSettingsRequest createTenantSettingsRequest, Context context);

    /**
     * Updates the hierarchy settings defined at the Management Group level.
     * 
     * @param groupId Management Group ID.
     * @param createTenantSettingsRequest Tenant level settings request parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return settings defined at the Management Group scope.
     */
    HierarchySettings update(String groupId, CreateOrUpdateSettingsRequest createTenantSettingsRequest);

    /**
     * Deletes the hierarchy settings defined at the Management Group level.
     * 
     * @param groupId Management Group ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String groupId, Context context);

    /**
     * Deletes the hierarchy settings defined at the Management Group level.
     * 
     * @param groupId Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String groupId);
}
