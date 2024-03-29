// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ManagementZoneV2RulesRuleArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementZoneV2RulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementZoneV2RulesArgs Empty = new ManagementZoneV2RulesArgs();

    /**
     * A management zone rule
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<ManagementZoneV2RulesRuleArgs>> rules;

    /**
     * @return A management zone rule
     * 
     */
    public Optional<Output<List<ManagementZoneV2RulesRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private ManagementZoneV2RulesArgs() {}

    private ManagementZoneV2RulesArgs(ManagementZoneV2RulesArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementZoneV2RulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementZoneV2RulesArgs $;

        public Builder() {
            $ = new ManagementZoneV2RulesArgs();
        }

        public Builder(ManagementZoneV2RulesArgs defaults) {
            $ = new ManagementZoneV2RulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rules A management zone rule
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<ManagementZoneV2RulesRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules A management zone rule
         * 
         * @return builder
         * 
         */
        public Builder rules(List<ManagementZoneV2RulesRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules A management zone rule
         * 
         * @return builder
         * 
         */
        public Builder rules(ManagementZoneV2RulesRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public ManagementZoneV2RulesArgs build() {
            return $;
        }
    }

}
