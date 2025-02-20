// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionValueWithSecrets;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionValueWithoutSecrets;
import com.azure.resourcemanager.hybridnetwork.models.NfviType;
import com.azure.resourcemanager.hybridnetwork.models.OpenDeploymentResourceReference;
import com.azure.resourcemanager.hybridnetwork.models.SecretDeploymentResourceReference;
import java.util.Arrays;

/**
 * Samples for NetworkFunctions CreateOrUpdate.
 */
public final class NetworkFunctionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/AzureCore/
     * VirtualNetworkFunctionCreate.json
     */
    /**
     * Sample code: Create virtual network function resource on AzureCore.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void createVirtualNetworkFunctionResourceOnAzureCore(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.networkFunctions()
            .define("testNf")
            .withRegion("eastus")
            .withExistingResourceGroup("rg")
            .withProperties(new NetworkFunctionValueWithoutSecrets()
                .withNetworkFunctionDefinitionVersionResourceReference(new OpenDeploymentResourceReference().withId(
                    "/subscriptions/subid/resourcegroups/rg/providers/Microsoft.HybridNetwork/publishers/testVendor/networkFunctionDefinitionGroups/testnetworkFunctionDefinitionGroupName/networkFunctionDefinitionVersions/1.0.1"))
                .withNfviType(NfviType.AZURE_CORE)
                .withNfviId("/subscriptions/subid/resourceGroups/testResourceGroup")
                .withAllowSoftwareUpdate(false)
                .withDeploymentValues(
                    "{\"virtualMachineName\":\"test-VM\",\"cpuCores\":4,\"memorySizeGB\":8,\"cloudServicesNetworkAttachment\":{\"attachedNetworkId\":\"test-csnet\",\"ipAllocationMethod\":\"Dynamic\",\"networkAttachmentName\":\"test-cs-vlan\"},\"networkAttachments\":[{\"attachedNetworkId\":\"test-l3vlan\",\"defaultGateway\":\"True\",\"ipAllocationMethod\":\"Dynamic\",\"networkAttachmentName\":\"test-vlan\"}],\"sshPublicKeys\":[{\"keyData\":\"ssh-rsa CMIIIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEA0TqlveKKlc2MFvEmuXJiLGBsY1t4ML4uiRADGSZlnc+7Ugv3h+MCjkkwOKiOdsNo8k4KSBIG5GcQfKYOOd17AJvqCL6cGQbaLuqv0a64jeDm8oO8/xN/IM0oKw7rMr/2oAJOgIsfeXPkRxWWic9AVIS++H5Qi2r7bUFX+cqFsyUCAwEBBQ==\"}],\"storageProfile\":{\"osDisk\":{\"createOption\":\"Ephemeral\",\"deleteOption\":\"Delete\",\"diskSizeGB\":10}},\"userData\":\"testUserData\",\"adminUsername\":\"testUser\",\"virtioInterface\":\"Transitional\",\"isolateEmulatorThread\":\"False\",\"bootMethod\":\"BIOS\",\"placementHints\":[]}"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * NetworkFunctionFirstPartyCreate.json
     */
    /**
     * Sample code: Create first party network function resource.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void
        createFirstPartyNetworkFunctionResource(com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.networkFunctions()
            .define("testNf")
            .withRegion("eastus")
            .withExistingResourceGroup("rg")
            .withProperties(new NetworkFunctionValueWithoutSecrets()
                .withNetworkFunctionDefinitionVersionResourceReference(new SecretDeploymentResourceReference().withId(
                    "/subscriptions/subid/resourcegroups/rg/providers/Microsoft.HybridNetwork/publishers/testVendor/networkFunctionDefinitionGroups/testnetworkFunctionDefinitionGroupName/networkFunctionDefinitionVersions/1.0.1"))
                .withNfviType(NfviType.AZURE_ARC_KUBERNETES)
                .withNfviId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testResourceGroup/providers/Microsoft.ExtendedLocation/customLocations/testCustomLocation")
                .withAllowSoftwareUpdate(false)
                .withRoleOverrideValues(Arrays.asList(
                    "{\"name\":\"testRoleOne\",\"deployParametersMappingRuleProfile\":{\"helmMappingRuleProfile\":{\"helmPackageVersion\":\"2.1.3\",\"values\":\"{\\\"roleOneParam\\\":\\\"roleOneOverrideValue\\\"}\"}}}",
                    "{\"name\":\"testRoleTwo\",\"deployParametersMappingRuleProfile\":{\"helmMappingRuleProfile\":{\"releaseName\":\"overrideReleaseName\",\"releaseNamespace\":\"overrideNamespace\",\"values\":\"{\\\"roleTwoParam\\\":\\\"roleTwoOverrideValue\\\"}\"}}}"))
                .withDeploymentValues("{\"releaseName\":\"testReleaseName\",\"namespace\":\"testNamespace\"}"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * NetworkFunctionCreate.json
     */
    /**
     * Sample code: Create network function resource.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void
        createNetworkFunctionResource(com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.networkFunctions()
            .define("testNf")
            .withRegion("eastus")
            .withExistingResourceGroup("rg")
            .withProperties(new NetworkFunctionValueWithoutSecrets()
                .withNetworkFunctionDefinitionVersionResourceReference(new OpenDeploymentResourceReference().withId(
                    "/subscriptions/subid/resourcegroups/rg/providers/Microsoft.HybridNetwork/publishers/testVendor/networkFunctionDefinitionGroups/testnetworkFunctionDefinitionGroupName/networkFunctionDefinitionVersions/1.0.1"))
                .withNfviType(NfviType.AZURE_ARC_KUBERNETES)
                .withNfviId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testResourceGroup/providers/Microsoft.ExtendedLocation/customLocations/testCustomLocation")
                .withAllowSoftwareUpdate(false)
                .withRoleOverrideValues(Arrays.asList(
                    "{\"name\":\"testRoleOne\",\"deployParametersMappingRuleProfile\":{\"helmMappingRuleProfile\":{\"helmPackageVersion\":\"2.1.3\",\"values\":\"{\\\"roleOneParam\\\":\\\"roleOneOverrideValue\\\"}\"}}}",
                    "{\"name\":\"testRoleTwo\",\"deployParametersMappingRuleProfile\":{\"helmMappingRuleProfile\":{\"releaseName\":\"overrideReleaseName\",\"releaseNamespace\":\"overrideNamespace\",\"values\":\"{\\\"roleTwoParam\\\":\\\"roleTwoOverrideValue\\\"}\"}}}"))
                .withDeploymentValues("{\"releaseName\":\"testReleaseName\",\"namespace\":\"testNamespace\"}"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * NetworkFunctionCreateSecret.json
     */
    /**
     * Sample code: Create network function resource with secrets.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void
        createNetworkFunctionResourceWithSecrets(com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.networkFunctions()
            .define("testNf")
            .withRegion("eastus")
            .withExistingResourceGroup("rg")
            .withProperties(new NetworkFunctionValueWithSecrets()
                .withNetworkFunctionDefinitionVersionResourceReference(new OpenDeploymentResourceReference().withId(
                    "/subscriptions/subid/resourcegroups/rg/providers/Microsoft.HybridNetwork/publishers/testVendor/networkFunctionDefinitionGroups/testnetworkFunctionDefinitionGroupName/networkFunctionDefinitionVersions/1.0.1"))
                .withNfviType(NfviType.AZURE_ARC_KUBERNETES)
                .withNfviId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testResourceGroup/providers/Microsoft.ExtendedLocation/customLocations/testCustomLocation")
                .withAllowSoftwareUpdate(false)
                .withRoleOverrideValues(Arrays.asList(
                    "{\"name\":\"testRoleOne\",\"deployParametersMappingRuleProfile\":{\"helmMappingRuleProfile\":{\"helmPackageVersion\":\"2.1.3\",\"values\":\"{\\\"roleOneParam\\\":\\\"roleOneOverrideValue\\\"}\"}}}",
                    "{\"name\":\"testRoleTwo\",\"deployParametersMappingRuleProfile\":{\"helmMappingRuleProfile\":{\"releaseName\":\"overrideReleaseName\",\"releaseNamespace\":\"overrideNamespace\",\"values\":\"{\\\"roleTwoParam\\\":\\\"roleTwoOverrideValue\\\"}\"}}}"))
                .withSecretDeploymentValues("fakeTokenPlaceholder"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * AzureOperatorNexus/VirtualNetworkFunctionCreate.json
     */
    /**
     * Sample code: Create virtual network function resource on AzureOperatorNexus.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void createVirtualNetworkFunctionResourceOnAzureOperatorNexus(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.networkFunctions()
            .define("testNf")
            .withRegion("eastus")
            .withExistingResourceGroup("rg")
            .withProperties(new NetworkFunctionValueWithoutSecrets()
                .withNetworkFunctionDefinitionVersionResourceReference(new OpenDeploymentResourceReference().withId(
                    "/subscriptions/subid/resourcegroups/rg/providers/Microsoft.HybridNetwork/publishers/testVendor/networkFunctionDefinitionGroups/testnetworkFunctionDefinitionGroupName/networkFunctionDefinitionVersions/1.0.1"))
                .withNfviType(NfviType.AZURE_OPERATOR_NEXUS)
                .withNfviId(
                    "/subscriptions/subid/resourceGroups/testResourceGroup/providers/Microsoft.ExtendedLocation/customLocations/testCustomLocation")
                .withAllowSoftwareUpdate(false)
                .withDeploymentValues(
                    "{\"virtualMachineName\":\"test-VM\",\"extendedLocationName\":\"test-cluster\",\"cpuCores\":4,\"memorySizeGB\":8,\"cloudServicesNetworkAttachment\":{\"attachedNetworkId\":\"test-csnet\",\"ipAllocationMethod\":\"Dynamic\",\"networkAttachmentName\":\"test-cs-vlan\"},\"networkAttachments\":[{\"attachedNetworkId\":\"test-l3vlan\",\"defaultGateway\":\"True\",\"ipAllocationMethod\":\"Dynamic\",\"networkAttachmentName\":\"test-vlan\"}],\"sshPublicKeys\":[{\"keyData\":\"ssh-rsa CMIIIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEA0TqlveKKlc2MFvEmuXJiLGBsY1t4ML4uiRADGSZlnc+7Ugv3h+MCjkkwOKiOdsNo8k4KSBIG5GcQfKYOOd17AJvqCL6cGQbaLuqv0a64jeDm8oO8/xN/IM0oKw7rMr/2oAJOgIsfeXPkRxWWic9AVIS++H5Qi2r7bUFX+cqFsyUCAwEBBQ==\"}],\"storageProfile\":{\"osDisk\":{\"createOption\":\"Ephemeral\",\"deleteOption\":\"Delete\",\"diskSizeGB\":10}},\"userData\":\"testUserData\",\"adminUsername\":\"testUser\",\"virtioInterface\":\"Transitional\",\"isolateEmulatorThread\":\"False\",\"bootMethod\":\"BIOS\",\"placementHints\":[]}"))
            .create();
    }
}
