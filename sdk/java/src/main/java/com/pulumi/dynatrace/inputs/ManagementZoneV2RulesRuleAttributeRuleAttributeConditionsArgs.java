// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsConditionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs Empty = new ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs();

    @Import(name="conditions")
    private @Nullable Output<List<ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsConditionArgs>> conditions;

    public Optional<Output<List<ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    private ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs() {}

    private ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs(ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs $) {
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs $;

        public Builder() {
            $ = new ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs();
        }

        public Builder(ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs defaults) {
            $ = new ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditions(@Nullable Output<List<ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs build() {
            return $;
        }
    }

}
