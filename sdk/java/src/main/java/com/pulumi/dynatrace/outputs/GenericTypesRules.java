// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.GenericTypesRulesRule;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GenericTypesRules {
    private List<GenericTypesRulesRule> rules;

    private GenericTypesRules() {}
    public List<GenericTypesRulesRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericTypesRules defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GenericTypesRulesRule> rules;
        public Builder() {}
        public Builder(GenericTypesRules defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder rules(List<GenericTypesRulesRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GenericTypesRulesRule... rules) {
            return rules(List.of(rules));
        }
        public GenericTypesRules build() {
            final var o = new GenericTypesRules();
            o.rules = rules;
            return o;
        }
    }
}
