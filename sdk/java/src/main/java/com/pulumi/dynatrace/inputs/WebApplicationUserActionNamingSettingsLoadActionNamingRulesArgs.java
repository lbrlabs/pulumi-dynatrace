// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleArgs;
import java.util.List;
import java.util.Objects;


public final class WebApplicationUserActionNamingSettingsLoadActionNamingRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebApplicationUserActionNamingSettingsLoadActionNamingRulesArgs Empty = new WebApplicationUserActionNamingSettingsLoadActionNamingRulesArgs();

    @Import(name="rules", required=true)
    private Output<List<WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleArgs>> rules;

    public Output<List<WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleArgs>> rules() {
        return this.rules;
    }

    private WebApplicationUserActionNamingSettingsLoadActionNamingRulesArgs() {}

    private WebApplicationUserActionNamingSettingsLoadActionNamingRulesArgs(WebApplicationUserActionNamingSettingsLoadActionNamingRulesArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebApplicationUserActionNamingSettingsLoadActionNamingRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebApplicationUserActionNamingSettingsLoadActionNamingRulesArgs $;

        public Builder() {
            $ = new WebApplicationUserActionNamingSettingsLoadActionNamingRulesArgs();
        }

        public Builder(WebApplicationUserActionNamingSettingsLoadActionNamingRulesArgs defaults) {
            $ = new WebApplicationUserActionNamingSettingsLoadActionNamingRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder rules(Output<List<WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(WebApplicationUserActionNamingSettingsLoadActionNamingRulesRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public WebApplicationUserActionNamingSettingsLoadActionNamingRulesArgs build() {
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
