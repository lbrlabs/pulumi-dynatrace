// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditions;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebApplicationUserActionNamingSettingsXhrActionNamingRulesRule {
    private @Nullable WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditions conditions;
    private String template;
    private @Nullable Boolean useOrConditions;

    private WebApplicationUserActionNamingSettingsXhrActionNamingRulesRule() {}
    public Optional<WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditions> conditions() {
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

    public static Builder builder(WebApplicationUserActionNamingSettingsXhrActionNamingRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditions conditions;
        private String template;
        private @Nullable Boolean useOrConditions;
        public Builder() {}
        public Builder(WebApplicationUserActionNamingSettingsXhrActionNamingRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.template = defaults.template;
    	      this.useOrConditions = defaults.useOrConditions;
        }

        @CustomType.Setter
        public Builder conditions(@Nullable WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditions conditions) {
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
        public WebApplicationUserActionNamingSettingsXhrActionNamingRulesRule build() {
            final var o = new WebApplicationUserActionNamingSettingsXhrActionNamingRulesRule();
            o.conditions = conditions;
            o.template = template;
            o.useOrConditions = useOrConditions;
            return o;
        }
    }
}
