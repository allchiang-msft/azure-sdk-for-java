// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.quota.fluent.models.GroupQuotasEnforcementResponseInner;

/**
 * An instance of this class provides access to all the operations defined in GroupQuotaLocationSettingsClient.
 */
public interface GroupQuotaLocationSettingsClient {
    /**
     * Enables the GroupQuotas enforcement settings for the resource provider and the location specified.
     * 
     * Enables the GroupQuotas enforcement for the resource provider and the location specified. The resource provider
     * will start using the group quotas as the overall quota for the subscriptions included in the GroupQuota. The
     * subscriptions cannot request quota at subscription level.
     * The subscriptions share the GroupQuotaLimits assigned to the GroupQuota. If the GroupQuotaLimits is used, then
     * submit a groupQuotaLimit request for the specific resource - provider/location/resource.
     * Once the GroupQuota Enforcement is enabled then, it cannot be deleted or reverted back. To disable GroupQuota
     * Enforcement -
     * 1. Remove all the subscriptions from the groupQuota using the delete API for Subscriptions (Check the example -
     * GroupQuotaSubscriptions_Delete).
     * 2. Ten delete the GroupQuota (Check the example - GroupQuotas_Delete).
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the GroupQuota Enforcement status for a Azure Location/Region.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProxyResource>, ProxyResource> beginCreateOrUpdate(String managementGroupId,
        String groupQuotaName, String resourceProviderName, String location);

    /**
     * Enables the GroupQuotas enforcement settings for the resource provider and the location specified.
     * 
     * Enables the GroupQuotas enforcement for the resource provider and the location specified. The resource provider
     * will start using the group quotas as the overall quota for the subscriptions included in the GroupQuota. The
     * subscriptions cannot request quota at subscription level.
     * The subscriptions share the GroupQuotaLimits assigned to the GroupQuota. If the GroupQuotaLimits is used, then
     * submit a groupQuotaLimit request for the specific resource - provider/location/resource.
     * Once the GroupQuota Enforcement is enabled then, it cannot be deleted or reverted back. To disable GroupQuota
     * Enforcement -
     * 1. Remove all the subscriptions from the groupQuota using the delete API for Subscriptions (Check the example -
     * GroupQuotaSubscriptions_Delete).
     * 2. Ten delete the GroupQuota (Check the example - GroupQuotas_Delete).
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param location The name of the Azure region.
     * @param locationSettings The GroupQuota body details for creation or update of a GroupQuota entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the GroupQuota Enforcement status for a Azure Location/Region.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProxyResource>, ProxyResource> beginCreateOrUpdate(String managementGroupId,
        String groupQuotaName, String resourceProviderName, String location,
        GroupQuotasEnforcementResponseInner locationSettings, Context context);

    /**
     * Enables the GroupQuotas enforcement settings for the resource provider and the location specified.
     * 
     * Enables the GroupQuotas enforcement for the resource provider and the location specified. The resource provider
     * will start using the group quotas as the overall quota for the subscriptions included in the GroupQuota. The
     * subscriptions cannot request quota at subscription level.
     * The subscriptions share the GroupQuotaLimits assigned to the GroupQuota. If the GroupQuotaLimits is used, then
     * submit a groupQuotaLimit request for the specific resource - provider/location/resource.
     * Once the GroupQuota Enforcement is enabled then, it cannot be deleted or reverted back. To disable GroupQuota
     * Enforcement -
     * 1. Remove all the subscriptions from the groupQuota using the delete API for Subscriptions (Check the example -
     * GroupQuotaSubscriptions_Delete).
     * 2. Ten delete the GroupQuota (Check the example - GroupQuotas_Delete).
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GroupQuota Enforcement status for a Azure Location/Region.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProxyResource createOrUpdate(String managementGroupId, String groupQuotaName, String resourceProviderName,
        String location);

    /**
     * Enables the GroupQuotas enforcement settings for the resource provider and the location specified.
     * 
     * Enables the GroupQuotas enforcement for the resource provider and the location specified. The resource provider
     * will start using the group quotas as the overall quota for the subscriptions included in the GroupQuota. The
     * subscriptions cannot request quota at subscription level.
     * The subscriptions share the GroupQuotaLimits assigned to the GroupQuota. If the GroupQuotaLimits is used, then
     * submit a groupQuotaLimit request for the specific resource - provider/location/resource.
     * Once the GroupQuota Enforcement is enabled then, it cannot be deleted or reverted back. To disable GroupQuota
     * Enforcement -
     * 1. Remove all the subscriptions from the groupQuota using the delete API for Subscriptions (Check the example -
     * GroupQuotaSubscriptions_Delete).
     * 2. Ten delete the GroupQuota (Check the example - GroupQuotas_Delete).
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param location The name of the Azure region.
     * @param locationSettings The GroupQuota body details for creation or update of a GroupQuota entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GroupQuota Enforcement status for a Azure Location/Region.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProxyResource createOrUpdate(String managementGroupId, String groupQuotaName, String resourceProviderName,
        String location, GroupQuotasEnforcementResponseInner locationSettings, Context context);

    /**
     * Enables the GroupQuotas enforcement settings for the resource provider and the location specified.
     * 
     * Enables the GroupQuotas enforcement for the resource provider and the location specified. The resource provider
     * will start using the group quotas as the overall quota for the subscriptions included in the GroupQuota. The
     * subscriptions cannot request quota at subscription level.
     * The subscriptions share the GroupQuotaLimits assigned to the GroupQuota. If the GroupQuotaLimits is used, then
     * submit a groupQuotaLimit request for the specific resource - provider/location/resource.
     * Once the GroupQuota Enforcement is enabled then, it cannot be deleted or reverted back. To disable GroupQuota
     * Enforcement -
     * 1. Remove all the subscriptions from the groupQuota using the delete API for Subscriptions (Check the example -
     * GroupQuotaSubscriptions_Delete).
     * 2. Ten delete the GroupQuota (Check the example - GroupQuotas_Delete).
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the GroupQuota Enforcement status for a Azure Location/Region.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GroupQuotasEnforcementResponseInner>, GroupQuotasEnforcementResponseInner>
        beginUpdate(String managementGroupId, String groupQuotaName, String resourceProviderName, String location);

    /**
     * Enables the GroupQuotas enforcement settings for the resource provider and the location specified.
     * 
     * Enables the GroupQuotas enforcement for the resource provider and the location specified. The resource provider
     * will start using the group quotas as the overall quota for the subscriptions included in the GroupQuota. The
     * subscriptions cannot request quota at subscription level.
     * The subscriptions share the GroupQuotaLimits assigned to the GroupQuota. If the GroupQuotaLimits is used, then
     * submit a groupQuotaLimit request for the specific resource - provider/location/resource.
     * Once the GroupQuota Enforcement is enabled then, it cannot be deleted or reverted back. To disable GroupQuota
     * Enforcement -
     * 1. Remove all the subscriptions from the groupQuota using the delete API for Subscriptions (Check the example -
     * GroupQuotaSubscriptions_Delete).
     * 2. Ten delete the GroupQuota (Check the example - GroupQuotas_Delete).
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param location The name of the Azure region.
     * @param locationSettings The GroupQuota body details for creation or update of a GroupQuota entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the GroupQuota Enforcement status for a Azure Location/Region.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GroupQuotasEnforcementResponseInner>, GroupQuotasEnforcementResponseInner> beginUpdate(
        String managementGroupId, String groupQuotaName, String resourceProviderName, String location,
        GroupQuotasEnforcementResponseInner locationSettings, Context context);

    /**
     * Enables the GroupQuotas enforcement settings for the resource provider and the location specified.
     * 
     * Enables the GroupQuotas enforcement for the resource provider and the location specified. The resource provider
     * will start using the group quotas as the overall quota for the subscriptions included in the GroupQuota. The
     * subscriptions cannot request quota at subscription level.
     * The subscriptions share the GroupQuotaLimits assigned to the GroupQuota. If the GroupQuotaLimits is used, then
     * submit a groupQuotaLimit request for the specific resource - provider/location/resource.
     * Once the GroupQuota Enforcement is enabled then, it cannot be deleted or reverted back. To disable GroupQuota
     * Enforcement -
     * 1. Remove all the subscriptions from the groupQuota using the delete API for Subscriptions (Check the example -
     * GroupQuotaSubscriptions_Delete).
     * 2. Ten delete the GroupQuota (Check the example - GroupQuotas_Delete).
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GroupQuota Enforcement status for a Azure Location/Region.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GroupQuotasEnforcementResponseInner update(String managementGroupId, String groupQuotaName,
        String resourceProviderName, String location);

    /**
     * Enables the GroupQuotas enforcement settings for the resource provider and the location specified.
     * 
     * Enables the GroupQuotas enforcement for the resource provider and the location specified. The resource provider
     * will start using the group quotas as the overall quota for the subscriptions included in the GroupQuota. The
     * subscriptions cannot request quota at subscription level.
     * The subscriptions share the GroupQuotaLimits assigned to the GroupQuota. If the GroupQuotaLimits is used, then
     * submit a groupQuotaLimit request for the specific resource - provider/location/resource.
     * Once the GroupQuota Enforcement is enabled then, it cannot be deleted or reverted back. To disable GroupQuota
     * Enforcement -
     * 1. Remove all the subscriptions from the groupQuota using the delete API for Subscriptions (Check the example -
     * GroupQuotaSubscriptions_Delete).
     * 2. Ten delete the GroupQuota (Check the example - GroupQuotas_Delete).
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param location The name of the Azure region.
     * @param locationSettings The GroupQuota body details for creation or update of a GroupQuota entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GroupQuota Enforcement status for a Azure Location/Region.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GroupQuotasEnforcementResponseInner update(String managementGroupId, String groupQuotaName,
        String resourceProviderName, String location, GroupQuotasEnforcementResponseInner locationSettings,
        Context context);

    /**
     * Gets the GroupQuotas enforcement settings for the resource provider/location.
     * 
     * Gets the GroupQuotas enforcement settings for the ResourceProvider/location. The locations, where GroupQuota
     * enforcement is not enabled will return Not Found.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param location The name of the Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GroupQuotas enforcement settings for the ResourceProvider/location along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GroupQuotasEnforcementResponseInner> getWithResponse(String managementGroupId, String groupQuotaName,
        String resourceProviderName, String location, Context context);

    /**
     * Gets the GroupQuotas enforcement settings for the resource provider/location.
     * 
     * Gets the GroupQuotas enforcement settings for the ResourceProvider/location. The locations, where GroupQuota
     * enforcement is not enabled will return Not Found.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GroupQuotas enforcement settings for the ResourceProvider/location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GroupQuotasEnforcementResponseInner get(String managementGroupId, String groupQuotaName,
        String resourceProviderName, String location);

    /**
     * Returns a list of the Azure regions settings, where the GroupQuotas enforcement is enabled.
     * 
     * Returns only the list of the Azure regions settings, where the GroupQuotas enforcement is enabled. The locations
     * not included in GroupQuota Enforcement will not be listed, the regions in failed status with listed as status
     * Failed.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Azure regions, where the group quotas is enabled for enforcement as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GroupQuotasEnforcementResponseInner> list(String managementGroupId, String groupQuotaName,
        String resourceProviderName);

    /**
     * Returns a list of the Azure regions settings, where the GroupQuotas enforcement is enabled.
     * 
     * Returns only the list of the Azure regions settings, where the GroupQuotas enforcement is enabled. The locations
     * not included in GroupQuota Enforcement will not be listed, the regions in failed status with listed as status
     * Failed.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Azure regions, where the group quotas is enabled for enforcement as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GroupQuotasEnforcementResponseInner> list(String managementGroupId, String groupQuotaName,
        String resourceProviderName, Context context);
}
