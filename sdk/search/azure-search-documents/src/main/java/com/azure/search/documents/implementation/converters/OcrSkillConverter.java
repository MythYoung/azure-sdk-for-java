// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.search.documents.indexes.models.InputFieldMappingEntry;
import com.azure.search.documents.indexes.models.OcrSkill;
import com.azure.search.documents.indexes.models.OcrSkillLanguage;
import com.azure.search.documents.indexes.models.OutputFieldMappingEntry;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.indexes.implementation.models.OcrSkill} and {@link OcrSkill}.
 */
public final class OcrSkillConverter {
    /**
     * Maps from {@link com.azure.search.documents.indexes.implementation.models.OcrSkill} to {@link OcrSkill}.
     */
    public static OcrSkill map(com.azure.search.documents.indexes.implementation.models.OcrSkill obj) {
        if (obj == null) {
            return null;
        }

        List<OutputFieldMappingEntry> outputs = obj.getOutputs() == null ? null
            : obj.getOutputs().stream().map(OutputFieldMappingEntryConverter::map).collect(Collectors.toList());

        List<InputFieldMappingEntry> inputs = obj.getInputs() == null ? null
            : obj.getInputs().stream().map(InputFieldMappingEntryConverter::map).collect(Collectors.toList());
        OcrSkill ocrSkill = new OcrSkill(inputs, outputs);

        String name = obj.getName();
        ocrSkill.setName(name);

        String context = obj.getContext();
        ocrSkill.setContext(context);

        String description = obj.getDescription();
        ocrSkill.setDescription(description);


        if (obj.getDefaultLanguageCode() != null) {
            OcrSkillLanguage defaultLanguageCode = OcrSkillLanguageConverter.map(obj.getDefaultLanguageCode());
            ocrSkill.setDefaultLanguageCode(defaultLanguageCode);
        }

        Boolean shouldDetectOrientation = obj.isShouldDetectOrientation();
        ocrSkill.setShouldDetectOrientation(shouldDetectOrientation);
        return ocrSkill;
    }

    /**
     * Maps from {@link OcrSkill} to {@link com.azure.search.documents.indexes.implementation.models.OcrSkill}.
     */
    public static com.azure.search.documents.indexes.implementation.models.OcrSkill map(OcrSkill obj) {
        if (obj == null) {
            return null;
        }

        List<com.azure.search.documents.indexes.implementation.models.OutputFieldMappingEntry> outputs =
            obj.getOutputs() == null ? null
                : obj.getOutputs().stream().map(OutputFieldMappingEntryConverter::map).collect(Collectors.toList());
        List<com.azure.search.documents.indexes.implementation.models.InputFieldMappingEntry> inputs =
            obj.getInputs().stream().map(InputFieldMappingEntryConverter::map).collect(Collectors.toList());

        com.azure.search.documents.indexes.implementation.models.OcrSkill ocrSkill =
            new com.azure.search.documents.indexes.implementation.models.OcrSkill(inputs, outputs);

        String name = obj.getName();
        ocrSkill.setName(name);

        String context = obj.getContext();
        ocrSkill.setContext(context);

        String description = obj.getDescription();
        ocrSkill.setDescription(description);

        if (obj.getDefaultLanguageCode() != null) {
            com.azure.search.documents.indexes.implementation.models.OcrSkillLanguage defaultLanguageCode =
                OcrSkillLanguageConverter.map(obj.getDefaultLanguageCode());
            ocrSkill.setDefaultLanguageCode(defaultLanguageCode);
        }

        Boolean shouldDetectOrientation = obj.setShouldDetectOrientation();
        ocrSkill.setShouldDetectOrientation(shouldDetectOrientation);
        ocrSkill.validate();
        return ocrSkill;
    }

    private OcrSkillConverter() {
    }
}
