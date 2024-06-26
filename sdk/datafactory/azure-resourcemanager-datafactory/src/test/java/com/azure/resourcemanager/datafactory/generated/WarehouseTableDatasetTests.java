// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.WarehouseTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WarehouseTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WarehouseTableDataset model = BinaryData.fromString(
            "{\"type\":\"cht\",\"typeProperties\":{\"schema\":\"dataveidzwnkbjqpzmod\",\"table\":\"dataqux\"},\"description\":\"apewz\",\"structure\":\"datalbxmynslcvynavwt\",\"schema\":\"datasmczroddcaqimodn\",\"linkedServiceName\":{\"referenceName\":\"jmjxkhbucmz\",\"parameters\":{\"godjfyplavb\":\"datakfjacktavce\",\"bnzot\":\"datasecedsoqwexi\",\"jqdfadgywyla\":\"dataikf\"}},\"parameters\":{\"tdgj\":{\"type\":\"Object\",\"defaultValue\":\"datavohy\"}},\"annotations\":[\"datatkogfggylyzolrv\",\"datas\",\"dataseqjteoa\"],\"folder\":{\"name\":\"mg\"},\"\":{\"tarirdzdgvqofl\":\"datarjybpvsoba\",\"mzqsx\":\"dataukegougxpyp\"}}")
            .toObject(WarehouseTableDataset.class);
        Assertions.assertEquals("apewz", model.description());
        Assertions.assertEquals("jmjxkhbucmz", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("tdgj").type());
        Assertions.assertEquals("mg", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WarehouseTableDataset model
            = new WarehouseTableDataset().withDescription("apewz")
                .withStructure("datalbxmynslcvynavwt")
                .withSchema("datasmczroddcaqimodn")
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("jmjxkhbucmz")
                    .withParameters(mapOf("godjfyplavb", "datakfjacktavce", "bnzot", "datasecedsoqwexi", "jqdfadgywyla",
                        "dataikf")))
                .withParameters(mapOf("tdgj",
                    new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datavohy")))
                .withAnnotations(Arrays.asList("datatkogfggylyzolrv", "datas", "dataseqjteoa"))
                .withFolder(new DatasetFolder().withName("mg"))
                .withSchemaTypePropertiesSchema("dataveidzwnkbjqpzmod")
                .withTable("dataqux");
        model = BinaryData.fromObject(model).toObject(WarehouseTableDataset.class);
        Assertions.assertEquals("apewz", model.description());
        Assertions.assertEquals("jmjxkhbucmz", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("tdgj").type());
        Assertions.assertEquals("mg", model.folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
