// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of GitHubConnectors. */
public interface GitHubConnectors {
    /**
     * The listByResourceGroup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    PagedIterable<GitHubConnector> listByResourceGroup(String resourceGroupName);

    /**
     * The listByResourceGroup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    PagedIterable<GitHubConnector> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Returns a monitored GitHub Connector resource for a given ID.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an ARM resource for
     *     /subscriptions/xxx/resourceGroups/xxx/providers/Microsoft.SecurityDevOps/gitHubConnectors along with {@link
     *     Response}.
     */
    Response<GitHubConnector> getByResourceGroupWithResponse(String resourceGroupName, String gitHubConnectorName,
        Context context);

    /**
     * Returns a monitored GitHub Connector resource for a given ID.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an ARM resource for
     *     /subscriptions/xxx/resourceGroups/xxx/providers/Microsoft.SecurityDevOps/gitHubConnectors.
     */
    GitHubConnector getByResourceGroup(String resourceGroupName, String gitHubConnectorName);

    /**
     * Delete monitored GitHub Connector details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String gitHubConnectorName);

    /**
     * Delete monitored GitHub Connector details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param gitHubConnectorName Name of the GitHub Connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String gitHubConnectorName, Context context);

    /**
     * Returns a list of monitored GitHub Connectors.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    PagedIterable<GitHubConnector> list();

    /**
     * Returns a list of monitored GitHub Connectors.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    PagedIterable<GitHubConnector> list(Context context);

    /**
     * Returns a monitored GitHub Connector resource for a given ID.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an ARM resource for
     *     /subscriptions/xxx/resourceGroups/xxx/providers/Microsoft.SecurityDevOps/gitHubConnectors along with {@link
     *     Response}.
     */
    GitHubConnector getById(String id);

    /**
     * Returns a monitored GitHub Connector resource for a given ID.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an ARM resource for
     *     /subscriptions/xxx/resourceGroups/xxx/providers/Microsoft.SecurityDevOps/gitHubConnectors along with {@link
     *     Response}.
     */
    Response<GitHubConnector> getByIdWithResponse(String id, Context context);

    /**
     * Delete monitored GitHub Connector details.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete monitored GitHub Connector details.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new GitHubConnector resource.
     *
     * @param name resource name.
     * @return the first stage of the new GitHubConnector definition.
     */
    GitHubConnector.DefinitionStages.Blank define(String name);
}
