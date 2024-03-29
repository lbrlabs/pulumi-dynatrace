// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.GenericTypesRulesRuleArgs;
import java.util.List;
import java.util.Objects;


public final class GenericTypesRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GenericTypesRulesArgs Empty = new GenericTypesRulesArgs();

    @Import(name="rules", required=true)
    private Output<List<GenericTypesRulesRuleArgs>> rules;

    public Output<List<GenericTypesRulesRuleArgs>> rules() {
        return this.rules;
    }

    private GenericTypesRulesArgs() {}

    private GenericTypesRulesArgs(GenericTypesRulesArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GenericTypesRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GenericTypesRulesArgs $;

        public Builder() {
            $ = new GenericTypesRulesArgs();
        }

        public Builder(GenericTypesRulesArgs defaults) {
            $ = new GenericTypesRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder rules(Output<List<GenericTypesRulesRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<GenericTypesRulesRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(GenericTypesRulesRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public GenericTypesRulesArgs build() {
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
