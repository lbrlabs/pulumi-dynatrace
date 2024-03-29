// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ManagementZoneV2RulesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementZoneV2Args extends com.pulumi.resources.ResourceArgs {

    public static final ManagementZoneV2Args Empty = new ManagementZoneV2Args();

    /**
     * Description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of this setting when referred to by the Config REST API V1
     * 
     */
    @Import(name="legacyId")
    private @Nullable Output<String> legacyId;

    /**
     * @return The ID of this setting when referred to by the Config REST API V1
     * 
     */
    public Optional<Output<String>> legacyId() {
        return Optional.ofNullable(this.legacyId);
    }

    /**
     * **Be careful when renaming** - if there are policies that are referencing this Management zone, they will need to be adapted to the new name!
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return **Be careful when renaming** - if there are policies that are referencing this Management zone, they will need to be adapted to the new name!
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Rules
     * 
     */
    @Import(name="rules")
    private @Nullable Output<ManagementZoneV2RulesArgs> rules;

    /**
     * @return Rules
     * 
     */
    public Optional<Output<ManagementZoneV2RulesArgs>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private ManagementZoneV2Args() {}

    private ManagementZoneV2Args(ManagementZoneV2Args $) {
        this.description = $.description;
        this.legacyId = $.legacyId;
        this.name = $.name;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementZoneV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementZoneV2Args $;

        public Builder() {
            $ = new ManagementZoneV2Args();
        }

        public Builder(ManagementZoneV2Args defaults) {
            $ = new ManagementZoneV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param legacyId The ID of this setting when referred to by the Config REST API V1
         * 
         * @return builder
         * 
         */
        public Builder legacyId(@Nullable Output<String> legacyId) {
            $.legacyId = legacyId;
            return this;
        }

        /**
         * @param legacyId The ID of this setting when referred to by the Config REST API V1
         * 
         * @return builder
         * 
         */
        public Builder legacyId(String legacyId) {
            return legacyId(Output.of(legacyId));
        }

        /**
         * @param name **Be careful when renaming** - if there are policies that are referencing this Management zone, they will need to be adapted to the new name!
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name **Be careful when renaming** - if there are policies that are referencing this Management zone, they will need to be adapted to the new name!
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rules Rules
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<ManagementZoneV2RulesArgs> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Rules
         * 
         * @return builder
         * 
         */
        public Builder rules(ManagementZoneV2RulesArgs rules) {
            return rules(Output.of(rules));
        }

        public ManagementZoneV2Args build() {
            return $;
        }
    }

}
