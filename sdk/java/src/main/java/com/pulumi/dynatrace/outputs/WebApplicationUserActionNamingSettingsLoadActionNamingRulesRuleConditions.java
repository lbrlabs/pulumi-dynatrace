// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditionsCondition;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditions {
    private List<WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditionsCondition> conditions;

    private WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditions() {}
    public List<WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditionsCondition> conditions() {
        return this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditionsCondition> conditions;
        public Builder() {}
        public Builder(WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        @CustomType.Setter
        public Builder conditions(List<WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditionsCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditionsCondition... conditions) {
            return conditions(List.of(conditions));
        }
        public WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditions build() {
            final var o = new WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditions();
            o.conditions = conditions;
            return o;
        }
    }
}
