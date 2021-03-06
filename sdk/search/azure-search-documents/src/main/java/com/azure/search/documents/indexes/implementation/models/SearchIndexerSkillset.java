// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SearchIndexerSkillset model. */
@Fluent
public final class SearchIndexerSkillset {
    /*
     * The name of the skillset.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The description of the skillset.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A list of skills in the skillset.
     */
    @JsonProperty(value = "skills", required = true)
    private List<SearchIndexerSkill> skills;

    /*
     * Details about cognitive services to be used when running skills.
     */
    @JsonProperty(value = "cognitiveServices")
    private CognitiveServicesAccount cognitiveServicesAccount;

    /*
     * The ETag of the skillset.
     */
    @JsonProperty(value = "@odata.etag")
    private String eTag;

    /** Creates an instance of SearchIndexerSkillset class. */
    @JsonCreator
    public SearchIndexerSkillset(
            @JsonProperty(value = "name") String name,
            @JsonProperty(value = "skills") List<SearchIndexerSkill> skills) {
        this.name = name;
        this.skills = skills;
    }

    /**
     * Get the name property: The name of the skillset.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the skillset.
     *
     * @param name the name value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    /**
     * Get the description property: The description of the skillset.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the skillset.
     *
     * @param description the description value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the skills property: A list of skills in the skillset.
     *
     * @return the skills value.
     */
    public List<SearchIndexerSkill> getSkills() {
        return this.skills;
    }

    /**
     * Set the skills property: A list of skills in the skillset.
     *
     * @param skills the skills value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    /**
     * Get the cognitiveServicesAccount property: Details about cognitive services to be used when running skills.
     *
     * @return the cognitiveServicesAccount value.
     */
    public CognitiveServicesAccount getCognitiveServicesAccount() {
        return this.cognitiveServicesAccount;
    }

    /**
     * Set the cognitiveServicesAccount property: Details about cognitive services to be used when running skills.
     *
     * @param cognitiveServicesAccount the cognitiveServicesAccount value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setCognitiveServicesAccount(CognitiveServicesAccount cognitiveServicesAccount) {
        this.cognitiveServicesAccount = cognitiveServicesAccount;
        return this;
    }

    /**
     * Get the eTag property: The ETag of the skillset.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag of the skillset.
     *
     * @param eTag the eTag value to set.
     * @return the SearchIndexerSkillset object itself.
     */
    public SearchIndexerSkillset setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model SearchIndexerSkillset");
        }
        if (getSkills() == null) {
            throw new IllegalArgumentException("Missing required property skills in model SearchIndexerSkillset");
        } else {
            getSkills().forEach(e -> e.validate());
        }
        if (getCognitiveServicesAccount() != null) {
            getCognitiveServicesAccount().validate();
        }
    }
}
