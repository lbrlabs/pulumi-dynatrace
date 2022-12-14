// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditions;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebApplicationUserActionNamingSettingsLoadActionNamingRulesRule {
    private @Nullable WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditions conditions;
    private String template;
    private @Nullable Boolean useOrConditions;

    private WebApplicationUserActionNamingSettingsLoadActionNamingRulesRule() {}
    public Optional<WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditions> conditions() {
        return Optional.ofNullable(this.conditions);
    }
    public String template() {
        return this.template;
    }
    public Optional<Boolean> useOrConditions() {
        return Optional.ofNullable(this.useOrConditions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationUserActionNamingSettingsLoadActionNamingRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditions conditions;
        private String template;
        private @Nullable Boolean useOrConditions;
        public Builder() {}
        public Builder(WebApplicationUserActionNamingSettingsLoadActionNamingRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.template = defaults.template;
    	      this.useOrConditions = defaults.useOrConditions;
        }

        @CustomType.Setter
        public Builder conditions(@Nullable WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleConditions conditions) {
            this.conditions = conditions;
            return this;
        }
        @CustomType.Setter
        public Builder template(String template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        @CustomType.Setter
        public Builder useOrConditions(@Nullable Boolean useOrConditions) {
            this.useOrConditions = useOrConditions;
            return this;
        }
        public WebApplicationUserActionNamingSettingsLoadActionNamingRulesRule build() {
            final var o = new WebApplicationUserActionNamingSettingsLoadActionNamingRulesRule();
            o.conditions = conditions;
            o.template = template;
            o.useOrConditions = useOrConditions;
            return o;
        }
    }
}
